<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Successful addition</title>
    <link href="/resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<%@ include file="navbar.jsp" %>
<div class="container">
    <div class="col-md-6 col-md-offset-3">
            <%--<h4><spring:message code="message.model"/> ${userJSP.bikesList};</h4>--%>
                <table class="table table-bordered">
            <thead>
            <tr>
                <td>ID</td>
                <td>Model</td>
                <td>Type</td>
            </tr>
            </thead>
            <c:forEach items="${bikesList}" varStatus="сounter">
                <tr>
                    <td>${bikesList[сounter.count-1].id}</td>
                    <td>${bikesList[сounter.count-1].bikeModel}</td>
                    <td>${bikesList[сounter.count-1].bikeType}</td>
                </tr>
            </c:forEach>
        </table>
                <a href="/" class="btn btn-primary"><spring:message code="message.button.addnewbike"/></a>
    </div>
</div>
</body>
</html>
