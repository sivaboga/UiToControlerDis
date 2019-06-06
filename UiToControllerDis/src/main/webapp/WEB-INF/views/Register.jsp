<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.err{
	color:red
	}
</style>
</head>
<body>
<h3>Welcome to Employee Register Page</h3>
<form:form action="save" method="POST" modelAttribute="employee">
<pre>
    NAME  : <form:input path="empName"/>
    		<form:errors path="empName" cssClass="err"/>
 PASSWORD : <form:password path="empPwd"/>
 			<form:errors path="empPwd" cssClass="err"/>
 GENDER   : <form:radiobutton path="empGen" value="Male"/> Male <form:radiobutton path="empGen" value="Female"/> Female
 			<form:errors path="empGen" cssClass="err"/>
 ADDRESS  : <form:textarea path="empAddr"/> 
 			<form:errors path="empAddr" cssClass="err"/>
 COUNTRY  : <form:select path="empCountry">
 				<form:option value="">-SELECT-</form:option>
 				<form:option value="IND">India</form:option>
 				<form:option value="AUS">AUS</form:option>
 			</form:select>	
 			<form:errors path="empCountry" cssClass="err"/>
LANGUAGES:<form:checkbox path="empLangs" value="ENGLISH"/>ENGLISH	
		  <form:checkbox path="empLangs" value="TELUGU"/>TELUGU 
		  <form:checkbox path="empLangs" value="HINDI"/>HINDI
		 <form:errors path="empLangs" cssClass="err"/>
<input type="submit" value="REGISTER">		
</pre>
</form:form>

</body>
</html>