package com.greenfox.programmerfoxclub.Service;

import com.greenfox.programmerfoxclub.Model.Fox;
import com.greenfox.programmerfoxclub.Model.Trick;
import com.greenfox.programmerfoxclub.Repository.FoxRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class FoxService {

    FoxRepository foxRepository;

    public FoxService(FoxRepository foxRepository) { //dependency injection from FoxRepository
        this.foxRepository = foxRepository;
    }

    public Fox getFoxByName(String name) {
        if (foxRepository.containsFox(name) == false) {
            foxRepository.addNewFox(name);
        }
        return foxRepository.getFoxByName(name);
    }

    public void addNewFox(String name) {
        this.foxRepository.addNewFox(name);
    }

    public void addNewTrick(String name, Trick trick) {
            this.foxRepository.getFoxByName(name).addTrick(trick);
    }

    public List<Trick> availableTricks(String name) {
        return Arrays.stream(Trick.values())
                .filter(trick -> this.getFoxByName(name).getTricks().stream().noneMatch(knownTrick -> knownTrick == trick))
                .collect(Collectors.toList());
    }

    public List<Trick> learnedTricks(String name) {
        return this.foxRepository.learnedTricks(name);
    }

}
