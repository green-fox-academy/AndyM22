package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Greeting greeting() {
        Greeting greeting = new Greeting(1, "Hello, World!");
        return greeting;
    }

}
