<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Successful addition</title>
    <link href="/resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<%@ include file="navbar.jsp" %>
<div class="container">
    <div class="col-md-6 col-md-offset-3">
        <div class="text-center">
            <h2><spring:message code="message.successful"/></h2>
        </div>
        <div class="text-center">
            <h4><spring:message code="message.model"/> ${userJSP.bikeModel};</h4>
        </div>
        <div class="text-center">
            <h4><spring:message code="message.bikeType"/> ${userJSP.bikeModel};</h4>
        </div>
        <div class="text-center">
            <a href="/" class="btn btn-default"><spring:message code="message.button.addnewbike"/></a>
        </div>
    </div>
</div>
</body>
</html>
