package com.capgemini.doctors.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.service.DoctorAppointmentService;
import com.capgemini.doctors.service.IDoctorAppointmentService;


@Controller
public class DoctorActionController {

	@Autowired
	IDoctorAppointmentService doctorAppointmentService;

	@RequestMapping(value = "/bookAppointment")
	public ModelAndView registerCustomer(@ModelAttribute("doctorAppointment") DoctorAppointment doctorAppointment, BindingResult result) {
		try {
			if (result.hasErrors())
				return new ModelAndView("booking");
			doctorAppointment=doctorAppointmentService.addDoctorAppointmentDetails(doctorAppointment);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("bookingSuccess", "doctorAppointment", doctorAppointment);
	}
	@RequestMapping(value = "/checkAppointment")
	public ModelAndView showCustomer(@ModelAttribute("doctorAppointment") DoctorAppointment doctorAppointment, BindingResult result ) {
		try {
			if(result.hasErrors())
				return new ModelAndView("check");
			doctorAppointment = doctorAppointmentService.getAppointmentDetails(doctorAppointment.getAppointmentId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("checkResult", "doctorAppointment", doctorAppointment);
	}

}
