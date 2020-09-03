package com.greenfox.programmerfoxclub.Repository;

import com.greenfox.programmerfoxclub.Model.Fox;
import com.greenfox.programmerfoxclub.Model.Trick;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        return this.listOfFOxes.stream()
                .anyMatch(fox -> fox.getName().toLowerCase().equals(name.toLowerCase()));
    }

    public List<Trick> learnedTricks(String name) {
        return this.getFoxByName(name).getTricks();
    }


    /*public List<Trick> availableTricks (String name) {
        return Arrays.stream(Trick.values())
                .filter(trick -> this.getFoxByName(name).getTricks().stream().noneMatch(knownTrick -> knownTrick == trick))
                .collect(Collectors.toList());
    }*/

}
