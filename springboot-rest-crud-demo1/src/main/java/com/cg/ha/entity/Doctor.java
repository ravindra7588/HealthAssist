package com.cg.ha.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="doctornew1")
public class Doctor{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long doctorId;
	private String doctorName;
	private String specialization;
	private String department;
	private Long doctorPhNo;
	
	/**
	 * Create an instance of doctor with given parameters.
	 */
	public Doctor(String doctorName, String specialization, String department, Long doctorPhNo) {
		super();
		
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.department = department;
		this.doctorPhNo = doctorPhNo;
	}
	
	public Doctor()
	{
		super();
	}
	
	
	
	 // @return the doctor id present in the database. 
  public Long getDoctorId() {
		return doctorId;
	}
     //set the id of the doctor.
	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}
	
	 // return the doctor name present in database.
	public String getDoctorName() {
		return doctorName;
	}
	 // set the name of the doctor.
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	
  // return the specialization of the doctor.
	public String getSpecialization() {
		return specialization;
	}
    	
   //set the specialization of the doctor.
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	//@return the department of the doctor.

	public String getDepartment() {
		return department;
	}
	
	//set the department of the doctor.

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	//@return the doctorPhno of the doctor.

	public Long getDoctorPhNo() {
		return doctorPhNo;
	}
	//set the department of the doctor.
	public void setDoctorPhNo(Long doctorPhNo) {
		this.doctorPhNo = doctorPhNo;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", specialization=" + specialization
				+ ", department=" + department + ", doctorPhNo=" + doctorPhNo + "]";
	}
}