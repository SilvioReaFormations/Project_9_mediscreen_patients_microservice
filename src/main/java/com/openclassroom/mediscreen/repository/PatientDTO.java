package com.openclassroom.mediscreen.repository;

import java.io.Serializable;

public class PatientDTO implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer patient_id;
	private String firstName;
	private String lastName;
	private String birthdate;
	private String gender;
	private String address;
	private String phoneNumber;
	
	
	
	public PatientDTO(Integer patient_id, String firstName, String lastName, String birthdate, String gender,
			String address, String phoneNumber)
	{
		super();
		this.patient_id = patient_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdate = birthdate;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	

	public PatientDTO(String firstName, String lastName, String birthdate, String gender, String address,
			String phoneNumber)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdate = birthdate;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}



	public PatientDTO()
	{
		super();
	}



	public Integer getPatientId()
	{
		return patient_id;
	}

	public void setPatientId(Integer patientId)
	{
		this.patient_id = patientId;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getBirthdate()
	{
		return birthdate;
	}

	public void setBirthdate(String birthdate)
	{
		this.birthdate = birthdate;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	
	
}
