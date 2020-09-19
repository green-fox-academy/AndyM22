package com.greenfox.frontend.Controllers;

import com.greenfox.frontend.Model.*;
import com.greenfox.frontend.Model.Error;
import com.greenfox.frontend.Model.Until;
import com.greenfox.frontend.Service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    private MainService mainService;

    @Autowired
    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

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

    @GetMapping("/greeter")
    @ResponseBody
    public Object greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (name == null && title == null) {
            return ResponseEntity.badRequest()
                    .body(new Error("Please provide a name and a title!"));
        } else if (name == null) {
            return ResponseEntity.badRequest()
                    .body(new Error("Please provide a name!"));
        } else if (title == null) {
            return ResponseEntity.badRequest()
                    .body(new Error("Please provide a title!"));
        } else {
            return new Greeter(name, title);
        }
    }

    @GetMapping("/appenda/{appendable}")
    @ResponseBody
    public Object append(@PathVariable(required = false) String appendable) {
        if (appendable == null) {
            return ResponseEntity.notFound();
        } else {
            return new Append(appendable);
        }
    }

    @PostMapping("/dountil/{action}")
    @ResponseBody
    public Object addNumber(@PathVariable String action, @RequestBody(required = false) Until until) {
        if (until == null) {
            return ResponseEntity.badRequest()
                    .body(new Error("Please provide a number!"));
        } else {
            return this.mainService.countUntil(until.getUntil(), action);
        }
    }


}
