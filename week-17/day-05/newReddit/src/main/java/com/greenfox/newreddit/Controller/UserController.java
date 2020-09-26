package com.greenfox.newreddit.Controller;

import com.greenfox.newreddit.Model.User;
import com.greenfox.newreddit.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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

    /*Registration*/

    @GetMapping("/registration")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "registrationForm";
    }

    @PostMapping("/registration")
    public Object submitRegistrationForm(@ModelAttribute User user) {
        if (this.userService.userNameExists(user.getName())) {
            return "redirect:/user/registration?errorExistingUsername";
        } else if (!this.userService.matchingPasswords(user.getPassword(), user.getPasswordMatch())) {
            return "redirect:/user/registration?errorNotMatchingPasswords";
        } else {
            this.userService.saveNewUser(user);
            return "redirect:/user/registration?succes";
        }
    }

    /*Login*/

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "loginForm";
    }
    @PostMapping("/login")
    public Object submitLoginForm(@ModelAttribute User user) {
        User currentUser = this.userService.getUserByName(user.getName());
        if (currentUser == null) {
            return "redirect:/user/login?errorInvalidUsername";
        } else if (!currentUser.getEmail().equals(user.getEmail())){
            return "redirect:/user/login?errorInvalidEmail";
        } else if (!currentUser.getPassword().equals(user.getPassword())) {
            return "redirect:/user/login?errorInvalidPassword";
        } else {
            return "redirect:/post/" + currentUser.getId();
        }
    }


}
