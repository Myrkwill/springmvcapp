package ru.myrkwill.springmvcapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Mark Nagibin
 */
@Controller
public class HomeController {

    @GetMapping("/hello-world")
    public String sayHello() {
        return "home";
    }

}