package com.springframework.sfgpetclinic.services.database_stub.map_implemented;

import com.springframework.sfgpetclinic.model.Speciality;
import com.springframework.sfgpetclinic.services.database_stub.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "mapImpl"})
public class SpecialityServiceMapImpl extends CrudServiceMapImpl<Speciality> implements SpecialityService {
}
