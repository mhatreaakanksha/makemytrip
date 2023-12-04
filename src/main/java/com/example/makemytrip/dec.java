package com.example.makemytrip;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class dec {

    @GetMapping("/dec")


    public String getData() {return "welcome december 2023" ;}
}

