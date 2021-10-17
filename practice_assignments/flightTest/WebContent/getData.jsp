<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% ArrayList<String> cities = new ArrayList<String>(); %>
<%
	cities.add("Mumbai");
	cities.add("Murud");
	cities.add("Delhi");
	cities.add("Dehradun");

	cities.add("Chennai");
	cities.add("Chiplun");

	cities.add("Kolkatta");
	cities.add("Kota");

	cities.add("Pune");
	cities.add("Puri");

	String cityToFind = request.getParameter("whichCity");
	 
	 for(String city : cities ) { 
	  if(city.startsWith(cityToFind)) {
	 %>
	 <h3> <%=city %></h3>
	 <%}
	 }%>

	
</body>
</html>