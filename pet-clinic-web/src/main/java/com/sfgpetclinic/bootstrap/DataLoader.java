// Created by: Irshad Shaikh 
// On: 1/8/2019

package com.sfgpetclinic.bootstrap;

import com.sfgpetclinic.model.Owner;
import com.sfgpetclinic.model.Vet;
import com.sfgpetclinic.services.OwnerService;
import com.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Caine");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Morgan");
        owner2.setLastName("Freeman");

        ownerService.save(owner2);

        System.out.println("Loaded owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Jason");
        vet1.setLastName("Holder");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Alice");
        vet2.setLastName("Wondercheck");

        vetService.save(vet2);

        System.out.println("Loaded vets...");












    }
}
