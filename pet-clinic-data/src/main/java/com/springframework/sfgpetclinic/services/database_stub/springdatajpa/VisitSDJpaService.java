package com.springframework.sfgpetclinic.services.database_stub.springdatajpa;

import com.springframework.sfgpetclinic.model.Visit;
import com.springframework.sfgpetclinic.repositories.spring_data.VisitRepository;
import com.springframework.sfgpetclinic.services.database_stub.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("spring_data_jpa")
public class VisitSDJpaService implements VisitService {

    private final VisitRepository visitRepository;

    @Autowired
    public VisitSDJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Optional<Visit> findById(Long id) {
        return visitRepository.findById(id);
    }

    @Override
    public Visit save(Visit visit) {
        return visitRepository.save(visit);
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public void delete(Visit visit) {
        visitRepository.delete(visit);
    }

    @Override
    public void deleteById(Long id) {
        visitRepository.deleteById(id);
    }
}
