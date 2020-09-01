package com.greenfox.programmerfoxclub.Repository;

import com.greenfox.programmerfoxclub.Model.Fox;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
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
                .anyMatch(fox -> fox.getName().equals(name));
    }

}
