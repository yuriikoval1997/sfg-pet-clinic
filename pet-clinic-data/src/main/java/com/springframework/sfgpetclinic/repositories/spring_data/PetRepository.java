package com.springframework.sfgpetclinic.repositories.jpa_repositories;

import com.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
