package com.springframework.sfgpetclinic.services.database_stub.map_implemented_runtime_stubs;

import com.springframework.sfgpetclinic.model.Owner;
import com.springframework.sfgpetclinic.services.database_stub.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMapImpl extends CrudServiceMapImpl<Owner> implements OwnerService {
}
