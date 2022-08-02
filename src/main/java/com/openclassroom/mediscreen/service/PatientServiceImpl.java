package com.openclassroom.mediscreen.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassroom.mediscreen.model.Patient;
import com.openclassroom.mediscreen.repository.PatientDTO;
import com.openclassroom.mediscreen.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService
{
	
	@Autowired
	private PatientRepository patientrepository;
	
	
	
	@Override
	public Patient create(PatientDTO patient)
	{
		Patient newPatient = new Patient(
				patient.getFirstName(),
				patient.getLastName(),
				patient.getBirthdate(),
				patient.getGender(),
				patient.getAddress(),
				patient.getPhoneNumber());
		
		patientrepository.save(newPatient);
		
		return newPatient;
	}

	@Override
	public Optional<PatientDTO> read(Integer id)
	{
		Patient patient = patientrepository.findById(id).get();
		
		PatientDTO patientDTO = new PatientDTO(
				patient.getFirstName(), 
				patient.getLastName(), 
				patient.getBirthdate(), 
				patient.getGender(), 
				patient.getAddress(), 
				patient.getPhoneNumber());
		
		return Optional.of(patientDTO);
	}

	@Override
	public Patient update(Integer id, PatientDTO patientDto)
	{
		Patient patient = patientrepository.findById(id).get();
		
		patient.setFirstName(patientDto.getFirstName());
		patient.setLastName(patientDto.getLastName());
		patient.setBirthdate(patientDto.getBirthdate());
		patient.setGender(patientDto.getGender());
		patient.setAddress(patientDto.getAddress());
		patient.setPhoneNumber(patientDto.getPhoneNumber());
		
		patientrepository.save(patient);
		
		return patient;
	}

	@Override
	public void delete(Integer id)
	{
		patientrepository.deleteById(id);
		
	}

}
