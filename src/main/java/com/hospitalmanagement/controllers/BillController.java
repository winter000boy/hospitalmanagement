package com.hospitalmanagement.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalmanagement.models.Bill;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1/bills")
public class BillController {

    @GetMapping
    public List<Bill> getAllBills() {
        return null;
    }

    @PostMapping
    public Bill registerBill(@RequestBody Bill bill){
        return bill;
    }

    @GetMapping("/{id}")
    public Bill getBillById(@PathVariable Long id){
        return null;
    }

    @DeleteMapping("/id")
    public void deleteBillById(@PathVariable Long id){}

    @PutMapping("/id")
    public void updateBillById(@PathVariable Long id){}


    

}
