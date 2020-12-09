package com.cg.ha.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.ha.entity.Doctor;

import com.cg.ha.entity.Patient;
import com.cg.ha.exception.RecordNotFoundException;
import com.cg.ha.reporsitory.DoctorDAO;

import com.cg.ha.reporsitory.PatientDAO;
@Service("DoctorService")
@Transactional
public class DoctorServiceImp implements DoctorService {
     @Autowired
	private PatientDAO patientdao;
     @Autowired
     private DoctorDAO doctordao;
     @Override
 	public Long add(Doctor doctor) {
 		// TODO Auto-generated method stub
    	 doctordao.save(doctor);
    	 
 	   	
 		return doctor.getDoctorId();
 	}
 
 	@Override
 	public Optional<Doctor> findDoctor(Long Id) {
 		Optional<Doctor> doctor= doctordao.findById(Id);
 		
 		return doctor;
 	}

 	@Override
 	public List<Doctor> FindAll() {
 		// TODO Auto-generated method stub
 		
 		return doctordao.findAll();
 	}

	@Override
	public Patient update(String prescription, long patientId) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		
		Patient patient= 
	patientdao.findById(patientId).orElseThrow(()-> new RecordNotFoundException("not found"));
		
		
			String First=patient.getPrescription();
			patient.setPrescription(First+","+prescription);
			
		
		return patient;
	}

	@Override
	public Optional<Patient> findPatient(Long Id){
		// TODO Auto-generated method stub
		Optional<Patient> patient=patientdao.findById(Id);
	
		return patient;
		
	}

	@Override
	public Patient VewPatientMedicalHistory(Long Id) throws RecordNotFoundException {
		Patient patient= 
				patientdao.findById(Id).orElseThrow(()-> new RecordNotFoundException("Medical History not found"));
		
		return patient;
	}

	

	
}
