<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Appointment</title>
</head>
<body>
<div align="center">
        <h2>Enter Details</h2>
    </div>
    <div align="center">
        <h4>Enter Your details</h4>
        <div align="left">
           <form action="bookAppointment" method="POST" modelAttribute ="doctorAppointment">
           	<h5>Name: 
           		<form:input path="doctorAppointment.patientName" size="30" />
           		<form:errors path="doctorAppointment.patientName" />
           	</h5>
           <h5>Mobile Number: <form:input path="doctorAppointment.phoneNumber" size="30" />
           <form:errors path="doctorAppointment.phoneNumber" /></h5>
           
           <h5>Enter Email: <form:input path="doctorAppointment.email" size="30" />
           <form:errors path="doctorAppointment.email" /></h5>
           
           <h5>Enter Age: <form:input path="doctorAppointment.age" size="30" />
           <form:errors path="doctorAppointment.age" /></h5><br>
           
           <h5>Gender: <form:input path="doctorAppointment.gender" size="30" />
           <form:errors path="doctorAppointment.gender" /></h5>
           
           <h5>Problem Name: <form:input path="doctorAppointment.problemName" size="30" />
           <form:errors path="doctorAppointment.problemName" /></h5>
           
           <input type="submit" value="Register" />
           <input type="reset" value="Reset" />
           </form>
        </div>
    </div>
</body>
</html>