package com.springframework.sfgpetclinic.repositories.jpa_repositories;

import com.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
