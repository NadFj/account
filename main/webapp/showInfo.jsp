<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<script type="text/javascript">

function onSubmitTrans(){
	alert("in submit 1111111 clisl");
	 window.location="http://localhost:8081/transaction?customerId=1";
	 <%-- encodeURIComponent(request.getParameter("customerId"));--%>
}
</script>
<head>
<meta charset="ISO-8859-1">
<title>Account Information</title>
</head>
<body>
<form action="transaction"  id ="subform" >

 <h3> Account details : </h3>
<input type ="text" disabled="disabled" id="customerId" name="customerId" value =' <%=request.getParameter("customerId") %> '> 
 <table border="2" cellspacing="5" cellpadding="5" style="text-align: LEFT" name= "tableAccount">
	  <tr>
	  <td>
<label >Customer Id: </label> </td><td><%=request.getParameter("customerId") %> </td></tr>
<tr>
	  <td>Customer Name: </td><td>  <%=request.getParameter("name") %>   </td></tr>
<tr>
	  <td>Customer surName:</td><td>  <%=request.getParameter("surName") %>   </td></tr>
<tr>
	  <td>Initial credit :</td> <td> <%=request.getParameter("initialCredit") %>  </td></tr>

</table>
<br />
 <INPUT TYPE="button" value="Display customer transactions"  id="getInfo" onclick="onSubmitTrans()"/>
</form>
</body>
</html>