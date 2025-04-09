<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.paymentapplication.demo.entities.UserDetailsEntity" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>LOGGED IN SUCCESFULLY</h1>
 <% UserDetailsEntity user= (UserDetailsEntity)request.getAttribute("userProfile"); %>
 <div>
 	<h2>Welcome <%=user.getUserName() %></h2>
 	<h2>First name: <%=user.getFirstName() %></h2>
 	<h2>Last name: <%=user.getLastName() %></h2>
 	<h2>Mobile: <%=user.getPhoneNumber()%></h2>
 	<h2>Email: <%=user.getEmail() %></h2>
 	<h2>Address: <%=user.getAddress() %></h2>
 </div>
 
</body>
</html>