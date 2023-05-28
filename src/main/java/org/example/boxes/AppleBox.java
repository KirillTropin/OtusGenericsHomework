package org.example.boxes;

import org.example.exceptions.EmptyBoxException;
import org.example.exceptions.FullBoxException;
import org.example.fruits.Apple;

import java.util.ArrayList;
import java.util.List;

public class AppleBox extends Box {
    private int capacity = Dimension.MEDIUM;
    private List<Apple> apples = new ArrayList<>();
    public AppleBox(List<Apple> fruits) {
        super(Dimension.MEDIUMWEIGHT, Dimension.MEDIUM, fruits);
    }

    @Override
    public double weight() throws EmptyBoxException {
        return super.weight();
    }

    @Override
    public boolean eq(Box box) {
        return super.eq(box);
    }
}
