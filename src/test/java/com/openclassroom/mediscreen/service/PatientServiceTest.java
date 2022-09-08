package com.openclassroom.mediscreen.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.openclassroom.mediscreen.model.Patient;
import com.openclassroom.mediscreen.repository.PatientDTO;
import com.openclassroom.mediscreen.repository.PatientRepository;


@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class PatientServiceTest
{

	@InjectMocks
	PatientServiceImpl psImpl;
	
	@Mock
	PatientRepository psRepo;
	
	PatientDTO patientDtoTest = new PatientDTO(
			"firstName",
			"lastName",
			"birthdate",
			"gender",
			"address",
			"phoneNumber");
	
	@Test
	public void createPatientMethodTest()
	{
		Patient newPatientTest = psImpl.create(patientDtoTest);
		assertEquals("firstName", newPatientTest.getFirstName());
		assertEquals("lastName", newPatientTest.getLastName());
		assertEquals("address", newPatientTest.getAddress());
		assertEquals("phoneNumber", newPatientTest.getPhoneNumber());
	}
	
	@Test
	public void updatePatientMethodTest()
	{
		Patient newPatientTest = new Patient();
		when(psRepo.findById(1)).thenReturn(Optional.of(newPatientTest));
		
		psImpl.update(1, patientDtoTest);
		
		assertEquals("firstName", newPatientTest.getFirstName());
		assertEquals("lastName", newPatientTest.getLastName());
		assertEquals("address", newPatientTest.getAddress());
		assertEquals("phoneNumber", newPatientTest.getPhoneNumber());
		
	}
	
	@Test
	public void readPatientMethodTest()
	{
		Patient newPatientTest = new Patient(
				"patientFirstName",
				"patientLastName",
				"patientBirthdate",
				"patientGender",
				"patientAddress",
				"patientPhoneNumber");
		
		newPatientTest.setPatientId(1);
		
		when(psRepo.findById(1)).thenReturn(Optional.of(newPatientTest));
		
		PatientDTO readPatientDTO = psImpl.read(1).get();
		
		assertEquals("patientFirstName", readPatientDTO.getFirstName());
		assertEquals("patientLastName", readPatientDTO.getLastName());
		assertEquals("patientGender", readPatientDTO.getGender());
		assertEquals("patientAddress", readPatientDTO.getAddress());
	}
	
	@Test
	public void readAllPatientsMethodTest()
	{
		
		List<Patient> patientList = new ArrayList<>();
		Patient patient = new Patient(
				"patientFirstName",
				"patientLastName",
				"patientBirthdate",
				"patientGender",
				"patientAddress",
				"patientPhoneNumber");
		patient.setPatientId(1);
		patientList.add(patient);
		
		when(psRepo.findAll()).thenReturn(patientList);
		
		List<PatientDTO> patientDTOList = psImpl.readAll();
		
		assertTrue(patientDTOList.get(0).getFirstName().equals("patientFirstName"));
		
	}
	
	@Test
	public void deletePatientMethodTest()
	{
		Patient newPatientTest = new Patient(
				"patientFirstName",
				"patientLastName",
				"patientBirthdate",
				"patientGender",
				"patientAddress",
				"patientPhoneNumber");
		
		newPatientTest.setPatientId(1);
		
		psImpl.delete(1);
		
		psRepo.delete(newPatientTest);
		
		verify(psRepo).delete(newPatientTest);

		
	}
	
}
