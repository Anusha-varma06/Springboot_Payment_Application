<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Bank Account</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        margin: 0;
        padding: 0;
        height: 100vh;
        background: linear-gradient(to right, #141e30, #243b55);
        display: flex;
        justify-content: center;
        align-items: center;
    }

    form {
        background-color: #ffffff;
        padding: 40px 30px;
        border-radius: 16px;
        box-shadow: 0 10px 20px rgba(0,0,0,0.2);
        width: 100%;
        max-width: 400px;
    }
    h2 {
        text-align: center;
        margin-top: 0;
        margin-bottom: 30px;
        color: #243b55;
        font-size: 24px;
    }

    .form-group {
        margin-bottom: 15px;
    }

    input[type="text"] {
        width: 100%;
        padding: 12px;
        border: 1px solid #ccc;
        border-radius: 8px;
        font-size: 14px;
        box-sizing: border-box;
        transition: border-color 0.3s;
    }

    input[type="text"]:focus {
        border-color: #007bff;
        outline: none;
    }

    button {
        width: 100%;
        padding: 12px;
        background-color: #007bff;
        color: white;
        border: none;
        border-radius: 8px;
        font-size: 16px;
        cursor: pointer;
        transition: background-color 0.3s ease;
        margin-top: 10px;
    }

    button:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
    <form action="/addBank" method="POST">
    	<h2>Add Bank Account</h2>
        <div class="form-group">
            <input type="text" name="bankacc_number" placeholder="Bank account number" required>
        </div>
        <div class="form-group">
            <input type="text" name="bank_name" placeholder="Bank name" required>
        </div>
        <div class="form-group">
            <input type="text" name="ifsc_code" placeholder="IFSC code" required>
        </div>
        <div class="form-group">
            <input type="text" name="accountStatus" placeholder="Account status" required>
        </div>
        <div class="form-group">
            <input type="text" name="account_branchlocation" placeholder="Branch location" required>
        </div>
        <div class="form-group">
            <input type="text" name="current_balance" placeholder="Current balance" required>
        </div>
        <button type="submit">submit</button>
    </form>
</body>
</html>
    