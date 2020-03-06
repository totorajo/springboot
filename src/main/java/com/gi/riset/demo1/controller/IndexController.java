package com.gi.riset.demo1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

//1. membuat Anotasi @Rest, untuk mengenenali
@RestController

//2. Link API
@RequestMapping("/")
public class IndexController {

    //3. Setelah
    @GetMapping
    public String index() {
        return "Hello Word <br> Card REST API -"+new Date();
    }

}
