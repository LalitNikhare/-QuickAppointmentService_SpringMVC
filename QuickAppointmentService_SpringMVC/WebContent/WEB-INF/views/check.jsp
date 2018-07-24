<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
div align="center">
        <h2>Enter Details</h2>
    </div>
    <div align="center">
        <h4>Enter Your details</h4>
        <div align="left">
           <form action="checkAppointment" method="POST" modelAttribute ="doctorAppointment">
           	<h5>Appointment ID: 
           		<form:input path="doctorAppointment.appointmentId" size="30" />
           		<form:errors path="doctorAppointment.appointmentId" />
           	</h5>
           <input type="submit" value="Register" />
           <input type="reset" value="Reset" />
           </form>
        </div>
    </div>
</body>
</html>