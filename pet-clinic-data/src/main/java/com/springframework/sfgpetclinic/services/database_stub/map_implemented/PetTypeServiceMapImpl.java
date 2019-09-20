package com.springframework.sfgpetclinic.services.database_stub.map_implemented_runtime_stubs;

import com.springframework.sfgpetclinic.model.PetType;
import com.springframework.sfgpetclinic.services.database_stub.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class PetTypeServiceMapImpl extends CrudServiceMapImpl<PetType> implements PetTypeService {
}
