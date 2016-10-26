<%--
  Created by IntelliJ IDEA.
  User: Andrei
  Date: 21.10.2016
  Time: 12:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name="Save" action="SaveRecordServlet" method="POST">
<table border="1">
    <tr>
        <td><input type="text" value="<%=session.getAttribute("name")%>" name="inputName"/> </td>
    </tr>

    <tr>
        <td><input type="text" value="<%=session.getAttribute("surname")%>" name="inputSurname"/> </td>
    </tr>

    <tr>
        <td><input type="text" value="<%=session.getAttribute("phone")%>" name="inputPhone"/></td>
    </tr>

</table>


    <input type="hidden" name="page" value="/record.jsp" />
    <%--<input type="hidden" name="inputName"/>--%>
    <%--<input type="hidden" name="inputSurName" value="inputSurname"/>--%>
    <%--<input type="hidden" name="inputPhone" value="inputPhone"/>--%>
    <input type="submit" name="showButton" class="input-button" value="Save" />
</form>

</body>
</html>
