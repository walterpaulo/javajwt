package com.demo.javajwt.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.javajwt.domain.model_views.Home;

@RestController
public class HomeController {

    @GetMapping("/")
    public Home index(){
        return new Home();
    }

}
