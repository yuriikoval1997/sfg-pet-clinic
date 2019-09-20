package com.springframework.sfgpetclinic.services.database_stub.map_implemented;

import com.springframework.sfgpetclinic.model.PetType;
import com.springframework.sfgpetclinic.services.database_stub.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "mapImpl"})
public class PetTypeServiceMapImpl extends CrudServiceMapImpl<PetType> implements PetTypeService {
}
