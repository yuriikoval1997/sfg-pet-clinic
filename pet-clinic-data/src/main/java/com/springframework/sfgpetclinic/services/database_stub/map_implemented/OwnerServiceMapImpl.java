package com.springframework.sfgpetclinic.services.database_stub.map_implemented;

import com.springframework.sfgpetclinic.model.Owner;
import com.springframework.sfgpetclinic.services.database_stub.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "mapImpl"})
public class OwnerServiceMapImpl extends CrudServiceMapImpl<Owner> implements OwnerService {
}
