package com.springframework.sfgpetclinic.repositories;


import com.springframework.sfgpetclinic.model.BaseEntity;

import java.util.Set;

public interface CrudRepo<T extends BaseEntity, ID> {

    T findById(ID id);

    T save(T t);

    Set<T> findAll();

    void delete(T t);

    void deleteById(ID id);
}
