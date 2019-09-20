package com.springframework.sfgpetclinic.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Public getters and setters are required for thymeleaf
 */
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Table(name = "pets")
public class Pet extends BaseEntity{

    private String name;

    @Column(name = "birth_date")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate birthData;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType petType;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    private Set<Visit> visits = new HashSet<>();

    public Pet(String name, LocalDate birthData, PetType petType, Owner owner) {
        this.name = name;
        this.birthData = birthData;
        this.petType = petType;
        this.owner = owner;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pet pet = (Pet) o;
        return Objects.equals(name, pet.name) &&
                Objects.equals(petType, pet.petType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, petType);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + super.id +
                ", birthData=" + birthData +
                ", petType=" + petType +
                ", owner=" + owner +
                '}';
    }
}
