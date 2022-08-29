package com.openclassroom.mediscreen.service;

import java.util.List;
import java.util.Optional;

import com.openclassroom.mediscreen.model.Patient;
import com.openclassroom.mediscreen.repository.PatientDTO;

public interface PatientService 
{
	public List<PatientDTO> readAll();
	public Optional<PatientDTO> read (Integer id);
	public Patient create (PatientDTO patient);
	public Patient update(Integer id, PatientDTO patient);
	public void delete (Integer id);
}
