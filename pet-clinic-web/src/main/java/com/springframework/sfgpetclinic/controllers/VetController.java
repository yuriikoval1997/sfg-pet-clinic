package com.springframework.sfgpetclinic.controllers;

import com.springframework.sfgpetclinic.repositories.VetRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vet")
public class VetController {

    private final VetRepo vetRepo;

    public VetController(VetRepo vetRepo) {
        this.vetRepo = vetRepo;
    }

    @GetMapping({"", "/", "vets"})
    public String listVets(Model model){
        model.addAttribute("vets", vetRepo.findAll());
        return "vets/vets.html";
    }
}
