<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="com.paymentapplication.demo.entities.*" %>
<%
    // Assume bank accounts are stored in session as List<String>
    List<BankAccountsDetailsEntity> userBankAccounts = ((UserDetailsEntity) session.getAttribute("userProfile")).getBanks() ;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Send Money</title>
<style>
    body {
        font-family: Arial, sans-serif;
        padding: 30px;
        background: linear-gradient(to right, #141e30, #243b55);
        color: #fff;
    }

    form {
        background: white;
        padding: 20px;
        border-radius: 10px;
        color: #000;
        max-width: 400px;
        margin: auto;
    }

    input, select, button {
        width: 100%;
        padding: 10px;
        margin: 10px 0;
        border-radius: 6px;
        border: 1px solid #ccc;
        font-size: 14px;
    }

    button {
        background-color: #007bff;
        color: white;
        border: none;
    }

    button:hover {
        background-color: #0056b3;
    }

    .hidden {
        display: none;
    }

    h2 {
        text-align: center;
    }
</style>
<script>
    function toggleBankAccountsDropdown() {
        var method = document.getElementById("paymentMethod").value;
        var bankDropdown = document.getElementById("bankAccountsDropdown");
        if (method === "1") {
            bankDropdown.classList.remove("hidden");
        } else {
            bankDropdown.classList.add("hidden");
        }
    }
</script>
</head>
<body>
    <form action="/processSendMoney" method="POST">
        <h2>Send Money</h2>

        <input type="number" name="amountToSend" placeholder="Amount to send" required/>

        <label>From:</label>
        <select name="fromMethod" id="paymentMethod" onchange="toggleBankAccountsDropdown()" required>
            <option value="">-- Select Payment Method --</option>
            <option value="1">Bank Account</option>
            <option value="2">Wallet</option>
        </select>

        <!-- Dropdown populated from session -->
        <div id="bankAccountsDropdown">
            <label>Select Your Bank Account:</label>
            <select name="fromBankAccount">
                <% if (userBankAccounts != null) {
                    for (BankAccountsDetailsEntity account : userBankAccounts) {
                %>
                    <option value="<%= account.getBankName() %>"><%= account.getBankName() %></option>
                <%  }
                } else { %>
                    <option disabled>No bank accounts found</option>
                <% } %>
            </select>
        </div>

        <label>To:</label>
        <input type="text" name="recieverAccount" placeholder="Recipient's Account Number" required/>
        <input type="text" name="recieverBankName" placeholder="Recipient's Bank Name" required/>

        <button type="submit">Send Money</button>
    </form>
</body>
</html>
    