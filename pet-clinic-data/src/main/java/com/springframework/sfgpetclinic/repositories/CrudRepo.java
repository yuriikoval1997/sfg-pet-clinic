package com.springframework.sfgpetclinic.services;


import com.springframework.sfgpetclinic.model.BaseEntity;
import com.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface CrudService<T extends BaseEntity, ID> {

    T findById(ID id);

    T save(T t);

    Set<T> findAll();

    void delete(T t);

    void deleteById(ID id);
}
