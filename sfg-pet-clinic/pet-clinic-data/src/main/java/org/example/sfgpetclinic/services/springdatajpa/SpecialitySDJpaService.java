package org.example.sfgpetclinic.services.springdatajpa;

import org.example.sfgpetclinic.model.Speciality;
import org.example.sfgpetclinic.repositories.SpecialtyRepository;
import org.example.sfgpetclinic.services.SpecialtiesService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialtiesService {

    private final SpecialtyRepository specialtyRepository;

    public SpecialitySDJpaService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Speciality> findAll() {

        Set<Speciality> specialities = new HashSet<>();

        specialtyRepository.findAll().forEach(specialities::add);


        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {

        return  specialtyRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialtyRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {

        specialtyRepository.delete(object);
    }

    @Override
    public void deleteByID(Long aLong) {

        specialtyRepository.deleteById(aLong);
    }
}
