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

import com.hospitalmanagement.models.Appointment;
import com.hospitalmanagement.models.Patient;

@RestController
@RequestMapping("/api/v1/appointment")
public class AppointmentController {

    @GetMapping
    public List<Appointment> getAllAppointments() {
        return null;
    }

    @PostMapping
    public Appointment registerAppointment(@RequestBody Appointment appointment) {
        return appointment;
    }

    @GetMapping("/{id}")
    public Appointment getAppointmentById(@PathVariable Long id){
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable Long id){
    }

    @PutMapping("/{id}")
    public void updateAppointment(@PathVariable Long id){
        
    }

}

// Controllers --> service --> Repository
