<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/24/2021
  Time: 1:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="email" action="/save" method="post">
    <table>
        <tr>
            <td>Languages:</td>
            <td>
                <form:select path="languages" items="${languages}"/>
            </td>
        </tr>
        <tr>
            <td>Page Size:</td>
            <td>
                Show
                <form:select path="pageSize" items="${pageSize}"/>
                email per page
            </td>
        </tr>

        <tr>
            <td>Spam filter:</td>
            <td>
                <form:checkbox path="spamsFilter" value="true"/> Enable Spams filter
            </td>
        </tr>

        <tr>
            <td>Signature:</td>
            <td>
                <form:textarea path="signature"/>
            </td>
        </tr>
        <tr>
            <td>
                <button type="submit">Update</butt  on>
            </td>
            <td>
                <button>Cancer</button>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
