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

    private  final VisitService visitService;



    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtiesService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtiesService = specialtiesService;
        this.visitService = visitService;
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
        owner1.setLastName("Weston");
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
        owner2.setLastName("Glenne");
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

        Visit catVisit = new Visit();
        catVisit.setPet(fionasCat);
        catVisit.setDate(LocalDate.now());
        catVisit.setDescription("Sneezy Kitty");

        visitService.save(catVisit);

        System.out.println("Loaded Owners..");

        Vet vet1 = new Vet();
        vet1.setFirstName("Lastim");
        vet1.setLastName("Akamaru");
        vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Kessie");
        vet2.setLastName("Porter");
        vet1.getSpecialities().add(savedSurgegy);


        vetService.save(vet2);

        System.out.println("Loeaded Vets...");
    }
}
