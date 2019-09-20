package com.springframework.sfgpetclinic.repositories.jpa_repositories;

import com.springframework.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
