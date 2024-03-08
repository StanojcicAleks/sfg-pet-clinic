package org.example.sfgpetclinic.services;

import org.example.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastNAme(String lastName);
}
