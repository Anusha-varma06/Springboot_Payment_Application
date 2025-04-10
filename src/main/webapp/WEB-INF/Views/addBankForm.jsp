<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addBank" method="POST">
	<pre>
		Bank Account Number<input type="text" name="Bankacc_number" placeholder="Bank account number" required>
		Bank Name<input type="text" name="Bank_name" placeholder="Bank name" required>
        Ifsc Code<input type="text" name="ifsc_code" placeholder="ifsc code" required>
        Account Status<input type="text" name="AccountStatus" placeholder="Account status" required>
        Branch Location<input type="text" name="Account_branchlocation" placeholder="Branch location" required>
        Current Balance<input type="text" name="Current_balance" placeholder="Current balance" required>
        <button type="submit">submit</button>
	</pre>    
    </form>
</body>
</html>