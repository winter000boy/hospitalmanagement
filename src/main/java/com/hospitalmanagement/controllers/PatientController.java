package com.hospitalmanagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalmanagement.models.Patient;
import com.hospitalmanagement.services.PatientService;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    // We are telling Spring that when you create a object of PatientController also
    // add the dependency of PatientService
    // Atomatically Injecting the Dependency into the Module
    // Basically it searches for bean in this case its patientService it will
    // automatically Inject it
    // Autowired will search for the Service Annotation which is PatientService
    @Autowired
    private PatientService patientService;

    @GetMapping
    public List<Patient> getAllPatients() {
        System.out.println("Fetching the Patients !"); // Logs
        return patientService.getAllPatients();
    }

    @PostMapping
    public Patient registerPatient(@RequestBody Patient patient) {
        System.out.println("Registering the Patient !"); // Logs
        return patientService.createPatient(patient);
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        System.out.println("Fetching Patient by Id !"); // Logs
        return patientService.getPatientById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id) {
        patientService.deletePatient(id);
    }

    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable Long id, @RequestBody Patient patient) {
        return patientService.updatePatient(id, patient);
    }

}

// Controllers --> service --> Repository