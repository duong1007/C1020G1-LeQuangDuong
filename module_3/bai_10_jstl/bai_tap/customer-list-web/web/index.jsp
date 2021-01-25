<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 1/25/2021
  Time: 11:18 AM
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
  <table class="table">
    <thead class="thead-dark">
    <tr>
      <th colspan="5" style="text-align: center">Danh Sách Khách Hàng</th>
    </tr>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Name</th>
      <th scope="col">Date of Birth</th>
      <th scope="col">Add</th>
      <th scope="col">Avatar</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="customer" items="${requestScope.customers}" varStatus="loop">
    <tr>
      <th scope="row"><c:out value="${loop.count}"/></th>
      <td><c:out value="${customer.name}"/></td>
      <td><c:out value="${customer.date}"/></td>
      <td><c:out value="${customer.add}"/></td>
      <td><img src="${customer.img}" alt="#"></td>
    </tr>
    </c:forEach>
    </tbody>
  </table>
  </body>
</html>
