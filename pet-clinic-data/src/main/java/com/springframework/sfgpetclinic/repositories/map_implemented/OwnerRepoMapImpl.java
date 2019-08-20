package com.springframework.sfgpetclinic.repositories.map_implemented;

import com.springframework.sfgpetclinic.model.Owner;
import com.springframework.sfgpetclinic.repositories.OwnerRepo;
import org.springframework.stereotype.Repository;

@Repository
public class OwnerRepoMapImpl extends CrudRepoMapImpl<Owner> implements OwnerRepo {
}
