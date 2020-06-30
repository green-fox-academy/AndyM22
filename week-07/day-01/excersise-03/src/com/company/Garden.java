package com.company;

import java.util.ArrayList;

public class Garden {

    private String name;
    private String color;
    private ArrayList<Flower> flowers = new ArrayList<>();
    private ArrayList<Tree> trees = new ArrayList<>();
    private double amountOfWater;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAmountOfWater() {

        return amountOfWater;
    }

    public void setAmountOfWater(double amountOfWater) {

        this.amountOfWater = amountOfWater;
    }

    public void waterPlants(double amountOfWater) {

        System.out.println("\nWatering with " + (int) amountOfWater);

        int flowersThatNeedWater = 0;

        for (int i = 0; i < this.flowers.size(); i++) {
            if (this.flowers.get(i).getAmountOfWater() < 5) {
                flowersThatNeedWater += 1;
            }
        }

        int treesThatNeedWater = 0;

        for (int i = 0; i < this.trees.size(); i++) {
            if (this.trees.get(i).getAmountOfWater() < 10) {
                treesThatNeedWater += 1;
            }
        }

        int numberOfPlantsThatNeedToWater = flowersThatNeedWater + treesThatNeedWater;

        for (int i = 0; i < this.flowers.size(); i++) {
            if (this.flowers.get(i).getAmountOfWater() < 5) {
                this.flowers.get(i).waterPlants(amountOfWater / numberOfPlantsThatNeedToWater);
            }
        }

        for (int i = 0; i < this.trees.size(); i++) {
            if (this.trees.get(i).getAmountOfWater() < 10) {
                this.trees.get(i).waterPlants(amountOfWater / numberOfPlantsThatNeedToWater);
            }
        }

        info();

    }

    public void addFlower(String color) {
        this.flowers.add(new Flower(color));
    }

    public void addTree(String color) {
        this.trees.add(new Tree(color));
    }

    public void info() {

        for (int i = 0; i < this.flowers.size(); i++) {
            this.flowers.get(i).info();
        }

        for (int i = 0; i < this.trees.size(); i++) {
            this.trees.get(i).info();
        }

    }

}
