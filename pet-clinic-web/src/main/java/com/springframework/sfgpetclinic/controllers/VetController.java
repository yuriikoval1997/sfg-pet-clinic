package com.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets/")
public class VetController {

    @GetMapping("vets")
    public String listVets(){
        return "vets/vets.html";
    }
}
