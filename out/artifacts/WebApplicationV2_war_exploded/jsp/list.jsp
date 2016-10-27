<%@ page import="static servlet.ListServlet.arrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
    <link rel="stylesheet" type="text/css" href="style/style.css" >
</head>
<body>
<h1 style="text-align: center">Phone Book</h1>
<table border="1">
    <tr>
        <th>id</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Phone</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
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
<script src="js/alert.js" ></script>
</body>
</html>
