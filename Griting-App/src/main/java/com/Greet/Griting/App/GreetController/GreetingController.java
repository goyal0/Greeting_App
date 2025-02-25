package com.Greet.Griting.App.GreetController;

import com.Greet.Griting.App.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    public String getGreeting() {
        return "{\"message\": \"Hello World\"}";
    }

    @PostMapping
    public String postGreeting() {
        return "{\"message\": \"Greeting received!\"}";
    }

    @PutMapping
    public String putGreeting() {
        return "{\"message\": \"Greeting updated!\"}";
    }

    @DeleteMapping
    public String deleteGreeting() {
        return "{\"message\": \"Greeting deleted!\"}";
    }

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/service")
    public String greetingService() {
        return greetingService.greeting();
    }
}
