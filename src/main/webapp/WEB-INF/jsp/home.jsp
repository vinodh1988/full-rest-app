<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Spring boot  - MVC working</h1>
<h3>Programmers</h3>
<hr/>
<ul>
  <%
      String[] names=  (String[])request.getAttribute("names");
      for(String name : names) {
  %>
  <li><%=name %></li>
  <% } %>
  
</ul>
</body>
</html>