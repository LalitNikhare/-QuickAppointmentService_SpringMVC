package com.capgemini.doctors.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class DoctorAppointment {
	
// All the variables declaration as per requirement
	@Id
	private int appointmentId;
	private String patientName;
	private String phoneNumber;
	private String email;
	private String gender;
	
	private int age;
	private String problemName;
	private String doctorName;
	private String appointmentStatus;
	
// Default Constructor of the class DoctorAppointment
	public DoctorAppointment() {
		super();
	}


	
//	Parameterized Constructor of the class DoctorAppointment

	public DoctorAppointment(int appointmentId, String patientName, String phoneNumber, String email, String gender,
			int age, String problemName, String doctorName, String appointmentStatus) {
		super();
		this.appointmentId = appointmentId;
		this.patientName = patientName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.gender = gender;
		this.age = age;
		this.problemName = problemName;
		this.doctorName = doctorName;
		this.appointmentStatus = appointmentStatus;
	}

//	Parameterized Constructor of the class DoctorAppointment for JUnit Testing




public DoctorAppointment(String patientName, String phoneNumber, String email, String gender, int age,
			String problemName) {
		super();
		this.patientName = patientName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.gender = gender;
		this.age = age;
		this.problemName = problemName;
	}



	// Getters and Setters for the variables of the class
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getProblemName() {
		return problemName;
	}
	public void setProblemName(String problemName) {
		this.problemName = problemName;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getAppointmentStatus() {
		return appointmentStatus;
	}
	public void setAppointmentStatus(String appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}
	
//	equals and hashCode methods are overwritten for the variable appointmentId
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + appointmentId;
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DoctorAppointment other = (DoctorAppointment) obj;
		if (appointmentId != other.appointmentId)
			return false;
		return true;
	}




// 	toString method for the class variables


	@Override
	public String toString() {
		return "DoctorAppointment [appointmentId=" + appointmentId + ", patientName=" + patientName + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", gender=" + gender + ", age=" + age + ", problemName="
				+ problemName + ", doctorName=" + doctorName + ", appointmentStatus=" + appointmentStatus + "]";
	}

}
