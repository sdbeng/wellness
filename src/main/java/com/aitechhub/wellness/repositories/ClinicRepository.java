package com.aitechhub.wellness.repositories;

import com.aitechhub.wellness.model.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClinicRepository extends JpaRepository<Clinic, Long> {
    Clinic findByName(String name);

}
