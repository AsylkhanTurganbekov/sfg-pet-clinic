package com.example.repositories;

import com.example.model.Pet;
import org.springframework.data.repository.CrudRepository;

import javax.sql.rowset.CachedRowSet;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
