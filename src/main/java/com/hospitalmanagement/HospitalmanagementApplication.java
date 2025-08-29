package com.hospitalmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HospitalmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalmanagementApplication.class, args);
	}

	@GetMapping
	public String Welcome() {
		return "Welcom to the Hospital Management Application";
	}

}
