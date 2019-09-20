package com.springframework.sfgpetclinic.services.database_stub.map_implemented_runtime_stubs;

import com.springframework.sfgpetclinic.model.Vet;
import com.springframework.sfgpetclinic.services.database_stub.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMapImpl extends CrudServiceMapImpl<Vet> implements VetService {
}
