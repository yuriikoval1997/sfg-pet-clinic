package com.springframework.sfgpetclinic.bootstrap;

import com.springframework.sfgpetclinic.model.*;
import com.springframework.sfgpetclinic.services.database_stub.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Slf4j
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetService petService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetService petService, PetTypeService petTypeService, SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petService = petService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {

        // save method will return the object with set id
        PetType dog = petTypeService.save(new PetType("dog"));
        Owner owner1 = new Owner(
                "First",
                "Uno",
                "Rocky Mountain",
                "Valhalla",
                "+326325423453245");
        Pet rex = new Pet("Rex", LocalDate.now(), dog, owner1);
        owner1.addPet(rex);
        ownerService.save(owner1);

        PetType cat = petTypeService.save(new PetType("cat"));
        Owner owner2 = new Owner(
                "Second",
                "Due",
                "Bologna",
                "Italy",
                "+391423412341234");
        Pet tom = new Pet("Tom", LocalDate.now(), cat, owner2);
        owner2.addPet(tom);
        ownerService.save(owner2);

        log.info("Owners loaded");

        Speciality radiology = specialityService.save(new Speciality(Speciality.Field.RADIOLOGY));
        Vet vet1 = new Vet("DrFirst", "DrUno");
        vet1.addSpeciality(radiology);
        vetService.save(vet1);

        Speciality surgery = specialityService.save(new Speciality(Speciality.Field.SURGERY));
        Vet vet2 = new Vet("DrSecond", "DrDue");
        vet2.addSpeciality(surgery);
        vetService.save(vet2);

        log.info("Vets loaded");
    }
}
