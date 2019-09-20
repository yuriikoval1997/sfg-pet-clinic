package com.springframework.sfgpetclinic.repositories.crud_bicycle;


import com.springframework.sfgpetclinic.model.BaseEntity;

import java.util.Optional;
import java.util.Set;

public interface CrudRepo<T extends BaseEntity, ID> {

    Optional<T> findById(ID id);

    Optional<T> save(T t);

    Set<T> findAll();

    void delete(T t);

    void deleteById(ID id);
}
