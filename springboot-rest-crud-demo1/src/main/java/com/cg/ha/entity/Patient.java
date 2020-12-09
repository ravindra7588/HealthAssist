package com.cg.ha.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="patientnew3")

public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long patientId;
	private String patientName;
	private int patientAge;
	private long phoneNumber;
	private String patientAddress;
	private String prescription;
	private String medicalhistory;
	private String patientUserName;
	private String patientPassword;
	
	public Patient() {
		super();
	}
	


	public Patient(long patientId, String patientName, int patientAge, long phoneNumber, String patientAddress,
			String prescription, String medicalhistory, String patientUserName, String patientPassword) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.phoneNumber = phoneNumber;
		this.patientAddress = patientAddress;
		this.prescription = prescription;
		this.medicalhistory = medicalhistory;
		this.patientUserName = patientUserName;
		this.patientPassword = patientPassword;
	}





	public String getMedicalhistory() {
		return medicalhistory;
	}



	public void setMedicalhistory(String medicalhistory) {
		this.medicalhistory = medicalhistory;
	}



	public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	public String getPatientUserName() {
		return patientUserName;
	}
	public void setPatientUserName(String patientUserName) {
		this.patientUserName = patientUserName;
	}
	public String getPatientPassword() {
		return patientPassword;
	}
	public void setPatientPassword(String patientPassword) {
		this.patientPassword = patientPassword;
	}



	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientAge=" + patientAge
				+ ", phoneNumber=" + phoneNumber + ", patientAddress=" + patientAddress + ", prescription="
				+ prescription + ", Medicalhistory=" + medicalhistory + ", patientUserName=" + patientUserName
				+ ", patientPassword=" + patientPassword + "]";
	}
	
	
	
	
 
}
	