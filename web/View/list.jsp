<%@ page import="Controller.Clients" %>
<%@ page import="static Controller.BL.clientsArrayList" %>
<%@ page import="static servlet.ListServlet.arrayList" %><%--
  Created by IntelliJ IDEA.
  User: Andrei
  Date: 21.10.2016
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>

<%--<form name="List" action="ListServlet" method="post">--%>
    <%--<input type="hidden" name="page" value="/list.jsp" />--%>



<table border="1">
    <% for (int i=0;i!=arrayList.size();i++)
             {%>
    <tr>
        <td><%=clientsArrayList.get(i).getId()%></td>
        <td><%=clientsArrayList.get(i).getName()%></td>
        <td><%=clientsArrayList.get(i).getSurname()%></td>
        <td><%=clientsArrayList.get(i).getPhone()%></td>
        <td><form name="Edit" action="EditRecordServlet" method="POST">
            <input type="hidden" name="page" value="/list.jsp" />
            <input type="hidden" name="id" value=<%=clientsArrayList.get(i).getId()%> />
            <input type="submit" name="showButton" class="input-button" value="Edit" />
        </form></td>
        <td><form name="Delete" action="DeleteRecordServlet" method="POST">
            <input type="hidden" name="page" value="/list.jsp" />
            <input type="hidden" name="id" value=<%=clientsArrayList.get(i).getId()%> />
            <input type="submit" name="showButton" class="input-button" value="Delete" />
        </form></td>
    </tr>
    <% } %>

   </table>
<%--</form>--%>
<form name="Add" action="AddRecordServlet" method="POST">
    <%--<input type="hidden" name="page" value="/list.jsp" />--%>
    <input type="submit" name="showButton" class="input-button" value="Add" />
</form>

</body>
</html>
