package org.example.fruits;

public class Apple extends Fruit {

    @Override
    public double getWeight() {
        return super.weight;
    }

    public Apple(double weight) {
        super(weight);
    }
}
