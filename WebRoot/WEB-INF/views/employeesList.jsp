<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>All Employees</title>
</head>
<body>
<h1>List Employees</h1>
<h3><a href="add.html">Add More Employee</a></h3>

<c:if test="${!empty employees}">
	<table align="left" border="1">
		<tr>
			<th>Employee ID</th>
			<th>Employee Name</th>
			<th>Employee Kin_id</th>
			<th>Employee Email</th>
			<th>Employee Address</th>
			<th>Employee Dob</th>
			<th>Employee Doj</th>
			<th>Employee Phone_No</th>
			<th>Employee Departmentid</th>
			<th>Employee Projectid</th>
			<th>Employee Rolesid</th>
		</tr>

		<c:forEach items="${employees}" var="employee">
			<tr>
				<td><c:out value="${employee.id}"/></td>
				<td><c:out value="${employee.name}"/></td>
				<td><c:out value="${employee.kin_id}"/></td>
				<td><c:out value="${employee.email_id}"/></td>
				<td><c:out value="${employee.address}"/></td>
				<td><c:out value="${employee.DOB}"/></td>
				<td><c:out value="${employee.DOJ}"/></td>
				<td><c:out value="${employee.phone_no}"/></td>
				<td><c:out value="${employee.departmentid}"/></td>
				<td><c:out value="${employee.projectid}"/></td>
				<td><c:out value="${employee.rolesid}"/></td>
				
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>