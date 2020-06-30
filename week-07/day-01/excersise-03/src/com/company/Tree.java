package com.company;

public class Tree extends Garden {

    Tree(String color) {
        super.setColor(color);
        super.setName("Tree");
        super.setAmountOfWater(0);
    }

    @Override
    public void info() {
        if (super.getAmountOfWater() < 10) {
            System.out.println("The " + super.getColor() + " " + super.getName() + " needs water");
        } else {
            System.out.println("The " + super.getColor() + " " + super.getName() + " doesn't need water");
        }
    }

    @Override
    public void waterPlants(double amountOfWater) {
        amountOfWater = (amountOfWater / 100) * 40;
        super.setAmountOfWater(super.getAmountOfWater() + amountOfWater);
    }

}
