package org.example.sfgpetclinic.services;

import org.example.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastNAme(String lastName);
    Owner findByID(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
