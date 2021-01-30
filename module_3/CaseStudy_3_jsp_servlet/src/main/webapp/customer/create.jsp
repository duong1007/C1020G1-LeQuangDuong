<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 1/30/2021
  Time: 10:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="customers" method="post">
    <h5>Full Name</h5>
    <input type="text" name="name">
    <h5>Gender</h5>
    <input type="radio" name="gender" value="Male"> Male
    <input type="radio" name="gender" value="Female"> Female
    <input type="radio" name="gender" value="Other"> Other
    <h5>Type</h5>
    <select name="type" id="type">
        <option value="1">Diamond</option>
        <option value="2">Platinum</option>
        <option value="3">Gold</option>
        <option value="4">Silver</option>
        <option value="5">Member</option>
    </select>
    <h5>Date of Birth</h5>
    <input type="date" name="birth">
    <h5>ID Card</h5>
    <input type="number" name="card">
    <h5>Phone</h5>
    <input type="number" name="phone">
    <h5>Email</h5>
    <input type="email" name="email">
    <h5>Address</h5>
    <input type="text" name="address">
    <input type="submit" value="create">
</form>
</body>
</html>
