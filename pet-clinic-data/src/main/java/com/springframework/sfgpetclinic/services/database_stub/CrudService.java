package com.springframework.sfgpetclinic.services.database_stub;


import com.springframework.sfgpetclinic.model.BaseEntity;

import java.util.Optional;
import java.util.Set;

public interface CrudService<T extends BaseEntity, ID> {

    Optional<T> findById(ID id);

    T save(T t);

    Set<T> findAll();

    void delete(T t);

    void deleteById(ID id);
}
