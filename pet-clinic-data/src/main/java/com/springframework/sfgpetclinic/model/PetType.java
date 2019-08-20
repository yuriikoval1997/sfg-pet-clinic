package com.springframework.sfgpetclinic.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter(value = AccessLevel.PRIVATE)
@Getter
@NoArgsConstructor
@Entity
@Table(name = "pet_types")
public class PetType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;
}
