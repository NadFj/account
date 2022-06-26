<%@page import="com.clients.Customer"%>
<%@page import="com.clients.servlets.TransactionServlet"%>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transaction Information</title>
</head>
<body>

 <h3> Account details : </h3>
 <table border="2" cellspacing="5" cellpadding="5" style="text-align: LEFT">
	  <tr>
	  <td>
<label >Customer Id: </label> </td><td> <%=request.getParameter("customerId") %> </td></tr>
<tr>
	  <td>Customer Name: </td><td>  <%=request.getParameter("name") %>   </td></tr>
<tr>
	  <td>Customer surName:</td><td>  <%=request.getParameter("surName") %>   </td></tr>
<tr>
	  <td>Initial credit :</td> <td> <%=request.getParameter("initialCredit") %>  </td></tr>

</table>
<br />

</body>
</html>