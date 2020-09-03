package com.greenfox.programmerfoxclub.Controller;

import com.greenfox.programmerfoxclub.Model.Drink;
import com.greenfox.programmerfoxclub.Model.Food;
import com.greenfox.programmerfoxclub.Model.Fox;
import com.greenfox.programmerfoxclub.Model.Trick;
import com.greenfox.programmerfoxclub.Service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

    FoxService foxService;

    @Autowired
    public FoxController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/nutritionStore")
    public String getNutrition(Model model, @RequestParam String name){
        model.addAttribute("fox", foxService.getFoxByName(name));
        return "nutritionStore";
    }

    @PostMapping("/nutritionStore")
    public String setNutrition(@RequestParam String name, @RequestParam Food food, @RequestParam Drink drink){
        Fox fox = foxService.getFoxByName(name);
        fox.setFood(food);
        fox.setDrink(drink);
        return "redirect:/?name=" + name;
    }

    @GetMapping("/trickCenter")
    public String getTrickCenter(Model model, @RequestParam String name){
        model.addAttribute("fox", foxService.getFoxByName(name));
        model.addAttribute("tricks", foxService.availableTricks(name));
        model.addAttribute("learnedTricks", foxService.learnedTricks(name));
        return "trickCenter";
    }

    @PostMapping("/trickCenter")
    public String setTrickCenter(@RequestParam String name, @RequestParam Trick trick){
        Fox fox = foxService.getFoxByName(name);
        foxService.addNewTrick(name, trick);
        return "redirect:/?name=" + name;
    }

}
