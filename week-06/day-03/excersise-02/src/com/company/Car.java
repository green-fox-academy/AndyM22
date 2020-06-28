package com.company;

import java.util.Random;

public class Car {

    public static enum Type {
        SEDAN, MINIVAN, CROSSOVER, PICKUP;
    }

    public static enum Color {
        BLUE, PINK, SILVER, WHITE, YELLOW;
    }

    Car.Type[] types = Car.Type.values();
    Car.Color[] colors = Car.Color.values();
    int lengthOfType = types.length;
    int lengthOfColor = colors.length;

    Random random = new Random();

    private final Type type;
    private final Color color;

    Car() {
        this.type = this.types[random.nextInt(lengthOfType)];
        this.color = this.colors[random.nextInt(lengthOfColor)];
    }

    public Type getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

}
