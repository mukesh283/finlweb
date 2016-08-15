<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>EMPLOYEE FORM</title>
	</head>
	<body>
		<h2>Add Employee Data</h2>
		<form:form method="POST" action="/sdnext/save.html">
	   		<table>
			    <tr>
			        <td><form:label path="id">Employee ID:</form:label></td>
			        <td><form:input path="id" value="${employee.id}" readonly="true"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="name">Employee Name:</form:label></td>
			        <td><form:input path="name" value="${employee.name}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="kin_id">Employee Kin_id:</form:label></td>
			        <td><form:input path="kin_id" value="${employee.kin_id}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="phone_no">Employee PhoneNo:</form:label></td>
			        <td><form:input path="phone_no" value="${employee.phone_no}"/></td>
			    </tr>
			    
			    <tr>
			        <td><form:label path="email_id">Employee Email:</form:label></td>
                    <td><form:input path="email_id" value="${employee.email_id}"/></td>
			    </tr>
			      <tr>
			        <td><form:label path="address">Employee Address:</form:label></td>
                    <td><form:input path="address" value="${employee.address}"/></td>
			    </tr>
			      <tr>
			        <td><form:label path="DOB">Employee Dob:</form:label></td>
                    <td><form:input path="DOB" value="${employee.DOB}"/></td>
			    </tr>
			      <tr>
			        <td><form:label path="DOJ">Employee Doj:</form:label></td>
                    <td><form:input path="DOJ" value="${employee.DOJ}"/></td>
			    </tr>
			      <tr>
			        <td><form:label path="departmentid">Employee Departmentid:</form:label></td>
                    <td><form:input path="departmentid" value="${employee.departmentid}"/></td>
			    </tr>
			      <tr>
			        <td><form:label path="projectid">Employee Projectid:</form:label></td>
                    <td><form:input path="projectid" value="${employee.projectid}"/></td>
			    </tr>
			      <tr>
			        <td><form:label path="rolesid">Employee Rolesid:</form:label></td>
                    <td><form:input path="rolesid" value="${employee.rolesid}"/></td>
			    </tr>
			    
			    
			    
			    
			    
			    <tr>
			      <td colspan="2"><input type="submit" value="Submit"/></td>
		      </tr>
			</table> 
		</form:form>
		
  <c:if test="${!empty employees}">
		<h2>List Employees</h2>
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
			<th>Actions on Row</th>
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
				
				
				
				
				
				<td align="center"><a href="edit.html?id=${employee.id}">Edit</a> | <a href="delete.html?id=${employee.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
	</body>
</html>