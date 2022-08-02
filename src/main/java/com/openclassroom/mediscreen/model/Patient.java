package com.openclassroom.mediscreen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "patient_id")
	private Integer patient_id;
	@Column(name= "first_name")
	private String firstName;
	@Column(name= "last_name")
	private String lastName;
	private String birthdate;
	private String gender;
	private String address;
	@Column(name= "phone_number")
	private String phoneNumber;
	
	
	
	public Patient(String firstName, String lastName, String birthdate, String gender, String adress,
			String phoneNumber)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdate = birthdate;
		this.gender = gender;
		this.address = adress;
		this.phoneNumber = phoneNumber;
	}


	
	
	

	public Patient()
	{
		super();
	}






	@Override
	public String toString()
	{
		return "Patient [firstName=" + firstName + ", lastName=" + lastName + ", birthdate=" + birthdate + ", gender="
				+ gender + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}






	public int getPatientId()
	{
		return patient_id;
	}



	public void setPatientId(int patient_id)
	{
		this.patient_id = patient_id;
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
