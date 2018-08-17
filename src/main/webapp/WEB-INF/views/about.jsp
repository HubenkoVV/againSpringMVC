<%--
  Created by IntelliJ IDEA.
  User: Vladyslava_Hubenko
  Date: 8/16/2018
  Time: 2:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/WEB-INF/valid.jsp" %>
<html>
<head>
    <title><spring:message code="user.info"/></title>
</head>
<body>

<h3>${user.name} ${user.surname}</h3>
<h2><spring:message code="cars"/></h2>
<br/>
<c:forEach var="car" items="${user.cars}">
    <tr>
        <td>${car.model}</td>
    </tr>
</c:forEach>
</body>
</html>
