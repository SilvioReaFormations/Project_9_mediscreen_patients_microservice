package com.openclassroom.mediscreen.service;

import java.util.ArrayList;
import java.util.List;
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
	public Optional<PatientDTO> read(Integer patient_Id)
	{
		Patient patient = patientrepository.findById(patient_Id).get();
		
		PatientDTO patientDTO = new PatientDTO(
				patient.getPatientId(),
				patient.getFirstName(), 
				patient.getLastName(), 
				patient.getBirthdate(), 
				patient.getGender(), 
				patient.getAddress(), 
				patient.getPhoneNumber());
		
		return Optional.of(patientDTO);
	}

	@Override
	public Patient update(Integer patient_Id, PatientDTO patientDto)
	{
		Patient patient = patientrepository.findById(patient_Id).get();
		
		
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
	public void delete(Integer patient_Id)
	{
		patientrepository.deleteById(patient_Id);
		
	}

	@Override
	public List<PatientDTO> readAll()
	{
		List<Patient> list = patientrepository.findAll();
		List<PatientDTO> listDTO = new ArrayList<>();
		
		for (Patient patientList : list)
		{
			listDTO.add(new PatientDTO(
					patientList.getPatientId(),
					patientList.getFirstName(),
					patientList.getLastName(),
					patientList.getBirthdate(),
					patientList.getGender(),
					patientList.getAddress(),
					patientList.getPhoneNumber()));
		}
		
		return listDTO;
	}

}
