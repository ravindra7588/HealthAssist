package com.cg.ha.reporsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.cg.ha.query.*;

import com.cg.ha.entity.Patient;


public interface PatientDAO extends JpaRepository<Patient,Long> {
	@Query(QueryUtil.VIEW_pat_BY_ID)
	public boolean findByPatientId(long patientId) ;
	
		
	}
     

