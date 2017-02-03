<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
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
       <form:form method="post" action="save">  
       <center>
       <h1>Create Account</h1>
      	<table>  
         <tr>  
          <td>Username : </td> 
          <td><form:input path="name" title="Please enter valid username"/></td>
         </tr>  
         <tr>  
          <td>Password :</td>  
          <td><form:input type="Password" path="Password" title="Please enter valid Password"/></td>
         </tr> 
         <tr>  
          <td>Mobile :</td>  
          <td><form:input type="Number" path="Mobile" title="Please enter Mobile Number of 10 digit"/></td>
         </tr> 
         <tr>
         <td>
           Refer your Friend: </td>
          <td><form:input type="text" path="Referral" title="Please refer your friend"/></td>
         </tr>
         <tr>   
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
        </center>
       </form:form> 
</div>
</body>