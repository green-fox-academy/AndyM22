package com.greenfox.programmerfoxclub.Controller;

import com.greenfox.programmerfoxclub.Service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private final FoxService foxService;

    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/")
    public String mainPage(Model model, @RequestParam (required = false) String name){
        model.addAttribute("fox", foxService.getFoxByName(name));
        return "index";
    }

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(Model model, @RequestParam String addFox) {
        foxService.addNewFox(addFox);
        return "redirect:/?name=" + addFox;
    }

}
