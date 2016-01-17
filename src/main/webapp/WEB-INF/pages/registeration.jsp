<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link href="<c:url value="/resources/static/css/register.css" />" rel="stylesheet">
  <title>Registration</title>
</head>
<body>
<div align="center">

  <fieldset>
  <form:form action="register" method="get" commandName="userForm">
        <legend><span class="number">1</span>Rejestracja do systemu</legend>
        <label>Nazwa uzytkownika:</label>
        <form:input path="name" />
        <label>Haslo:</label>
        <form:password path="password" />
        <button type="submit" value="Register">Zarejestruj</button>
  </form:form>
  </fieldset>
</div>
</body>
</html>