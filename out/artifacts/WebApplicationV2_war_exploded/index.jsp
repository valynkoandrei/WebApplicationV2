<%--
  Created by IntelliJ IDEA.
  User: Andrei
  Date: 21.10.2016
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Index</title>
  </head>
  <body>
     <form name="List" action="ListServlet" method="post">
         <jsp:forward page="/ListServlet"/>

     </form>
  </body>
</html>
