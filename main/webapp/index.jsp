<%@page import="com.clients.Customer"%>
<!-- %@page import="com.clients.AccountServlet"-->
<%@ page import = "java.io.*,java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Account Information </title>
<script type="text/javascript">  
function setCustomersValues(param){  
//alert("customVal:1 ");  
var accountformVal= document.getElementById("accountForm");
//alert("customVal===: "+accountformVal.customerId.value);  
//alert("param===: "+param);  

var formPost= document.getElementById("formPost");

if(param=="customerId"){
	
formPost.customerId.value=accountformVal.customerId.value ;  
}
if(param=="name"){
formPost.name.value=accountformVal.name.value ;}

if(param=="surName"){
formPost.surName.value=accountformVal.surName.value ;
}
if(param=="initialCredit"){
formPost.initialCredit.value=accountformVal.initialCredit.value ;
}
//alert("formpost param===: "+param);  

}  
</script> 

</head>
<body>
<FORM  id="accountForm" method="get" action= "account">
<div style="padding-top: 20" align="justify">
		<br>
		<label>Customer Id :</label>  <input  type = "number" name = "customerId" id ="customerId" onchange="setCustomersValues(name)"/>
        <INPUT TYPE="submit" value="Display customer informations"  id="submit"  />

		
<br>
		<label></label> Customer Name:  <input type = "text" name = "name" id = "name" onchange="setCustomersValues(name)"/>
	<br>
		<label> Customer Surname: </label><input type = "text" name = "surName" id = "surName" onchange="setCustomersValues(name)"/>
		
        <label> Initial Credit: </label><input type = "number" name = "initialCredit" id= "initialCredit" onchange="setCustomersValues(name)"/>

</div>
         


         
      

</FORM>
<form action="AccountServlet" method ="post" id ="formPost" >
<br>

<div hidden="true">
		<br>
		id<input type = "text" name = "customerId" id ="customerId" >
		
<br>
		<label>Customer Name: </label><input type = "text" name = "name" id = "name">
	<br>
		<label>Customer Surname:</label> <input type = "text" name = "surName" id = "surName">
		
         <label>Initial Credit: </label><input type = "number" name = "initialCredit" id= "initialCredit"/>

		

</div>
        <input  value = "Create Account" id="submit" TYPE="submit"  />
        
        
    <br>

</form>
 

</body>
</html>