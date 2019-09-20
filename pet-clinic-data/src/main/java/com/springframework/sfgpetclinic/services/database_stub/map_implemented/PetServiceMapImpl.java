package com.springframework.sfgpetclinic.services.database_stub.map_implemented_runtime_stubs;

import com.springframework.sfgpetclinic.model.Pet;
import com.springframework.sfgpetclinic.services.database_stub.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMapImpl extends CrudServiceMapImpl<Pet> implements PetService {
}
