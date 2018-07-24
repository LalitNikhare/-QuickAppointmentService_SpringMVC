package com.capgemini.doctors.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.exception.QASException;

public interface IDoctorAppointmentDao extends JpaRepository<DoctorAppointment, Integer>{

}
