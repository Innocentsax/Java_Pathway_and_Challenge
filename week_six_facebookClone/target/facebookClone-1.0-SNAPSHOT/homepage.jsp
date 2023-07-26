<%--
  Created by IntelliJ IDEA.
  User: decagon
  Date: 23/06/2023
  Time: 00:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="model.User" %>
<%@ page import="model.Post" %>
<%@ page import="dao.UserDao" %>
<!DOCTYPE html>
<html>
<head>
    <title>Facebook</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
    <link rel="stylesheet" type="text/css" href="css/style.css">
<%--    <script src="js/script.js" defer></script>--%>
</head>
<body>
<header>
    <nav>
        <div class="logo">Facebook</div>
        <ul>
            <li>Home</li>
            <li>Profile</li>
            <li>Messages</li>
        </ul>
    </nav>
</header>

<main>
    <div class="content">
        <h1>Welcome to Facebook</h1>
<%--        <h3>${user.firstname}</h3>--%>

        <form id="post-form">
            <textarea id="post-input" placeholder="Write a post..."></textarea>
            <button type="submit">Post</button>
        </form>
        <div id="posts-container"></div>
    </div>
</main>

<footer>
    <p>&copy; 2023 Facebook. All rights reserved.</p>
</footer>
</body>
</html>
