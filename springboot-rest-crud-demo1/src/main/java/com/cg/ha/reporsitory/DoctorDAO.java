package com.cg.ha.reporsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.ha.entity.Doctor;



public interface DoctorDAO extends JpaRepository<Doctor,Long>  {

}
