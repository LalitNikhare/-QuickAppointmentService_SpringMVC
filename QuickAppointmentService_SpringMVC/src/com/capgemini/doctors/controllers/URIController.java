package com.capgemini.doctors.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capgemini.doctors.bean.DoctorAppointment;

@Controller
public class URIController {
	@RequestMapping(value = "/")
	public String getindexPage() {
		return "index";
	}

	@RequestMapping(value = "/booking")
	public String getBookingPage() {
		return "booking";
	}

	@RequestMapping(value = "/check")
	public String getCheckPage() {
		return "check";
	}

	@ModelAttribute("doctorAppointment")
	private DoctorAppointment getDoctorAppointment() {
		return new DoctorAppointment();
	}

}
