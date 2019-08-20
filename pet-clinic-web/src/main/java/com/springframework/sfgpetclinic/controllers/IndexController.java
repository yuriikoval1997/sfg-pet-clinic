package com.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"", "/", "index", "index.html"})
@Controller
public class IndexController {

    @GetMapping
    public String showIndexPage(){
        return "index.html";
    }
}
