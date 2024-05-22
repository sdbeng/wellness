package com.aitechhub.wellness.controllers;

import com.aitechhub.wellness.model.Clinic;
import com.aitechhub.wellness.services.ClinicService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/clinics")

public class ClinicController {

    private ClinicService clinicService;

    @GetMapping
    public ResponseEntity<List<Clinic>> getClinics() {
        return ResponseEntity.ok(clinicService.getAllClinics());
    }

    @PostMapping
    public Clinic submitClinic(@RequestBody Clinic clinic) {
        return clinicService.createClinic(clinic);
    }
}


