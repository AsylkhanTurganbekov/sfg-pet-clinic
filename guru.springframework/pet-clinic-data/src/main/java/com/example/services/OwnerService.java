package com.example.services;

import com.example.model.Owner;
import org.springframework.stereotype.Service;

import java.util.Set;


public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);
}
