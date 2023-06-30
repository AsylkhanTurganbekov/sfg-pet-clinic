package com.example.sfgpetclinic;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("aaiii");
        return "hello";
    }
}
