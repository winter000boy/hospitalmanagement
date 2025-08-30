package com.hospitalmanagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmanagement.models.Appointment;
import com.hospitalmanagement.repository.AppointmentRepository;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> getAllApointments() {
        try {
            System.out.println("Into the Service Layer !");
            return appointmentRepository.findAll();
        } catch (Exception e) {
            System.out.println("Error Message : " + e.getMessage());
            return null;
        }
    }

    public Appointment getAppointmentById(Long id) {
        try {
            System.out.println("Into the Service Layer !");
            Optional<Appointment> appointment = appointmentRepository.findById(id);
            return appointment.orElse(null);
        } catch (Exception e) {
            System.out.println("Error Message : " + e.getMessage());
            return null;
        }
    }

    public Appointment createAppointment(Appointment appointment) {
        try {
            return appointmentRepository.save(appointment);
        } catch (Exception e) {
            System.out.println("Error Message : " + e.getMessage());
            return null;
        }
    }

    public void deleteAppointment(Long id) {
        try {
            appointmentRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println("Error Message : " + e.getMessage());
        }
    }

    public Appointment updateAppointment(Long id, Appointment updatedAppointment) {
        try {
            Optional<Appointment> existingAppointment = appointmentRepository.findById(id);
            if (existingAppointment.isPresent()) {
                Appointment appointment = existingAppointment.get();
                appointment.setDate(updatedAppointment.getDate());
                appointment.setDoctorId(updatedAppointment.getDoctorId());
                return appointmentRepository.save(appointment);
            }
            return null;
        } catch (Exception e) {
            System.out.println("Error Message : " + e.getMessage());
            return null;
        }

    }
}
