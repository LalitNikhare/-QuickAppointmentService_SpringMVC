package com.capgemini.doctors.service;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.exception.QASException;

public interface IDoctorAppointmentService {
//	Interface methods for adding and getting appointment details
	DoctorAppointment addDoctorAppointmentDetails(DoctorAppointment doctorAppointment) throws QASException;
	
	DoctorAppointment getAppointmentDetails(int appointmentId) throws QASException;
}
