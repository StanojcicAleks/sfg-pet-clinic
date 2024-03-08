package org.example.sfgpetclinic.services;

import org.example.sfgpetclinic.model.Pet;
import java.util.Set;

public interface PetService {

    Pet findByID(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
