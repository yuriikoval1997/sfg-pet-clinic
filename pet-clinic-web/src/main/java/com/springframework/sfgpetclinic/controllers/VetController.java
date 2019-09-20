package com.springframework.sfgpetclinic.controllers;

import com.springframework.sfgpetclinic.services.database_stub.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class VetController {

    private final VetService vetRepo;

    public VetController(VetService vetRepo) {
        this.vetRepo = vetRepo;
    }

    @GetMapping({"vets.html", "vets", "vets/"})
    public String listVets(Model model){
        model.addAttribute("vets", vetRepo.findAll());
        return "vets.html";
    }
}
