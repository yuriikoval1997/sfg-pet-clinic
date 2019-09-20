package com.springframework.sfgpetclinic.services.database_stub.springdatajpa;

import com.springframework.sfgpetclinic.model.Vet;
import com.springframework.sfgpetclinic.repositories.spring_data.VetRepository;
import com.springframework.sfgpetclinic.services.database_stub.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("spring_data_jpa")
public class VetSDJpaService implements VetService {

    private final VetRepository vetRepository;

    @Autowired
    public VetSDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Optional<Vet> findById(Long id) {
        return vetRepository.findById(id);
    }

    @Override
    public Vet save(Vet vet) {
        return vetRepository.save(vet);
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public void delete(Vet vet) {
        vetRepository.delete(vet);
    }

    @Override
    public void deleteById(Long id) {
        vetRepository.deleteById(id);
    }
}
