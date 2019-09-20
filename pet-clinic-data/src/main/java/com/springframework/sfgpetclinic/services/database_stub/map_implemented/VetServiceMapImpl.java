package com.springframework.sfgpetclinic.services.database_stub.map_implemented;

import com.springframework.sfgpetclinic.model.Vet;
import com.springframework.sfgpetclinic.services.database_stub.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "mapImpl"})
public class VetServiceMapImpl extends CrudServiceMapImpl<Vet> implements VetService {
}
