package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Car.Type[] types = Car.Type.values();
        Car.Color[] colors = Car.Color.values();
        int lengthOfType = types.length;
        int lengthOfColor = colors.length;

        ArrayList<Car.Type> vehiclesByType = new ArrayList<>();
        ArrayList<Car.Color> vehiclesByColor = new ArrayList<>();

        ArrayList<Car.Type> sedan = new ArrayList<>();
        ArrayList<Car.Type> minivan = new ArrayList<>();
        ArrayList<Car.Type> crossover = new ArrayList<>();
        ArrayList<Car.Type> pickup = new ArrayList<>();

        ArrayList<Car.Color> blue = new ArrayList<>();
        ArrayList<Car.Color> pink = new ArrayList<>();
        ArrayList<Car.Color> silver = new ArrayList<>();
        ArrayList<Car.Color> white = new ArrayList<>();
        ArrayList<Car.Color> yellow = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 256; i++) {
            vehiclesByType.add(i, types[random.nextInt(lengthOfType)]);
            vehiclesByColor.add(i, colors[random.nextInt(lengthOfColor)]);
        }


        for (int i = 0; i < vehiclesByType.size(); i++) {
            switch (vehiclesByType.get(i)) {
                case SEDAN:
                    sedan.add(vehiclesByType.get(i));
                    vehiclesByType.remove(i);
                    break;
                case MINIVAN:
                    minivan.add(vehiclesByType.get(i));
                    vehiclesByType.remove(i);
                    break;
                case CROSSOVER:
                    crossover.add(vehiclesByType.get(i));
                    vehiclesByType.remove(i);
                    break;
                case PICKUP:
                    pickup.add(vehiclesByType.get(i));
                    vehiclesByType.remove(i);
                    break;
            }
        }

        for (int i = 0; i < vehiclesByColor.size(); i++) {
            switch (vehiclesByColor.get(i)) {
                case BLUE:
                    blue.add(vehiclesByColor.get(i));
                    break;
                case PINK:
                    pink.add(vehiclesByColor.get(i));
                    break;
                case SILVER:
                    silver.add(vehiclesByColor.get(i));
                    break;
                case WHITE:
                    white.add(vehiclesByColor.get(i));
                    break;
                case YELLOW:
                    yellow.add(vehiclesByColor.get(i));
                    break;
            }
        }

        System.out.println("Cars by type:");
        System.out.println("Number of cars of type " + types[0] + " is " + sedan.size());
        System.out.println("Number of cars of type " + types[1] + " is " + minivan.size());
        System.out.println("Number of cars of type " + types[2] + " is " + crossover.size());
        System.out.println("Number of cars of type " + types[3] + " is " + pickup.size());

        System.out.println("\nCars by color:");
        System.out.println("Number of cars " + colors[0] + " color is " + blue.size());
        System.out.println("Number of cars " + colors[1] + " color is " + pink.size());
        System.out.println("Number of cars " + colors[2] + " color is " + silver.size());
        System.out.println("Number of cars " + colors[3] + " color is " + white.size());
        System.out.println("Number of cars " + colors[4] + " color is " + yellow.size());


    }
}