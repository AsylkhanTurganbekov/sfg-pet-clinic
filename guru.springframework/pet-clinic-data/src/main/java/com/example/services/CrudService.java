package com.example.services;

import org.springframework.data.annotation.Id;

import java.util.Set;

public interface CrudService<T,ID> {
    Set<T> findall();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}