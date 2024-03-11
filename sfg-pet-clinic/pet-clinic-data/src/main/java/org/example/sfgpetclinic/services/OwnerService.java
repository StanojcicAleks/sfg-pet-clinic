package org.example.sfgpetclinic.services;

import org.example.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastNAme(String lastName);
}
