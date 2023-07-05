package com.example.services;

import com.example.model.Owner;
import com.example.model.Pet;
import org.hibernate.annotations.Comments;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import java.util.Set;
public interface PetService extends CrudService<Pet,Long> {

}
