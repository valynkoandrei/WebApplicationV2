<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name="Save" action="SaveRecordServlet" method="POST">
    <table border="1">
        <tr>
            <td><input type="text" value="<%=session.getAttribute("name")%>" name="inputName"/></td>
        </tr>

        <tr>
            <td><input type="text" value="<%=session.getAttribute("surname")%>" name="inputSurname"/></td>
        </tr>

        <tr>
            <td><input type="text" value="<%=session.getAttribute("phone")%>" name="inputPhone"/></td>
        </tr>

    </table>
    <input type="hidden" name="page" value="/record.jsp"/>
    <input type="submit" name="showButton" class="input-button" value="Save"/>
</form>

</body>
</html>
