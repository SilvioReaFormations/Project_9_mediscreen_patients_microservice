package com.openclassroom.mediscreen.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.openclassroom.mediscreen.model.Patient;
import com.openclassroom.mediscreen.repository.PatientDTO;
import com.openclassroom.mediscreen.service.PatientService;

@RestController
public class PatientController
{
	@Autowired 
	PatientService patientService;
	
	@GetMapping("/patient/readAll")
	public List<PatientDTO> getAllPatient()
	{
		return patientService.readAll();
		
	}
	
	@GetMapping("/patient/read/{id}")
	public Optional<PatientDTO> getPatient(@PathVariable("id") Integer patient_id)
	{
		return patientService.read(patient_id);
		
	}
	
	@PostMapping("/patient/add")
	public Patient addPatient(@RequestBody PatientDTO patientDTO)
	{
		return patientService.create(patientDTO);
	}
	
	@PostMapping("/patient/update/{id}")
	public Patient updatePatient(@PathVariable("id") Integer patient_id,@RequestBody PatientDTO patientDTO)
	{
		return patientService.update(patient_id, patientDTO);
	}
	
	@GetMapping("/patient/delete/{id}")
	public void deletePatient(@PathVariable("id") Integer patient_id)
	{
		patientService.delete(patient_id);
	}
	
}
