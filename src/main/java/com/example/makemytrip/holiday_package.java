package com.example.makemytrip;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class holiday_package {

    @GetMapping("/holiday_package ")
    public String getData() {return "Please book your holiday package with makemytrip" ;}
}
