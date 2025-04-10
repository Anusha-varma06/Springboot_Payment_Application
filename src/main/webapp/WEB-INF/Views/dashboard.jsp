<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile - Paydesk</title>
<style>
body {
    margin: 0;
    padding: 0;
    font-family: Arial, sans-serif;
    background: linear-gradient(to right, #141e30, #243b55);
    color: white;
    text-align: center;
}

.container {
    width: 80%;
    margin: 20px auto;
    padding: 20px;
}


.header {
    border: 2px solid teal;
    padding: 15px;
    margin-bottom: 15px;
    position: relative;
    border-radius: 10px;
}

.header h1 {
    color: lightgreen;
    font-size: 22px;
}

.logout-btn {
    position: absolute;
    top: 15px;
    right: 15px;
    padding: 10px 20px;
    background-color: red;
    color: white;
    border: none;
    border-radius: 5px;
    font-size: 16px;
    cursor: pointer;
}


.account-info {
    border: 2px solid cyan;
    padding: 15px;
    margin-bottom: 15px;
    position: relative;
    border-radius: 10px;
}

.send-money-btn {
    position: absolute;
    bottom: 15px;
    right: 15px;
    padding: 10px 20px;
    background-color: red;
    color: white;
    border: none;
    border-radius: 5px;
    font-size: 16px;
    cursor: pointer;
}


.bank-cards {
    display: flex;
    justify-content: center;
    gap: 20px;
    margin-bottom: 15px;
}

.bank-card {
    width: 30%;
    padding: 15px;
    border: 2px solid goldenrod;
    background: rgba(255, 255, 255, 0.1);
    border-radius: 10px;
    text-align: left;
}

.bank-card .edit-btn {
    color: green;
    font-weight: bold;
    cursor: pointer;
}


.transaction-history {
    border: 2px solid silver;
    padding: 15px;
    margin-bottom: 15px;
    background: rgba(255, 255, 255, 0.1);
    border-radius: 10px;
    position: relative;
}

.detail-btn {
    display: block;
    margin: 15px auto 0; 
    padding: 8px 16px;
    background-color: brown;
    color: white;
    border: none;
    border-radius: 5px;
    font-size: 14px;
    cursor: pointer;
}
.App-name{
	font-weight:bold;
	font-family:serif;
	color:white;
	margin-bottom:20px;
}
</style>
</head>
<body>

<div class="container">
    <div class="App-name">Paydesk</div>
    <div class="header">
        <h1>Payments Web App</h1>
        <h2>Personal Details</h2>
        <jsp:include page="profile.jsp" />  <!-- adds the profile page -->

	</div>

   
    <div class="account-info">
        <p><strong>Primary Bank Account No:</strong> </p>
        <p><strong>Account Balance:</strong> </p>
        <p><strong>Wallet Balance:</strong>  <span style="color:red;">[+]</span></p>
        <button class="send-money-btn">Send money</button>
    </div>

   
    <div class="bank-cards">
    	<jsp:include page="bankAccounts.jsp">
        <div class="bank-card" style="border: 2px solid green; text-align:center;">
            <p style="color:green; font-size:20px;"><a href="/viewBankForm" style="text-decoration:none">[+]</a></p>
        </div>
    </div>
	<form name="On-loadform" method="get" action="/viewBanks"></form>
    
    <div class="transaction-history">
        <h2>Recent 10 Txns List</h2>
        <p>1000 sent to xyz</p>
        <p>1300 received from pqr</p>
        <p>120 received from 78877</p>
        <p>...</p>
        <p>...</p>
        <button class="detail-btn">Detailed Stmt</button>
    </div>
</div>

<script>
function logout() {
    window.location.href = "login.jsp"; // Redirect to login page
}
</script>

</body>
</html>