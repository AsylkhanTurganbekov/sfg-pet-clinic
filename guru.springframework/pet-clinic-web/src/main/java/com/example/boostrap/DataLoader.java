package com.example.boostrap;

import com.example.model.Owner;
import com.example.model.Vet;
import com.example.services.OwnerService;
import com.example.services.VetService;
import com.example.services.map.OwnerServiceMap;
import com.example.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private  final OwnerService ownerService;
    private  final VetService vetService;


    public DataLoader(OwnerService ownerService,VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
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