<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.paymentsapplication.demo.entity.UserDetailsEntity" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>

form{
display:flex-row;
text-align:center;
justify-content:center;
width:fit-content;
}

input{
width:auto;
height:30px;
padding:15px;
font-size:20px;
font-weight:bold;
border-radius:8px;
background-color:#243b55;
color:white;


}


.profile{
display:flex;
  justify-content: center;
  
  width:fit-content;

}

.edit-btn{
height:40px;

}
</style>

<title>Insert title here</title>
</head>
<body>
<script>alert("Login Success")</script>
 <% UserDetailsEntity user= (UserDetailsEntity)session.getAttribute("userProfile"); %>
 
 <div class="profile">
 <form action="/editProfile" method="post">
 <table>
 <tr>
 <th>User Name</th><th>First Name</th><th>Last Name</th><th>Phone Number</th><th>Address</th></tr>
 <tr>
 <td><input type="text" value=<%= user.getUserName() %> readonly></td>  
 <td><input type="text" value=<%= user.getFirstName() %> readonly></td>  
 <td><input type="text" value=<%= user.getLastName() %> readonly></td>  
 <td><input type="text" value=<%= user.getPhoneNumber() %> readonly></td>  
 <td><input type="text" value=<%= user.getAddress() %> readonly></td></tr>
 <tr ><td colspan=5><input type="submit" value="Edit" class="edit-btn"></td></tr></table>

</form>  
 
 </div>
 
</body>
</html>