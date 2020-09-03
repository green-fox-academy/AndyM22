package com.greenfox.programmerfoxclub.Service;

import com.greenfox.programmerfoxclub.Model.Fox;
import com.greenfox.programmerfoxclub.Model.Trick;
import com.greenfox.programmerfoxclub.Repository.FoxRepository;
import org.springframework.stereotype.Service;

import java.util.List;


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

    public void addTrick(String name, Trick trick) {
        if (this.foxRepository.availableTricks(name).contains(trick) == false) {
            this.foxRepository.getFoxByName(name).addTrick(trick);
        }
    }

}
