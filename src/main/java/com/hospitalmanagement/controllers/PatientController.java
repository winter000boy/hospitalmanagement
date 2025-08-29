package com.hospitalmanagement.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalmanagement.models.Patient;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    @GetMapping
    public List<Patient> getAllPatients() {
        System.out.println("Fetching the Patients !");
        return null;
    }

    @PostMapping
    public Patient registerPatient(@RequestBody Patient patient) {
        System.out.println("Registering the Patient !");
        return patient;
    }

}

// Controllers --> service --> Repository