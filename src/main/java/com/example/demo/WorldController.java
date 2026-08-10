 package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class  WorldController
{
    @GetMapping("/home")
    public String home(@RequestParam String name,@RequestParam int age){
        return "world"+name+" "+" age"+age;
    }

}

