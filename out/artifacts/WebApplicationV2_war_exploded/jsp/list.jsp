<%@ page import="static servlet.ListServlet.arrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<table border="1">
    <% for (int i = 0; i != arrayList.size(); i++) {%>
    <tr>
        <td><%=arrayList.get(i).getId()%>
        </td>
        <td><%=arrayList.get(i).getName()%>
        </td>
        <td><%=arrayList.get(i).getSurname()%>
        </td>
        <td><%=arrayList.get(i).getPhone()%>
        </td>
        <td>
            <form name="Edit" action="EditRecordServlet" method="POST">
                <input type="hidden" name="page" value="/list.jsp"/>
                <input type="hidden" name="id" value=<%=i%> />
                <input type="submit" name="showButton" class="input-button" value="Edit"/>
            </form>
        </td>
        <td>
            <form name="Delete" action="DeleteRecordServlet" method="POST">
                <input type="hidden" name="page" value="/list.jsp"/>
                <input type="hidden" name="id" value=<%=i%> />
                <input type="submit" name="showButton" class="input-button" value="Delete"/>
            </form>
        </td>
    </tr>
    <% } %>

</table>
<form name="Add" action="AddRecordServlet" method="POST">
    <input type="submit" name="showButton" class="input-button" value="Add"/>
</form>
</body>
</html>
