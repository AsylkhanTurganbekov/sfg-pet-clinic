package com.example.controllers;

import com.example.services.VetService;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VetController  {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

//    @GetMapping("/hello")
//    public String helloPage(HttpServletRequest request) {
//        String name = request.getParameter("name");
//        String surname = request.getParameter("surname");
//        System.out.println("Hello " + name  + " " + surname);
//        return "vet/index";
//    }


    @RequestMapping({"/vets","/vets/index","/vets/index.html","/vets.html"})
    public String listVets(Model model) {

        model.addAttribute("vets",vetService.findall());

        return "vets/index";
    }
}
