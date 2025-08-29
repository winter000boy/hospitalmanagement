package com.hospitalmanagement.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalmanagement.models.Doctor;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {
    @GetMapping
    public List<Doctor> getAllDoctors(){
        return null;
    }

    @PostMapping
    public Doctor registerDoctor(@RequestBody Doctor doctor){
        return doctor;
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable Long id){
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteDoctorById(@PathVariable Long id){
    }

    @PutMapping("/id")
    public void updateDoctorById(@PathVariable Long id){
    }

}
