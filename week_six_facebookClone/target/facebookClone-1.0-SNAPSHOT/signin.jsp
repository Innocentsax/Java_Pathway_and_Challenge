<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Signin</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<%-- Other JSP code --%>

<c:if test="${not empty error_message}">
    <p>${error_message}</p>
</c:if>

<%-- Other JSP code --%>
<form action="<%=request.getContextPath()%>/signin" method="post">
    <%--@declare id="dateofbirth"--%><%--@declare id="gender"--%><h1>Sign In</h1>


    <p>It's quick and easy.</p>


    <input type="email" name="email" placeholder="Email Address" required><br>

    <input type="password" name="password" placeholder="Password" required><br>

    <p>By clicking Sign Up, you agree to our <a href="#">Terms</a> and that you have read our <a href="#">Data Policy</a>, including our <a href="#">Cookie Use</a>.</p>

    <button type="submit">Sign In</button>
</form>
<br/>


<a href="hello-servlet">Hello Servlet</a>
</body>
</html>