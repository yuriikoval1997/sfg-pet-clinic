package com.springframework.sfgpetclinic.model;

import lombok.*;

import javax.persistence.*;

/**
 * Public getters and setters are required for thymeleaf;
 * Default constructor has to be protected, otherwise children won't be able to have their default constructors
 */
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@MappedSuperclass // no table is created for Person
public abstract class Person extends BaseEntity{

    @Column(name = "first_name")
    protected String firstName;

    @Column(name = "last_name")
    protected String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + super.getId() +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
