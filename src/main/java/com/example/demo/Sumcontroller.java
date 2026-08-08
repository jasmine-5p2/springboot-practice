package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;



@RestController
public class Sumcontroller {
@GetMapping("/sum")
public String sum(){
    return "4+5=9";
}



    
}
