package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @RequestMapping({"","/","index","index.html"})
    public String index() {
        return "index";
    }

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name") String name, @RequestParam(value="surname") String surname) {
        System.out.println("Hello " + name  + " " + surname);
        return "index";
    }


    @RequestMapping("/oups")
    public String oupsHandler() {
        return "notimplementedyeat";
    }
}


