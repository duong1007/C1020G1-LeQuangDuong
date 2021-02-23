<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/23/2021
  Time: 11:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Calculator</h1>
  <form action="/calculator">
    <span></span>
    <input type="text" name="numberA">
    <input type="text" name="numberB">
    <br/>
    <br/>
    <button type="submit" name="cal" value="add">Addition(+)</button>
    <button type="submit" name="cal" value="sub">Subtraction(-)</button>
    <button type="submit" name="cal" value="mul">Multiplication(X)</button>
    <button type="submit" name="cal" value="div">Division(/)</button>
  </form>
  <h3>Result: ${result} </h3>
  </body>
</html>
