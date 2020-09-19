package com.greenfox.frontend.Controllers;

import com.greenfox.frontend.Model.Doubler;
import com.greenfox.frontend.Model.Error;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

    @ResponseBody
    @GetMapping("/doubling")
    public Object getDoubling(@RequestParam(required = false) Long input) {

        if (input == null) {
            return new Error("Please provide an input!");
        } else {
            return new Doubler(input);
        }
    }

}
