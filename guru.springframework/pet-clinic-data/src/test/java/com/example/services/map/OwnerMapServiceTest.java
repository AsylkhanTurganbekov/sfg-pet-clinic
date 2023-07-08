package com.example.services.map;

import com.example.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerMapServiceTest {

    OwnerMapService ownerMapService;
    final Long ownerId = 1L;


    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brackets");
        owner1.setCity("Miami");
        owner1.setTelephone("123124123213");
        owner1.setId(ownerId);

        ownerMapService.save(owner1);
    }

    @Test
    void findall() {
        Set<Owner> set = ownerMapService.findall();
        assertEquals(1,set.size());
    }

    @Test
    void saveExistingId() {
        Long id = 2L;
        Owner owner2 = new Owner();
        owner2.setFirstName("Fionna");
        owner2.setLastName("Glenne");
        owner2.setAddress("456 Brackets");
        owner2.setCity("Miami");
        owner2.setTelephone("1231231231");
        owner2.setId(id);

        Owner savedOwner = ownerMapService.save(owner2);

        assertEquals(id,savedOwner.getId());
    }
    @Test
    void saveNoId() {

    }

    @Test
    void findById() {
        Owner owner = ownerMapService.findById(ownerId);

        assertEquals(ownerId,owner.getId());
    }

    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findById(ownerId));

        assertEquals(0,ownerMapService.findall().size());
    }

    @Test
    void deleteById() {
        ownerMapService.deleteById(ownerId);

        assertEquals(0,ownerMapService.findall().size());
    }

    @Test
    void findByLastName() {
        Owner own = ownerMapService.findByLastName("Weston");

        assertNotNull(own);

        assertEquals(ownerId,own.getId());
    }

    @Test
    void findByLastNameNotFound() {
        Owner own1 = ownerMapService.findByLastName("foo");

        assertNull(own1);
    }
}