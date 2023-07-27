<%--
  Created by IntelliJ IDEA.
  User: dea
  Date: 7/27/23
  Time: 3:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="custom.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <script src="script.js"></script>
    <script src="https://kit.fontawesome.com/dbc64abf3e.js" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">

    <div class="sub-container facebook-title">
                <span class="facebook-heading">
                    facebook
                </span>
        <p class="facebook-info"> Facebook helps you connect and share with the people in your life.</p>
    </div>
    <div class="sub-container form-options" >
        <form action="login" method="post">
            <input type="text" name="username" class="user-input" placeholder="Email address or phonenumber">
            <input type="password" name="password" class="user-input" placeholder="password">
            <button class="btn" id="submit"> <i class='fas fa-user-lock' style='font-size:24px'></i>  Login</button>
            <a id="forgotten-password">Forgotten password? </a>
            <hr/>
            <a class="btn-new-acc btn" id="new-account"> <i class='fas fa-user-plus' style='font-size:24px'></i>  Create New Account</a>
        </form>
    </div>

    <div class="container-2" style="display: none;" id="container-2">
        <div id="create-acc">
            <h3>New User Account</h3>
            <hr/>
            <form action="new_user/account" method="post">
                <input type="text" name="first_name" class="user-input" placeholder="First name"/>
                <input type="text" name="last_name" class="user-input" placeholder="Last name"/>
                <input type="email" name="email" class="user-input" placeholder="email or phone number"/>
                <input type="date" class="user-input" name="dob" />
                <div>
                    <select name="gender" class="user-input">
                        <option>Female</option>
                        <option>Male</option>
                    </select>
                </div>
                <input type="password" name="pw" class="user-input" placeholder="New password"/>

                <button class="btn btn-new-acc" id="signup">Sign Up</button>
            </form>
            <hr/>
            <hr/>
            <button class="btn btn-new-acc" id="back-to-login">Login</button>
        </div>
    </div>
</div>
</body>
</html>