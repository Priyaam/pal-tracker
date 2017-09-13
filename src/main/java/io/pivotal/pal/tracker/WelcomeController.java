package io.pivotal.pal.tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by baveerap on 9/4/2017.
 */
@RestController
public class WelcomeController {
    @GetMapping("/")
    public String sayHello() {
        return "hello";
    }

}
