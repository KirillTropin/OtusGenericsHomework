package org.example.boxes;

import org.example.fruits.Fruit;
import java.util.List;

public class Box <T extends Fruit>{
    private List<T> fruits;

    public Box(List<T> fruits){
        this.fruits = fruits;
    }

    public double weight() {
        double weight = 0;
            for (int i=0;i<fruits.size();i++) {
                weight = fruits.get(i).getWeight() + weight;
            }
        return weight;
    }


    public boolean eq(Box<? super Fruit> box) {
        return ((this.weight() - box.weight())<0.001d)&&this.fruits.size()==box.fruits.size();
    }
}
