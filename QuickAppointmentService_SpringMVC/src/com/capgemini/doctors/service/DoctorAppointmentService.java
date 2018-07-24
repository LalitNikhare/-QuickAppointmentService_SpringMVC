package com.capgemini.doctors.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.dao.IDoctorAppointmentDao;
import com.capgemini.doctors.exception.QASException;

@Component(value = "iDoctorAppointmentService")
public class DoctorAppointmentService implements IDoctorAppointmentService {

	@Autowired
	private IDoctorAppointmentDao idaDao;

	public int generateAppointmentId() {
		double rndDouble = Math.random();
		return (int) (rndDouble * 100000);

	}

	// This method calls DoctorAppointmentDao for adding the appointment after
	// assigning Doctor name and appointment status
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public DoctorAppointment addDoctorAppointmentDetails(DoctorAppointment doctorAppointment) throws QASException {
		int appointmentId = 0;
		assignDoctor(doctorAppointment, doctorAppointment.getProblemName());
		doctorAppointment.setAppointmentId(generateAppointmentId());
		idaDao.save(doctorAppointment);
		if (appointmentId == 0)
			throw new QASException("Cannot set appointment");
		return doctorAppointment;
	}

	// This method calls DoctorAppointmentDao for getting the appointment requested
	// by UI
	@Override
	public DoctorAppointment getAppointmentDetails(int appointmentId) throws QASException {
		DoctorAppointment newDoctorAppointment = null;
		newDoctorAppointment = idaDao.findOne(appointmentId);
		return newDoctorAppointment;
	}

	// This method assigns Doctor name based on the problemName given to it
	public DoctorAppointment assignDoctor(DoctorAppointment da, String condition) throws QASException {
		if (condition.toLowerCase().equalsIgnoreCase("heart")) {
			da.setAppointmentStatus("APPROVED");
			da.setDoctorName("Dr. Brijesh Kumar");
		} else if (condition.toLowerCase().equalsIgnoreCase("gynecology")) {

			da.setAppointmentStatus("APPROVED");
			da.setDoctorName("Dr. Sharda Singh");
		} else if (condition.toLowerCase().equalsIgnoreCase("Diabetes")) {
			da.setAppointmentStatus("APPROVED");
			da.setDoctorName("Dr. Heena Khan");
		} else if (condition.toLowerCase().equalsIgnoreCase("ENT")) {
			da.setAppointmentStatus("APPROVED");
			da.setDoctorName("Dr. Paras Mal");
		} else if (condition.toLowerCase().equalsIgnoreCase("bone")) {
			da.setAppointmentStatus("APPROVED");
			da.setDoctorName("Dr Renuka Kher");
		} else if (condition.toLowerCase().equalsIgnoreCase("Dermatology")) {
			da.setAppointmentStatus("APPROVED");
			da.setDoctorName("Dr. Kanika Kapoor");
		} else
			da.setAppointmentStatus("DISAPPROVED");
		return da;
	}

}
