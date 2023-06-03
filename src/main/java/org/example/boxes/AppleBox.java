package org.example.boxes;
import org.example.fruits.Apple;

import java.util.ArrayList;
import java.util.List;

public class AppleBox extends Box {
    private List<Apple> apples = new ArrayList<>();

    public AppleBox(List fruits){
        super(fruits);
    }

    public double weight(){
        return super.weight();
    }

    @Override
    public boolean eq(Box box) {
        return super.eq(box);
    }
}
