<%@page import="cse.maven.sample.exception.InvalidNicNumberException"%>
<%@page import="cse.maven.sample.Person"%>
<%@page import="cse.maven.sample.NICInterpreter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>NIC interpreter</title>
<h1>NIC interpretation resutls</h1>

<h3>Results of the NIC interpretation is</h3>
<%
	String nic = request.getParameter("nic");

	NICInterpreter interpreter = new NICInterpreter();

	try {
		Person person = interpreter.getDetails(nic);
		out.println("Nic [birthday=BirthDay[year=" + person.getYear() + ", month="
				+ person.getMonth() + ", date=" + person.getDate()
				+ "]");
		out.println(", gender=" + person.getGender());
		out.println(", isVoter=" + person.isVoter()+"]");
	} catch (InvalidNicNumberException ex) {
		out.println(ex.getMessage());
	}
%>
</head>
<body>

</body>
</html>