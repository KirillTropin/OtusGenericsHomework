package org.example.boxes;


import org.example.exceptions.EmptyBoxException;
import org.example.fruits.Orange;

import java.util.ArrayList;
import java.util.List;

public class OrangeBox extends Box{
    private int capacity = Dimension.LARGE;
    private List<Orange> oranges = new ArrayList<>();
    public OrangeBox(List<Orange> fruits) {
        super(Dimension.LARGEWEIGHT, Dimension.LARGE, fruits);
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
