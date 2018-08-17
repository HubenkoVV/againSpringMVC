<%--
  Created by IntelliJ IDEA.
  User: Vladyslava_Hubenko
  Date: 8/16/2018
  Time: 12:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/WEB-INF/valid.jsp" %>
<html>
<head>
    <title><spring:message code="list.users"/></title>
</head>
<body>

<table style="text-align: center;" border="1px" cellpadding="0" cellspacing="0" >
    <thead>
    <tr>
        <th width="25px">id</th><th width="100px"><spring:message code="name"/></th><th width="100px"><spring:message code="surname"/></th>
        <th width="50px"><spring:message code="role"/></th><th width="50px"></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="user" items="${userList}">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.surname}</td>
            <td>${user.role}</td>
            <td>
                <a href="${pageContext.request.contextPath}/users/about/${user.id}"><spring:message code="details"/></a><br/>
                <a href="${pageContext.request.contextPath}/users/delete/${user.id}"><spring:message code="delete"/></a><br/>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

Language : <a href="?lang=en">English</a> | <a href="?lang=de">Deutsch</a>
Current Locale : ${pageContext.response.locale} / ${locale}

</body>
</html>
