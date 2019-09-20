package com.springframework.sfgpetclinic.repositories.jpa_repositories;

import com.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
