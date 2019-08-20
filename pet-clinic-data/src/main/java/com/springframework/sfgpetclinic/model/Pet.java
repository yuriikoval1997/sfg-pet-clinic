package com.springframework.sfgpetclinic.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
public class Pet extends BaseEntity{

    @Column(name = "birth_date")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate birthData;

    @Column(name = "pet_type")
    private PetType petType;

    @Column(name = "owners")
    private Owner owner;

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + super.getId() +
                ", birthData=" + birthData +
                ", petType=" + petType +
                ", owner=" + owner +
                '}';
    }

    public LocalDate getBirthData() {
        return birthData;
    }

    public void setBirthData(LocalDate birthData) {
        this.birthData = birthData;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
