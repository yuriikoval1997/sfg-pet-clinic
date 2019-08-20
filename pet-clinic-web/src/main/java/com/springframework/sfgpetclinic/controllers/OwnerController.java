package com.springframework.sfgpetclinic.controllers;

import com.springframework.sfgpetclinic.repositories.OwnerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    private final OwnerRepo ownerRepo;

    @Autowired
    public OwnerController(OwnerRepo ownerRepo) {
        this.ownerRepo = ownerRepo;
    }

    @GetMapping({"", "/", "owners"})
    public String listPetOwners(Model model){
        model.addAttribute("owners", ownerRepo.findAll());
        return "owners/owners.html";
    }
}
