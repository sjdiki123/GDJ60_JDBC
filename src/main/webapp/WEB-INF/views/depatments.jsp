<%@page import="com.iu.main.departments.DepartmentDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h>departments List page</h>
<%
ArrayList<DepartmentDTO> ar = (ArrayList)request.getAttribute("list");

%>
<div>
<h3>   <%=ar.get(0).getDepartment_name() %>    </h3>
</div>




</body>
</html>