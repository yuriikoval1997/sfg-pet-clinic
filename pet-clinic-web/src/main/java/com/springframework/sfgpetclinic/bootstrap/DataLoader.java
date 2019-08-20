package com.springframework.sfgpetclinic.bootstrap;

import com.springframework.sfgpetclinic.model.Owner;
import com.springframework.sfgpetclinic.model.Vet;
import com.springframework.sfgpetclinic.repositories.OwnerRepo;
import com.springframework.sfgpetclinic.repositories.VetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerRepo ownerRepo;
    private final VetRepo vetRepo;

    @Autowired
    public DataLoader(OwnerRepo ownerRepo, VetRepo vetRepo) {
        this.ownerRepo = ownerRepo;
        this.vetRepo = vetRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner("First", "Uno");
        ownerRepo.save(owner1);
        Owner owner2 = new Owner("Second", "Due");
        ownerRepo.save(owner2);
        System.out.println("Owners loaded");

        Vet vet1 = new Vet("DrFirst", "DrUno");
        vetRepo.save(vet1);
        Vet vet2 = new Vet("DrSecond", "DrDue");
        vetRepo.save(vet2);
        System.out.println("Vets loaded");
    }
}
