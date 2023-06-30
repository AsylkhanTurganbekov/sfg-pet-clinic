package com.example.sfgpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//       ConfigurableApplicationContext ctx =   SpringApplication.run(Application.class, args); // DP Injection without Spring
//       MyController myController = (MyController) ctx.getBean("myController");
//
//
//       String greeting = myController.sayHello();
//        System.out.println(greeting);

        SpringApplication.run(Application.class, args);
    }
}
