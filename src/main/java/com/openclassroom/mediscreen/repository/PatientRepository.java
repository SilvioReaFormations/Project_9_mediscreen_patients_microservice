package com.openclassroom.mediscreen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.openclassroom.mediscreen.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>
{

}
