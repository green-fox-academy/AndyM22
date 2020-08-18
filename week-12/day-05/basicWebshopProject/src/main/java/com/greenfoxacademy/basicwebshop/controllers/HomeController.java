package com.greenfoxacademy.basicwebshop.controllers;

import com.greenfoxacademy.basicwebshop.repository.ItemsStore;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    ItemsStore repository = new ItemsStore();

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("items", repository.getRepository());
        return "index";
    }

    @GetMapping("/only-available")
    public String getOnlyAvailable(Model model) {
        model.addAttribute("items", repository.isAvailable());
        return "onlyAvailable";
    }

    @GetMapping("/clothes-and-shoes")
    public String getClothesAndShoes(Model model) {
        model.addAttribute("items", repository.clothesAndShoes());
        return "clothesAndShoes";
    }

    @GetMapping("/electronics")
    public String getElectronics(Model model) {
        model.addAttribute("items", repository.electronics());
        return "electronics";
    }

    @GetMapping("/beverages-and-snacks")
    public String getBeveragesAndSnacks(Model model) {
        model.addAttribute("items", repository.beveragesAndSnacks());
        return "beveragesAndSnacks";
    }

    @GetMapping("/sorted-by-cheapest")
    public String sortedByCheapest(Model model) {
        model.addAttribute("items", repository.orderCheapestFirst());
        return "sortedByCheapest";
    }

    @GetMapping("/contains-nike")
    public String containsNike(Model model) {
        model.addAttribute("items", repository.containsWord("nike"));
        return "containsNike";
    }

    @GetMapping("/average-stock")
    public String averageStock(Model model) {
        model.addAttribute("average", repository.averageOfStock());
        return "averageStock";
    }

    @GetMapping("/most-expensive")
    public String mostExpansive(Model model) {
        model.addAttribute("mostExpensive", repository.theMostExpansiveItem());
        return "mostExpensive";
    }

    @PostMapping("/search")
    public String search(Model model, @RequestParam String word) {
        model.addAttribute("items", repository.containsWord(word));
        return "search";
    }


}
