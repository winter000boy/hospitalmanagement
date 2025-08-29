package com.hospitalmanagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmanagement.models.Patient;
import com.hospitalmanagement.repository.PatientRepository;

@Service
public class PatientService {
    
    @Autowired
    private PatientRepository patientRepository;
    public List<Patient> getAllPatients() {
        try {
            System.out.println("Into the Service Layer !");
            return patientRepository.findAll();
        } catch (Exception e) {
            System.out.println("Error Message : " + e.getMessage());
            return null;
        }
    }

    public Patient getPatientById(Long id) {
        try {
            Optional<Patient> patient = patientRepository.findById(id);
            return patient.orElse(null);
        } catch (Exception e) {
            System.out.println("Error Message : " + e.getMessage());
            return null;
        }
    }

    public Patient createPatient(Patient patient) {
        try {
            return patientRepository.save(patient);
        } catch (Exception e) {
            System.out.println("Error Message : " + e.getMessage());
            return null;
        }
    }

    public void deletePatient(Long id) {
        try {
            patientRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println("Error Message : " + e.getMessage());
        }
    }

    public Patient updatePatient(long id, Patient updatedPatient) {
        try {
            Optional<Patient> existingPatient = patientRepository.findById(id);
            if (existingPatient.isPresent()) {
                Patient patient = existingPatient.get();
                patient.setName(updatedPatient.getName());
                patient.setAge(updatedPatient.getAge());
                patient.setGender(updatedPatient.getGender());
                return patientRepository.save(patient);
            }
            return null;
        } catch (Exception e) {
            System.out.println("Error Message : " + e.getMessage());
            return null;
        }
    }

}
