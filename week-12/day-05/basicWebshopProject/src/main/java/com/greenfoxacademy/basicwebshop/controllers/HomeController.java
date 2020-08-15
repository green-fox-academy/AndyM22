package com.greenfoxacademy.basicwebshop.controllers;

import com.greenfoxacademy.basicwebshop.repository.ItemsStore;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    ItemsStore repository = new ItemsStore();

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("items", repository.getRepository());
        return "index";
    }

}
