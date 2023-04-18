package com.proyecto.Proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", "World");
        return "greeting";
    }

    @GetMapping("/greeting/{name}")
    public String greeting2(Model model, @PathVariable String name) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/greeting/{name}/{age}")
    public String greeting3(Model model, @PathVariable String name, @PathVariable String age) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "greetings";
    }

}
