<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
    <link href="/resources/css/bootstrap.min.css" rel="stylesheet">
    <title>Index page</title>
</head>
<body>

<div class="container">
    <div class="col-md-6 col-md-offset-3">

        <span style="float: right">
    <a href="?lang=en">en</a>
    <a href="?lang=ru">ru</a>
    </span>


        <form:form class="form-horizontal" method="post" modelAttribute="userJSP" action="check-user">
            <div class="form-group">
                <spring:message code="message.name.placeholder" var="namePlaceholder"/>
                <form:label path="name"><spring:message code="message.name"/></form:label>
                <form:input path="name" class="form-control" placeholder="${namePlaceholder}"/>
            </div>
            <div class="form-group">
                <spring:message code="message.password.placeholder" var="passwordPlaceholder"/>
                <form:label path="name"><spring:message code="message.password"/></form:label>
                <form:password path="password" class="form-control" placeholder="${passwordPlaceholder}"/>
            </div>
            <div class="form-group">
                <form:button class="btn btn-primary"><spring:message code="message.button.register"/></form:button>
            </div>
        </form:form>
    </div>
</div>



</body>
</html>
