//package com.example.services.springdatajpa;
//
//import com.example.model.Pet;
//import com.example.repositories.PetRepository;
//import com.example.services.PetService;
//
//import java.util.Set;
//
//public class PetSDJpaService implements PetService {
//    private final PetRepository petRepository;
//
//    public PetSDJpaService(PetRepository petRepository) {
//        this.petRepository = petRepository;
//    }
//
//    @Override
//    public Set<Pet> findall() {
//        return null;
//    }
//
//    @Override
//    public Pet findById(Long aLong) {
//        return petRepository.findById(aLong).orElse(null);;
//    }
//
//    @Override
//    public Pet save(Pet object) {
//        return petRepository.save(object);
//    }
//
//    @Override
//    public void delete(Pet object) {
//        petRepository.delete(object);
//    }
//
//    @Override
//    public void deleteById(Long aLong) {
//        petRepository.deleteById(aLong);
//    }
//}
