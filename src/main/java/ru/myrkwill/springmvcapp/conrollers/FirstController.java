package ru.myrkwill.springmvcapp.conrollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Mark Nagibin
 */

@Controller
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {
        model.addAttribute("message", "Hello, " + name + " " + surname);
        System.out.println(model);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "surname", required = false) String surname,
                              Model model) {
        model.addAttribute("message", "Hello, " + name + " " + surname);
        return "first/goodbye";
    }

    @GetMapping("/calculator")
    public String calculatorPage(@RequestParam(value = "a") int a,
                                 @RequestParam(value = "b") int b,
                                 @RequestParam(value = "action") String action,
                                 Model model) {

        double result;

        switch (action) {
            case "multiplication":
            case "mul":
                result = a * b;
                break;
            case "division":
            case "div":
                result = a / (double)b;
                break;
            case "subtraction":
            case "sub":
                result = a - b;
                break;
            case "addition":
            case "add":
                result = a + b;
                break;
            default:
                result = 0;
                break;
        }

        model.addAttribute("result", result);

        return "first/calculator";
    }
}
