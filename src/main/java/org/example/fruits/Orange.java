package org.example.fruits;

public class Orange extends Fruit{
    @Override
    public double getWeight() {
        return super.weight;
    }
    public Orange(double weight) {
        super(weight);
    }
}
