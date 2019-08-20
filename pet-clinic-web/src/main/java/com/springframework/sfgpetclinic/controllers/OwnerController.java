package com.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners/")
public class OwnerController {

    @GetMapping("owners")
    public String listPetOwners(){
        return "owners/owners.html";
    }
}
