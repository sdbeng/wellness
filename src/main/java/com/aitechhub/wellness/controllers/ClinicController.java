package com.aitechhub.wellness.controllers;

import com.aitechhub.wellness.model.Clinic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/clinics")
public class ClinicController {
//    @Autowired
//    private ClinicService clinicService;

//    @GetMapping
//    public ResponseEntity<List<Clinic>> getClinics() {
//        //return a string  for now
////        return ResponseEntity.ok(List.of(new Clinic("Clinic 1"), new Clinic("Clinic 2")));
////        return ResponseEntity.ok(clinicService.getAllClinics());
//    }
}
