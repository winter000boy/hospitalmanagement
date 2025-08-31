package com.hospitalmanagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmanagement.models.Bill;
import com.hospitalmanagement.repository.BillRepository;

@Service
public class BillService {

    @Autowired
    private BillRepository billRepository

    public List<Bill> getAllBills() {
        try {
            System.out.println("Into The Service Layer !");
            return billRepository.findAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Bill getBillById(Long id) {
        try {
            Optional<Bill> bill = billRepository.findById(id);
            return bill.orElse(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Bill createBill(Bill bill) {
        try {
            return billRepository.save(bill);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void deleteById(Long id) {
        try {
            billRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Bill updateBill(Long id, Bill existingBill) {
        try {
            Optional<Bill> updatedBill = billRepository.findById(id);
            if (updatedBill.isPresent()) {
                Bill bill = updatedBill.get();
                bill.setBillAmount(existingBill.getBillAmount());
                bill.setStatus(existingBill.getStatus());
                return billRepository.save(bill);
            }
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
