package com.hospitalmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalmanagement.models.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
