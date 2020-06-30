package com.company;

public class Main {

    public static void main(String[] args) {

        Garden garden = new Garden();

        garden.addFlower("yellow");
        garden.addFlower("blue");
        garden.addTree("purple");
        garden.addTree("orange");

        garden.info();

        garden.waterPlants(40);
        garden.waterPlants(70);

    }
}
