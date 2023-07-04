package com.example.boostrap;

import com.example.model.Owner;
import com.example.model.Pet;
import com.example.model.PetType;
import com.example.model.Vet;
import com.example.services.OwnerService;
import com.example.services.PetService;
import com.example.services.PetTypeService;
import com.example.services.VetService;
import com.example.services.map.OwnerServiceMap;
import com.example.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private  final OwnerService ownerService;
    private  final VetService vetService;
    private final PetTypeService petService;


    public DataLoader(OwnerService ownerService,VetService vetService,PetTypeService petService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petService = petService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Volt");
        PetType savedDogPetType = petService.save(dog);

        PetType cat = new PetType();
        dog.setName("Kisa");
        PetType savedCatPetType = petService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLasNamel("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fionna");
        owner2.setLasNamel("Glenne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners..");

        Vet vet1 = new Vet();
        vet1.setFirstName("Lastim");
        vet1.setLasNamel("Akamaru");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Kessie");
        vet2.setLasNamel("Porter");

        vetService.save(vet2);

        System.out.println("Loeaded Vets...");
    }
}
