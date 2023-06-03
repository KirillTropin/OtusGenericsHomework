package org.example.boxes;


import org.example.fruits.Orange;

import java.util.ArrayList;
import java.util.List;

public class OrangeBox extends Box{
    private List<Orange> oranges = new ArrayList<>();

    public OrangeBox(List fruits) {
        super(fruits);
    }

    @Override
    public double weight() {
        return super.weight();
    }

    @Override
    public boolean eq(Box box) {
        return super.eq(box);
    }

}
