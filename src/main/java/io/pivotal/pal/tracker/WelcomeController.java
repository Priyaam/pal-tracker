package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @Value("${welcome_message}")
    private String message;


    @GetMapping("/")
    private String sayHello() {

        return message;
    }


}


