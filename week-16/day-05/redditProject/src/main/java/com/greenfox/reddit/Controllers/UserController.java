package com.greenfox.reddit.Controllers;

import com.greenfox.reddit.Model.User;
import com.greenfox.reddit.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/registration")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "registrationForm";
    }

    /*@ModelAttribute("user") //to, co uživatel vyplní v registračním formuláři, bude dosazeno do nového objektu userRegistrationDto
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }*/

    @PostMapping("/registration")
    public String registerUserAccount(@ModelAttribute("user") User user) { //pojí data z User s UserRegistrationDto
        this.userService.saveNewUser(user);
        return "redirect:/user/registration?succes";
    }

    @GetMapping("/login")
    public String loginForm(Model model){
        model.addAttribute("user", new User());
        return "loginForm";
    }

    @PostMapping("/login")
    public String findUserByUsername(@RequestParam String name, @RequestParam String password, Model model) {
        User user = this.userService.getUserByName(name);
        if (user == null) {
            return "redirect:/user/login?error=This username doesn't exist.";
        } else if (!this.userService.isPasswordValid(password, name)) {
            return "redirect:/user/login?error=Invalid password.";
        } else {
            return "redirect:/" + name;
        }
    }

    @GetMapping("/userInformation/{name}")
    public String userInformation(@PathVariable String name, Model model) {
        model.addAttribute("name", this.userService.getUserByName(name));
        return "userInformation";
    }




   /* @GetMapping("/login")
    public String loginForm(Model model){
        return "loginForm";
    }

    @PostMapping("/login")
    public String submitLoginForm(@RequestParam String username){
        User user = this.userService.getUserByName(username);
        return "redirect:/user/information/?name=" + username;
    }

    @GetMapping("/information/?name={username}")
    public String userInformation(Model model, @PathVariable String username) {
        model.addAttribute("user", this.userService.getUserByName(username));
        return "userInformation";
    }

    @GetMapping("/registration")
    public String registrationForm (Model model) {
        model.addAttribute("user", new User());
        return "registerPage";
    }

    @PostMapping("/registration")
    public String submitNewUser(@ModelAttribute("user") User user){
        this.userService.addUser(user);
        return "redirect:/user/login";
    }

   *//* @GetMapping("/user/registration")
    public String showRegistrationForm(Model model) {
        User user = new User();
        model.addAttribute(new User());
    }*/

}
