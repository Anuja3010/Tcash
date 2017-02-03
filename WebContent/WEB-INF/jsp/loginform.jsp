<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
      
		
		
		<style>
div.ex {
	text-align: right width:300px;
	padding: 10px;
	border: 5px solid grey;
	margin: 0px
}
</style>
<body bgcolor="silver">
	<div class="ex">
			
		<form:form method="post" action="Submit">  
       <center>
       <h1>Sign In</h1>
      	<table >  
         <tr>  
          <td>Username : </td> 
          <td><form:input path="name"  /></td>
         </tr>  
         <tr>  
          <td>Password :</td>  
          <td><form:input type="Password" path="Password" /></td>
         </tr>       
         <tr>   
          <td><input type="submit" value="Submit" /></td>  
         </tr>  
        </table> 
        </center> 
       </form:form>  
       </div>
</body>