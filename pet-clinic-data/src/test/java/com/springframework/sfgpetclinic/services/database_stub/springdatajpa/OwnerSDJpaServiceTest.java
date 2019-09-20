package com.springframework.sfgpetclinic.services.database_stub.springdatajpa;

import com.springframework.sfgpetclinic.model.Owner;
import com.springframework.sfgpetclinic.repositories.spring_data.OwnerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {

    @Mock
    OwnerRepository ownerRepository;

    private Long id = 1L;
    private Owner owner_1;
    private Set<Owner> owners = new HashSet<>();

    @BeforeEach
    void setUp() {
        owner_1 = Owner.builder()
                .firstName("Mad")
                .lastName("Max")
                .address("Somewhere in Australia")
                .city("Sidney")
                .telephone("1234123412341234")
                .build();
        owner_1.setId(id);
        owners.add(owner_1);
    }

    @Test
    void findById() {
        when(ownerRepository.findById(id)).thenReturn(Optional.of(owner_1));

        Owner owner = Owner.builder()
                .firstName("Mad")
                .lastName("Max")
                .address("Somewhere in Australia")
                .city("Sidney")
                .telephone("1234123412341234")
                .build();
        owner.setId(1L);
        assertEquals(owner, ownerRepository.findById(1L).orElseThrow());

        verify(ownerRepository, times(1)).findById(any());
    }

    @Test
    void save() {
        Owner owner = Owner.builder()
                .firstName("Mad")
                .lastName("Max")
                .address("Somewhere in Australia")
                .city("Sidney")
                .telephone("1234123412341234")
                .build();
        when(ownerRepository.save(owner)).thenReturn(owner_1);


        Owner expected = Owner.builder()
                .firstName("Mad")
                .lastName("Max")
                .address("Somewhere in Australia")
                .city("Sidney")
                .telephone("1234123412341234")
                .build();
        expected.setId(1L);
        assertEquals(expected, ownerRepository.save(owner));
        verify(ownerRepository, times(1)).save(any());
    }

    @Test
    void findAll() {
        when(ownerRepository.findAll()).thenReturn(owners);

        Owner owner = Owner.builder()
                .firstName("Mad")
                .lastName("Max")
                .address("Somewhere in Australia")
                .city("Sidney")
                .telephone("1234123412341234")
                .build();
        owner.setId(1L);
        Set<Owner> ownerSet = Collections.singleton(owner);
        assertEquals(ownerSet, ownerRepository.findAll());

        verify(ownerRepository, times(1)).findAll();
    }

    @Test
    void delete() {
        ownerRepository.delete(owner_1);
        verify(ownerRepository, times(1)).delete(any());
    }

    @Test
    void deleteById() {
        ownerRepository.deleteById(id);
        verify(ownerRepository, times(1)).deleteById(anyLong());
    }
}