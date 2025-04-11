<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/addBank" method="POST">
	<pre>
		<input type="text" name="bankacc_number" placeholder="Bank account number" required><br>
		<input type="text" name="bank_name" placeholder="Bank name" required><br>
        <input type="text" name="ifsc_code" placeholder="ifsc code" required><br>
        <input type="text" name="accountStatus" placeholder="Account status" required><br>
        <input type="text" name="account_branchlocation" placeholder="Branch location" required><br>
        <input type="text" name="current_balance" placeholder="Current balance" required><br>
        <button type="submit">submit</button>
	</pre>    
    </form>
</body>
</html>