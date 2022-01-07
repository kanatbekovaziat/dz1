package com.company;

public final class Son extends Father {

    public Son(EyeColor color, String name, int age, Job job) {
        super(color, name, age, job);
    }

    @Override
    public String skillToPlayBasketball(int height, int numOfThreePointShots) {
        return super.skillToPlayBasketball(height, numOfThreePointShots);
    }
}
