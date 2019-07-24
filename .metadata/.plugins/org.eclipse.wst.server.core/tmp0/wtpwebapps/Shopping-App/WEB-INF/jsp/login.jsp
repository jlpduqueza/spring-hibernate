<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Shopping App</title>
   </head>

   <body>
      <h2>Log In</h2>
      <h4>${message}</h4>
      <form:form method = "POST" action = "/Shopping-App/login">
         <table>
            <tr>
               <td><form:label path = "username">Username</form:label></td>
               <td><form:input path = "username" /></td>
            </tr>
            <tr>
               <td><form:label path = "password">Password</form:label></td>
               <td><form:password path = "password" /></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
   
</html>