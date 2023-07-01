<%--
  Created by IntelliJ IDEA.
  User: whaks
  Date: 2023-06-30
  Time: 오후 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String name = (String) request.getAttribute("name"); %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>이름 : <%= name%>, ${name}
</h1>
</body>
</html>
