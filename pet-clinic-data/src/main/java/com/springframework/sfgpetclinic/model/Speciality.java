package com.springframework.sfgpetclinic.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {
    private Field field;

    @ManyToMany(mappedBy = "specialities")
    private Set<Vet> vets = new HashSet<>();

    public Speciality(Field field) {
        this.field = field;
    }

    public enum Field {
        RADIOLOGY, DENTISTRY, SURGERY, CARDIOLOGY
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Speciality that = (Speciality) o;
        return field == that.field;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), field);
    }
}
