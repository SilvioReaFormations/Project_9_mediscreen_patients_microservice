package com.openclassroom.mediscreen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import com.openclassroom.mediscreen.repository.PatientDTO;
import com.openclassroom.mediscreen.service.PatientService;
import com.openclassroom.mediscreen.service.PatientServiceImpl;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class})
public class Projet9MediscreenApplication implements CommandLineRunner  {
	
	
	@Autowired
	PatientService patient;

	public static void main(String[] args) {
		SpringApplication.run(Projet9MediscreenApplication.class, args);
	}

	
	
	@Override
	public void run(String... args) throws Exception
	{
		
	}

}
