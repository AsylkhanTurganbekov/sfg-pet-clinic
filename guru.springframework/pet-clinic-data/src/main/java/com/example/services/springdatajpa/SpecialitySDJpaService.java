package com.example.services.springdatajpa;

import com.example.model.Speciality;
import com.example.repositories.SpecialtyRepository;
import com.example.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialtyService {
    public SpecialitySDJpaService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    private  final SpecialtyRepository specialtyRepository;


    @Override
    public Set<Speciality> findall() {
        return null;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialtyRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialtyRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialtyRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialtyRepository.deleteById(aLong);
    }
}
