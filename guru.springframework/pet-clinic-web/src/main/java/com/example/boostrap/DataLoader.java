package com.example.boostrap;

import com.example.model.*;
import com.example.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private  final OwnerService ownerService;
    private  final VetService vetService;
    private final PetTypeService petTypeService;

    private final SpecialtyService specialtiesService;



    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtiesService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtiesService = specialtiesService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findall().size();

        if(count==0) {
            localData();
        }

    }

    void localData() {

        PetType dog = new PetType();
        dog.setName("Volt");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Kisa");
        PetType savedCatPetType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology =  specialtiesService.save(radiology);


        Speciality surgery = new Speciality();
        radiology.setDescription("surgey");
        specialtiesService.save(surgery);
        Speciality savedSurgegy =  specialtiesService.save(surgery);


        Speciality dentistry = new Speciality();
        radiology.setDescription("Radiology");
        specialtiesService.save(dentistry);
        Speciality savedDentistry =  specialtiesService.save(dentistry);


        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLasNamel("Weston");
        owner1.setAddress("123 Brackets");
        owner1.setCity("Miami");
        owner1.setTelephone("123124123213");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fionna");
        owner2.setLasNamel("Glenne");
        owner2.setAddress("456 Brackets");
        owner2.setCity("Miami");
        owner2.setTelephone("1231231231");

        Pet fionasCat = new Pet();
        fionasCat.setName("Just Cat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(savedCatPetType);
        owner2.getPets().add(fionasCat);

        ownerService.save(owner2);

        System.out.println("Loaded Owners..");

        Vet vet1 = new Vet();
        vet1.setFirstName("Lastim");
        vet1.setLasNamel("Akamaru");
        vet1.getSpecialitySet().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Kessie");
        vet2.setLasNamel("Porter");
        vet1.getSpecialitySet().add(savedSurgegy);


        vetService.save(vet2);

        System.out.println("Loeaded Vets...");
    }
}
