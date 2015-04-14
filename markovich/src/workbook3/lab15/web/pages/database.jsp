<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %>
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
        <td><b>ID</b></td>
        <td><b>date</b></td>
        <td><b>value</b></td>
        <td><b>receiver</b></td>
    </tr>
    <%Iterator itr;%>
    <% List data = (List) request.getAttribute("data");
        for (itr = data.iterator(); itr.hasNext(); ) {
    %>
    <tr>
        <td><%=itr.next()%>
        </td>
        <td><%=itr.next()%>
        </td>
        <td><%=itr.next()%>
        </td>
        <td><%=itr.next()%>
        </td>
    </tr>
    <%}%>
</table>
</body>
</html>
