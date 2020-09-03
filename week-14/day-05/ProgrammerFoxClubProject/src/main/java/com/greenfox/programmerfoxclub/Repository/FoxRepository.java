package com.greenfox.programmerfoxclub.Repository;

import com.greenfox.programmerfoxclub.Model.Drink;
import com.greenfox.programmerfoxclub.Model.Food;
import com.greenfox.programmerfoxclub.Model.Fox;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class FoxRepository {

    List<Fox> listOfFOxes;

    public FoxRepository() {
        this.listOfFOxes = new ArrayList<>();
    }

    public void addNewFox (String name) {
        this.listOfFOxes.add(new Fox(name));
    }

    public Fox getFoxByName(String name) {
        return this.listOfFOxes.stream()
                .filter(fox -> fox.getName().toLowerCase().equals(name.toLowerCase()))
                .findFirst()
                .get();
    }

    public boolean containsFox (String name) {
        return listOfFOxes.stream()
                .anyMatch(fox -> fox.getName().toLowerCase().equals(name.toLowerCase()));
    }

    public List<String> showFood () {
        return (List<String>) Arrays.stream(Food.values()).sorted();
    }

    public List<String> showDrink () {
        return (List<String>) Arrays.stream(Drink.values()).sorted();
    }

}
