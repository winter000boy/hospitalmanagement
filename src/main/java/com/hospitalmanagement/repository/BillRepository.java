package com.hospitalmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalmanagement.models.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {

}
