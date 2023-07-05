package com.example.repositories;

import com.example.model.Vet;
import org.hibernate.context.spi.CurrentSessionContext;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
