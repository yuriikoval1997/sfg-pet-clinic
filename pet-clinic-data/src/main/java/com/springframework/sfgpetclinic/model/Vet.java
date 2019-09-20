package com.springframework.sfgpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Table(name = "vets")
public class Vet extends Person {

    public Vet(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @ManyToMany(fetch = FetchType.EAGER) // if lazy, specialties will be empty, unless it you explicitly ask for it.
    @JoinTable(name = "vet_speciality",
            joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities = new HashSet<>();

    public void addSpeciality(@NonNull Speciality speciality){
        specialities.add(speciality);
    }

    public void addSpecialities(@NonNull Set<Speciality> specialities){
        this.specialities.addAll(specialities);
    }
}
