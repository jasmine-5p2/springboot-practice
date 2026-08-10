package com.example.demo;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationForm {

    @PostMapping("/register")
    public String register(@RequestParam String name,@RequestParam int age){
        System.out.println("Thank you for Registration");
        return "name:"+" "+name+ " "+"age"+" "+age;
    }



    
}
