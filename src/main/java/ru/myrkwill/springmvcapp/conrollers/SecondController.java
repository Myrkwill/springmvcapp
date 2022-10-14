package ru.myrkwill.springmvcapp.conrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Mark Nagibin
 */

@Controller
public class SecondController {

    @GetMapping("/exit")
    public String exit() {
        return "second/exit";
    }

}
