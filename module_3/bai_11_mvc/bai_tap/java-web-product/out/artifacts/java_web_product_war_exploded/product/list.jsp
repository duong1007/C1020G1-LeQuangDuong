<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 1/26/2021
  Time: 2:49 PM
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
<form method="get" action="/products">
    <div class="form-group">
        <label for="exampleInputEmail1">Search By Name</label>
        <input type="text" class="form-control" id="exampleInputEmail1" name="searchName">
        <input type="hidden" name="action" value="search">
        <input type="submit" value="search">
    </div>
</form>
<table class="table">
    <thead class="thead-dark">
    <tr>
        <th scope="col">#</th>
        <th scope="col">Name</th>
        <th scope="col">Price</th>
        <th scope="col">Description</th>
        <th scope="col">Manufacture</th>
        <th scope="col">Image</th>
        <th scope="col">Edit</th>
        <th scope="col">Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="product" items="${requestScope.products}" varStatus="loop">
    <tr>
        <th scope="row"><c:out value="${loop.count}"/></th>
        <td><c:out value="${product.name}"/></td>
        <td><c:out value="${product.price}"/></td>
        <td><c:out value="${product.description}"/></td>
        <td><c:out value="${product.manufacture}"/></td>
        <td><img src="${product.img}" alt="#"></td>
        <td><a href="/products?action=edit&id=${product.getId()}">edit</a></td>
        <td><a href="/products?action=delete&id=${product.getId()}">delete</a></td>
    </tr>
    </c:forEach>
    </tbody>
</table>
<p>
    <a href="/products?action=create">Create new Product</a>
</p>
</body>
</html>