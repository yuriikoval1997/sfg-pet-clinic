package com.springframework.sfgpetclinic.repositories.map_implemented;

import com.springframework.sfgpetclinic.model.Vet;
import com.springframework.sfgpetclinic.repositories.VetRepo;
import org.springframework.stereotype.Repository;

@Repository
public class VetRepoMapImpl extends CrudServiceMapImpl<Vet> implements VetRepo {
}
