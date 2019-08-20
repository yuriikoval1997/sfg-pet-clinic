package com.springframework.sfgpetclinic.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Setter(value = AccessLevel.PRIVATE)
@Getter
@NoArgsConstructor
public class Pet extends BaseEntity{

    @Column(name = "birth_date")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate birthData;

    @Column(name = "pet_type")
    private PetType petType;

    @Column(name = "owners")
    private Owner owner;
}
