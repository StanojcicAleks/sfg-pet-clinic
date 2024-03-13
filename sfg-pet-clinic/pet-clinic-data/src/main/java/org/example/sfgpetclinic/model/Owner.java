package org.example.sfgpetclinic.model;

import java.util.Set;

public class Owner extends Person {

    private Set<Pet> sets;

    public void setSets(Set<Pet> sets) {
        this.sets = sets;
    }

    public Set<Pet> getSets() {
        return sets;
    }
}
