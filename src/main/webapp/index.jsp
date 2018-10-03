<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Todo's</title>
</head>

<body>
<h2>Hello World!</h2>

<form action="/mail" method="post">
  <input type="text" name="recipient" placeholder="Recipient Name" />
  <input type="text" name="message" placeholder="message" />
  <input type="submit" value="Add" />
</form>



</body>
</html>