package com.springframework.sfgpetclinic.repositories.map_implemented;

import com.springframework.sfgpetclinic.model.Pet;
import com.springframework.sfgpetclinic.repositories.PetRepo;
import org.springframework.stereotype.Repository;

@Repository
public class PetRepoMapImpl extends CrudServiceMapImpl<Pet> implements PetRepo {
}
