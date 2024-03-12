package org.example.sfgpetclinic.bootstrap;

import org.example.sfgpetclinic.model.Owner;
import org.example.sfgpetclinic.model.Vet;
import org.example.sfgpetclinic.services.OwnerService;
import org.example.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Aleksandar");
        owner2.setLastName("Stanojcic");

        ownerService.save(owner2);

        System.out.println("Loaded Owners ...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Mile");
        vet1.setLastName("Pantovic");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Milenko");
        vet2.setLastName("Pantovic");

        vetService.save(vet2);

        System.out.println("Loaded Vets ....");
    }
}
