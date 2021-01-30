<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 1/30/2021
  Time: 9:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<header>
    <h1>List customer</h1>
</header>
<nav>
    <a href="customers?action=create">Create</a>
</nav>
<section>
    <article>
        <table>
            <tr>
                <th>Name</th>
                <th>Gender</th>
                <th>Birth</th>
                <th>Type</th>
            </tr>
            <c:forEach var="customer" items="${requestScope.customers}">
                <tr>
                    <td><c:out value="${customer.name}"/> </td>
                    <td><c:out value="${customer.gender}"/> </td>
                    <td><c:out value="${customer.birth}"/> </td>
                    <td><c:out value="${customer.typeID}"/> </td>
                    <td><a href="customers?action=update&id=${customer.id}">Edit</a></td>
                    <td><a href="customers?action=delete&id=${customer.id}">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </article>
</section>
</body>
</html>
