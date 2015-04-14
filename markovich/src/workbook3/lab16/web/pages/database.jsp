<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Markovich
  Date: 14.04.2015
  Time: 12:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1 align="center">Table of expenses</h1>
<table align="center" border="1">
    <tr>
        <th><b>№</b></th>
        <th><b>date</b></th>
        <th><b>receiver</b></th>
        <th><b>value</b></th>
    </tr>
    <c:forEach var="expense" items="${data}">
        <tr>
            <td><c:out value="${expense.idExpense}"></c:out></td>
            <td><c:out value="${expense.paydate}"></c:out></td>
            <td><c:out value="${expense.nameReceiver}"></c:out></td>
            <td><c:out value="${expense.value}"></c:out></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
