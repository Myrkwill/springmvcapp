package ru.myrkwill.springmvcapp.conrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mark Nagibin
 */

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage() {
        System.out.println("HELLO!");
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage() {
        System.out.println("GOODBYE!");
        return "first/goodbye";
    }
}
