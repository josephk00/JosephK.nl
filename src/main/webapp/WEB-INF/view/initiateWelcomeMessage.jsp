<%--
  Created by IntelliJ IDEA.
  User: ame21103
  Date: 5-5-2016
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>The Trial</title>
</head>
<body>
<form:form method="POST" action="/trial/addWelcomeMessage">
    <table>
        <tr>
            <td><form:label path="welcomeMessage"></form:label></td>
            <td><form:input path="welcomeMessage"/></td>
        </tr>
            <td colspan="2">
                <input type="submit" value="Submit"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
