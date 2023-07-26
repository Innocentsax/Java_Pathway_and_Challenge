<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<form action="<%=request.getContextPath()%>/signup" method="post">
  <%--@declare id="dateofbirth"--%><%--@declare id="gender"--%><h1>Create a New Account</h1>
  <p>It's quick and easy.</p>

  <input type="text" name="firstname" placeholder="First Name" required>
  <input type="text" name="lastname" placeholder="Last Name" required><br>

  <input type="email" name="email" placeholder="Email Address" required><br>

  <input type="password" name="password" placeholder="Password" required><br>

    <label for="dateOfBirth">Date of Birth:</label>
    <select name="birthday_day" required>
      <option value="" disabled selected>Day</option>
      <!-- Add options for days 1 to 31 -->
      <script>
        for (let day = 1; day <= 31; day++) {
          document.write('<option value="' + day + '">' + day + '</option>');
        }
      </script>
    </select>

    <select name="birthday_month" required>
      <option value="" disabled selected>Month</option>
      <!-- Add options for months January to December -->
      <script>
        const months = [
          'January', 'February', 'March', 'April', 'May', 'June',
          'July', 'August', 'September', 'October', 'November', 'December'
        ];

        for (let i = 0; i < months.length; i++) {
          document.write('<option value="' + (i + 1) + '">' + months[i] + '</option>');
        }
      </script>
    </select>

    <select name="birthday_year" required>
      <option value="" disabled selected>Year</option>
      <!-- Add options for years, e.g., 1990 to 2023 -->
      <script>
        const currentYear = new Date().getFullYear();
        const startYear = 1990;
        const endYear = currentYear;

        for (let year = startYear; year <= endYear; year++) {
          document.write('<option value="' + year + '">' + year + '</option>');
        }
      </script>
    </select><br>

    <label for="gender">Gender:</label>
    <select name="gender" required>
      <option value="" disabled selected>Options</option>
      <option value="Male">Male</option>
      <option value="Female">Female</option>
    </select>


    <p>By clicking Sign Up, you agree to our <a href="#">Terms</a> and that you have read our <a href="#">Data Policy</a>, including our <a href="#">Cookie Use</a>.</p>

  <button type="submit">Sign Up</button>

</form>
<a href="signin.jsp" ><button type="submit">Sign In</button></a>
<br/>


<a href="hello-servlet">Hello Servlet</a>
</body>
</html>