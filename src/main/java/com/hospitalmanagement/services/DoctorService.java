package com.hospitalmanagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmanagement.models.Doctor;
import com.hospitalmanagement.repository.DoctorRepository;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAllDoctors() {
        try {
            System.out.println("Into the Service Layer !");
            return doctorRepository.findAll();
        } catch (Exception e) {
            System.out.println("Error Message : " + e.getMessage());
            return null;
        }
    }

    public Doctor getDoctorById(Long id) {
        try {
            Optional<Doctor> doctor = doctorRepository.findById(id);
            return doctor.orElse(null);
        } catch (Exception e) {
            System.out.println("Error Message : " + e.getMessage());
            return null;
        }
    }

    public Doctor createDoctor(Doctor doctor) {
        try {
            return doctorRepository.save(doctor);
        } catch (Exception e) {
            System.out.println("Error Message : " + e.getMessage());
            return null;
        }
    }

    public void deleteDoctor(Long id) {
        try {
            doctorRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println("Error Message : " + e.getMessage());
        }
    }

    public Doctor updateDoctor(long id, Doctor updatedDoctor) {
        try {
            Optional<Doctor> existingDoctor = doctorRepository.findById(id);
            if (existingDoctor.isPresent()) {
                Doctor doctor = existingDoctor.get();
                doctor.setName(updatedDoctor.getName());
                doctor.setSpecialization(updatedDoctor.getSpecialization());
                doctor.setExperience(updatedDoctor.getExperience());
                return doctorRepository.save(doctor);
            }
            return null;
        } catch (Exception e) {
            System.out.println("Error Message : " + e.getMessage());
            return null;
        }
    }
}