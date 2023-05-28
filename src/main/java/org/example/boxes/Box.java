package org.example.boxes;

import org.example.exceptions.EmptyBoxException;
import org.example.exceptions.FullBoxException;
import org.example.fruits.Apple;
import org.example.fruits.Fruit;
import org.example.fruits.Orange;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Box <T extends Fruit> implements Dimension{
    private double ownWeight = Dimension.SMALLWEIGHT;
    private int capacity = Dimension.SMALL;
    private List<T> fruits = new ArrayList<>();

    public Box(double ownWeight, int capacity) {
        this.ownWeight = ownWeight;
        this.capacity = capacity;
    }

    public Box(double ownWeight, int capacity, List<T> fruits) {
        this.ownWeight = ownWeight;
        this.capacity = capacity;
        this.fruits = fruits;
    }

    public Box() {}

    public Box(List<? super Fruit> fruits) throws FullBoxException {
        if (fruits.size()<=capacity) {
            Collections.copy(fruits, this.fruits);
        } else {
            throw new FullBoxException();
        }
    }

    public double weight() throws EmptyBoxException {
        double weight = ownWeight;
        if (fruits.isEmpty()) {
            throw new EmptyBoxException();
        } else if (fruits.stream().allMatch(fruit -> fruit instanceof Apple)||fruits.stream().allMatch(fruit -> fruit instanceof Orange)) {
            weight = fruits.size()*fruits.get(0).getWeight() + weight;
        } else {
            for (int i=0;i<fruits.size();i++) {
                weight = fruits.get(i).getWeight() + weight;
            }
        }

        return weight;
    }

    public void pushFruit(Fruit fruit) throws FullBoxException {
        if (fruits.size() < capacity) {
            fruits.add((T) fruit);
        } else {
          throw new FullBoxException();
        }
    }


    public boolean eq(Box<? super Fruit> box) {
        double firstWeight = this.ownWeight, secondWeight = box.ownWeight;

        try {
            firstWeight = this.weight();
        } catch (EmptyBoxException e) {
            System.out.println("this box empty: "+box.getClass().getSimpleName());
        }
        try {
            secondWeight = box.weight();
        } catch (EmptyBoxException e) {
            System.out.println("box2 empty: "+box.getClass().getSimpleName());
        }

        if (this.capacity==box.capacity&&firstWeight==secondWeight) {
            return true;
        } else {
            return false;
        }
    }
}
