package org.example.fruits;

public abstract class Fruit {
    protected double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Fruit(double weight) {
        this.weight = weight;
    }
}
