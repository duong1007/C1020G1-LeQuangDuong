<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 1/26/2021
  Time: 4:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
          integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>
<h1>Product List</h1>
<table class="table">
    <thead class="thead-dark">
    <tr>
        <th scope="col">Name</th>
        <th scope="col">Price</th>
        <th scope="col">Description</th>
        <th scope="col">Manufacture</th>
        <th scope="col">Image</th>
    </tr>
    </thead>
    <tbody>
        <tr>
            <td><c:out value="${requestScope.product.name}"/></td>
            <td><c:out value="${requestScope.product.price}"/></td>
            <td><c:out value="${requestScope.product.description}"/></td>
            <td><c:out value="${requestScope.product.manufacture}"/></td>
            <td><img src="${requestScope.product.img}" alt="#"></td>
        </tr>
    </tbody>
</table>
<p>
    <a href="/products">Back to product list</a>
</p>
</body>
</html>