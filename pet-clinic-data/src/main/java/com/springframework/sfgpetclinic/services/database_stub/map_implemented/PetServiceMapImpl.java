package com.springframework.sfgpetclinic.services.database_stub.map_implemented;

import com.springframework.sfgpetclinic.model.Pet;
import com.springframework.sfgpetclinic.services.database_stub.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "mapImpl"})
public class PetServiceMapImpl extends CrudServiceMapImpl<Pet> implements PetService {
}
