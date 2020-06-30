package com.company;

public class Flower extends Garden {

    Flower(String color) {
        super.setColor(color);
        super.setName("Flower");
        super.setAmountOfWater(0);
    }


    @Override
    public void info() {
        if (super.getAmountOfWater() < 5) {
            System.out.println("The " + super.getColor() + " " + super.getName() + " needs water");
        } else {
            System.out.println("The " + super.getColor() + " " + super.getName() + " doesn't need water");
        }
    }

    @Override
    public void waterPlants(double amountOfWater) {
        amountOfWater = (amountOfWater / 100) * 75;
        super.setAmountOfWater(super.getAmountOfWater() + amountOfWater);
    }

}
