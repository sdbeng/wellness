package com.aitechhub.wellness.services;

import com.aitechhub.wellness.model.Clinic;
import com.aitechhub.wellness.repositories.ClinicRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@Service
public class ClinicService {

    public ClinicRepository clinicRepository;

    public List<Clinic> getAllClinics() {
    List<Clinic> clinicList = clinicRepository.findAll();
    //check if clinicList is null or empty, return an empty list instead
    if (clinicList == null || clinicList.isEmpty()) {
        return new ArrayList<>();
    }
    return clinicList;
    }

    public Clinic findByName(String name) {
    return clinicRepository.findByName(name);
    }

    public Clinic createClinic(Clinic clinic) {
     Clinic savedClinic = clinicRepository.save(clinic);
     return savedClinic;
    }
}
