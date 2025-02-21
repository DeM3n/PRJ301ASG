<%-- 
    Document   : login
    Created on : Feb 14, 2025, 8:27:14 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login form</title>
        <link rel="stylesheet" href="css/styles.css">
       <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>

    <body>
        <div class="loginpage">
            <form action="" method="post">
                <h2>Login</h2>
                <div class="input-box"> 
                <input type="text" placeholder="Username" required />
                 <i class='bx bxs-user'></i>
                </div>
                <div class="input-box">
                <input type="password" placeholder="Password" required />
               <i class='bx bxs-lock' ></i>
                </div>
                <div class="remember-forget">
                    <label>  <input type="checkbox"/>Remember me</label>
                    <a href="ResetPW.jsp">Forgot Password?</a>
                </div>
                <button type="submit" class="button">Log in</button>
                <div class="register-link">
                     <p>Don't have an account?
                         <a href="register.jsp">Register</a> </p> 
                </div>
            </form>
        </div>
        <%@include file="footer.jsp" %>
    </body>
</html>
