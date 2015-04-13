<%--
  Created by IntelliJ IDEA.
  User: Markovich
  Date: 11.04.2015
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style type="text/css">
    body {
        background-image: url('http://media.24ways.org/2008/02/pattern-example-2a.gif');
    }
</style>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Form Servlet example</title>
</head>
<body>
<div align="center" style="margin-top: 300px;">
    <form method="post" action="FormServlet">
        Name: <input type="text" name="name" size="20px"> <br>
        Phone number: <input type="text" name="phone" size="20px"> <br>
        e-mail: <input type="text" name="email" size="20px"> <br>
        <input type="submit" value="Done">
    </form>
</div>
</body>
</html>