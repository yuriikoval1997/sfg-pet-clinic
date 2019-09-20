package com.springframework.sfgpetclinic.services.database_stub.map_implemented;

import com.springframework.sfgpetclinic.model.Visit;
import com.springframework.sfgpetclinic.services.database_stub.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "mapImpl"})
public class VisitServiceMapImpl extends CrudServiceMapImpl<Visit> implements VisitService {
}
