<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
    <link href="/resources/css/bootstrap.min.css" rel="stylesheet">
    <title>Add bike page</title>
</head>
<body>
<%@ include file="navbar.jsp" %>
<br>
<div class="container-fluid">
    <div class="col-md-4 col-md-offset-4">
        <form:form class="form-horizontal" method="post" modelAttribute="userJSP" action="save-bike">
            <div class="form-group">
                <spring:message code="message.model.placeholder" var="namePlaceholder"/>
                <form:label path="bikeModel"><spring:message code="message.model"/></form:label>
                <form:input path="bikeModel" class="form-control" placeholder="${namePlaceholder}"/>
            </div>
            <div class="form-group">
                <spring:message code="message.bikeType.placeholder" var="passwordPlaceholder"/>
                <form:label path="bikeType"><spring:message code="message.bikeType"/></form:label>
                <form:input path="bikeType" class="form-control" placeholder="${passwordPlaceholder}"/>
            </div>
            <div class="form-group">
                <form:button class="btn btn-primary"><spring:message code="message.button.addbike"/></form:button>
            </div>
        </form:form>
    </div>
</div>
</body>
</html>
