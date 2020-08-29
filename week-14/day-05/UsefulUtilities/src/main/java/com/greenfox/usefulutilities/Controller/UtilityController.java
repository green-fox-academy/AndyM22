package com.greenfox.usefulutilities.Controller;

import com.greenfox.usefulutilities.Service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {

    private final UtilityService utilityService;

    @Autowired
    public UtilityController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
    public String homePage(Model model) {
        return "index";
    }

    @GetMapping("/useful/colored")
    public String coloredBackground(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "colored";
    }

    @GetMapping("/useful/email")
    public String isEmailValid (Model model, @RequestParam(required = false) String email) {
        model.addAttribute("isValid", utilityService.validateEmail(email));
        model.addAttribute("email", email);
        return "email";
    }

    @GetMapping("useful/encode")
    public String encode (Model model, @RequestParam String text, @RequestParam int number) {
        model.addAttribute("encode", utilityService.caesar(text, number));
        return "encode";
    }

    @GetMapping("useful/decode")
    public String decode (Model model, @RequestParam String text, @RequestParam int number) {
        model.addAttribute("encode", utilityService.caesar(text, -number));
        return "encode";
    }

}
