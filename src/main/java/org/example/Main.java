package org.example;

import org.example.boxes.AppleBox;
import org.example.boxes.Box;
import org.example.boxes.OrangeBox;
import org.example.exceptions.FullBoxException;
import org.example.fruits.Apple;
import org.example.fruits.Fruit;
import org.example.fruits.Orange;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FullBoxException {
        List<Apple> appleList = new ArrayList<>(200);
        List<Apple> apples = new ArrayList<>(200);
        List<Orange> orangeList = new ArrayList<>(400);

        AppleBox appleBox = new AppleBox (appleList);
        AppleBox mackintoshBox = new AppleBox(apples);
        OrangeBox orangeBox = new OrangeBox(orangeList);
        List<Fruit> fruitList = List.of(new Apple(0.24), new Orange(0.356), new Orange(0.5), new Apple(1.0));
        Box box = new Box(fruitList);

        System.out.println("проверяем коробки:"+appleBox.eq(mackintoshBox));
        System.out.println("проверяем коробки:"+appleBox.eq(orangeBox));
        System.out.println("проверяем коробки:"+appleBox.eq(box));
    }
}