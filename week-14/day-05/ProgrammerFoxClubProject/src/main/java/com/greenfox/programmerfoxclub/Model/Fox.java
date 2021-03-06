package com.greenfox.programmerfoxclub.Model;

import java.util.ArrayList;
import java.util.List;

public class Fox {

    private String name;
    private List<Trick> tricks;
    private Food food;
    private Drink drink;

    public Fox(String name) {
        this(name, new ArrayList<>(), Food.lemon, Drink.tea);
    }

    public Fox(String name, List<Trick> tricks, Food food, Drink drink) {
        this.name = name;
        this.tricks = tricks;
        this.food = food;
        this.drink = drink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Trick> getTricks() {
        return tricks;
    }

    public void setTricks(List<Trick> tricks) {
        this.tricks = tricks;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public void addTrick (Trick trick) {
        if (this.tricks.contains(trick) != true) {
            this.tricks.add(trick);
        }
    }

}
