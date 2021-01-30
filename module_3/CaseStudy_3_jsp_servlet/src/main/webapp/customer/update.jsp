<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 1/30/2021
  Time: 10:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="customers" method="post">
    <h5>Full Name</h5>
    <input type="text" name="name" value="${requestScope.customer.name}" >
    <h5>Gender</h5>
    <c:if test="${requestScope.customer.gender.equals('Male')}">
        <input type="radio" name="gender" value="Male" checked > Male
        <input type="radio" name="gender" value="Female"> Female
        <input type="radio" name="gender" value="Other"> Other
    </c:if>

    <c:if test="${requestScope.customer.gender.equals('Female')}">
        <input type="radio" name="gender" value="Male"> Male
        <input type="radio" name="gender" value="Female" checked> Female
        <input type="radio" name="gender" value="Other"> Other
    </c:if>

    <c:if test="${requestScope.customer.gender.equals('Other')}">
        <input type="radio" name="gender" value="Male"> Male
        <input type="radio" name="gender" value="Female"> Female
        <input type="radio" name="gender" value="Other" checked > Other
    </c:if>
    <h5>Type</h5>
    <select name="type" id="type">
        <option value="" hidden>--Choose--</option>
        <option value="1">Diamond</option>
        <option value="2">Platinum</option>
        <option value="3">Gold</option>
        <option value="4">Silver</option>
        <option value="5">Member</option>
    </select>
    <h5>Date of Birth</h5>
    <input type="date" name="birth" value="${requestScope.customer.birth}">
    <h5>ID Card</h5>
    <input type="number" name="card" value="${requestScope.customer.idCard}">
    <h5>Phone</h5>
    <input type="number" name="phone" value="${requestScope.customer.phone}">
    <h5>Email</h5>
    <input type="email" name="email" value="${requestScope.customer.email}">
    <h5>Address</h5>
    <input type="text" name="address" value="${requestScope.customer.address}">
    <input type="submit" value="update">
</form>
</body>
</html>