package com.cg.ha.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cg.ha.entity.Doctor;
import com.cg.ha.entity.Patient;
import com.cg.ha.exception.RecordNotFoundException;
import com.cg.ha.reporsitory.PatientDAO;
import com.cg.ha.service.DoctorService;
import ch.qos.logback.classic.Logger;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DoctorController {
	@Autowired
	private PatientDAO patientdao;
	@Autowired
	private DoctorService doctorservice;
	final Logger log=(Logger) org.slf4j.LoggerFactory.getLogger(DoctorController.class);
	@PostMapping("/patients/new")
	
	public Patient createPersist(@RequestBody Patient patient) {
		log.info("create a new patient"+patient.toString());
		return patientdao.save(patient);
		
	}
	@PostMapping("/insertdoctor")
	public Long create (@RequestBody Doctor doctor) {
		log.info("create a new Doctor"+doctor.toString());
		doctorservice.add(doctor);
		return doctor.getDoctorId();
		
	}
	@GetMapping("/doctor/{Id}")
	public Doctor findDoctorById(@PathVariable(value="Id")Long Id) throws RecordNotFoundException {
		log.info("Doctor find By Id");
		Doctor doctor=doctorservice.findDoctor(Id).orElseThrow(()-> new RecordNotFoundException("Doctor is not found"));
		return doctor;
		
	}
	@GetMapping("/doctor/All")
	public List<Doctor> getAllDoctors( ){
		log.info("Get All Doctors List");
		return doctorservice.FindAll();
	}
	
	@GetMapping("/patient/{Id}")
	public Patient findPatient(@PathVariable(value="Id")Long medId) throws RecordNotFoundException {
		log.info("Get patient by id");
		Patient patient=doctorservice.findPatient(medId).orElseThrow(()-> new RecordNotFoundException("Patient is not found"));
			
		
		return patient;
		
	}
	@GetMapping("/patient2/{Id}")
	public String viewPatientMedicalHistory(@PathVariable(value="Id")Long Id) throws RecordNotFoundException {
		log.info("view patient medical history");
		Patient patient= doctorservice.VewPatientMedicalHistory(Id);
	return patient.getMedicalhistory();
	}
	
	@PutMapping("/patient/{id}")
	public Patient updatePrescription(@PathVariable(value="id")Long id,@RequestBody String prescription ) throws RecordNotFoundException{
		log.info("updatePrescription");
		Patient patient=doctorservice.update(prescription, id);
		
		return patient;
	}
	@PutMapping("/patient3/{Id}")
	public Patient addMedicalHistory(@PathVariable(value="Id")Long Id,@RequestBody String medical) throws RecordNotFoundException {
           log.info("Add Medical History");
		Patient patient=doctorservice.VewPatientMedicalHistory(Id);
           	String medicalhistory=patient.getMedicalhistory();
		patient.setMedicalhistory(medicalhistory+","+medical);
		return patient;
	}

}
