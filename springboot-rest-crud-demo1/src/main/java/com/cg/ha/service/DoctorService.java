package com.cg.ha.service;

import java.util.List;
import java.util.Optional;

import com.cg.ha.entity.Doctor;
import com.cg.ha.entity.Patient;
import com.cg.ha.exception.RecordNotFoundException;



public interface DoctorService {
	public Long add(Doctor doctor);
	public Optional<Doctor> findDoctor(Long Id);
	public List<Doctor> FindAll() ;
	public Optional<Patient> findPatient(Long Id);
	public Patient update (String prescription,long patientId) throws RecordNotFoundException;
	//View patient medical historyS
	public  Patient VewPatientMedicalHistory(Long Id) throws RecordNotFoundException;
   
}
