package com.company;

import java.util.ArrayList;

import static com.company.Car.Type.*;
import static com.company.Car.Color.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Car> vehicles = new ArrayList<>();

        for (int i = 0; i < 256; i++) {
            Car car = new Car();
            vehicles.add(i, car);
        }

        ArrayList<Car> sedan = new ArrayList<>();
        ArrayList<Car> minivan = new ArrayList<>();
        ArrayList<Car> crossover = new ArrayList<>();
        ArrayList<Car> pickup = new ArrayList<>();

        ArrayList<Car> blue = new ArrayList<>();
        ArrayList<Car> pink = new ArrayList<>();
        ArrayList<Car> silver = new ArrayList<>();
        ArrayList<Car> white = new ArrayList<>();
        ArrayList<Car> yellow = new ArrayList<>();

        for (int i = 0; i < vehicles.size(); i++) {
            switch (vehicles.get(i).getColor()) {
                case BLUE:
                    blue.add(vehicles.get(i));
                    break;
                case PINK:
                    pink.add(vehicles.get(i));
                    break;
                case SILVER:
                    silver.add(vehicles.get(i));
                    break;
                case WHITE:
                    white.add(vehicles.get(i));
                    break;
                case YELLOW:
                    yellow.add(vehicles.get(i));
                    break;
            }
            switch (vehicles.get(i).getType()) {
                case SEDAN:
                    sedan.add(vehicles.get(i));
                    break;
                case MINIVAN:
                    minivan.add(vehicles.get(i));
                    break;
                case CROSSOVER:
                    crossover.add(vehicles.get(i));
                    break;
                case PICKUP:
                    pickup.add(vehicles.get(i));
                    break;
            }
        }

        System.out.println("Cars by type:");
        System.out.println("Number of cars of type " + SEDAN + " is " + sedan.size());
        System.out.println("Number of cars of type " + MINIVAN + " is " + minivan.size());
        System.out.println("Number of cars of type " + CROSSOVER + " is " + crossover.size());
        System.out.println("Number of cars of type " + PICKUP + " is " + pickup.size());

        System.out.println("\nCars by color:");
        System.out.println("Number of cars " + BLUE + " color is " + blue.size());
        System.out.println("Number of cars " + PINK + " color is " + pink.size());
        System.out.println("Number of cars " + SILVER + " color is " + silver.size());
        System.out.println("Number of cars " + WHITE + " color is " + white.size());
        System.out.println("Number of cars " + YELLOW + " color is " + yellow.size());

    }
}
