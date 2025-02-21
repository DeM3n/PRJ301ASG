<%-- 
    Document   : RestartPW
    Created on : Feb 16, 2025, 12:26:44 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reset Password</title>
         <link rel="stylesheet" href="css/styles.css">
           <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
    </head>
    <body>
        <div class="loginpage">
        <form action="" method="post">
            <h2>Reset Password</h2>
           
              <div class="input-box"> 
                <input type="email" placeholder="Gmail" required=""/>
                <i class='bx bxl-gmail'></i>
            </div>
            <button type="submit" class="button">Submit</button>
               <div class="register-link">
                     <p>Already have an account?
                         <a href="login.jsp">Back to login</a> </p> 
                </div>
        </form>
        </div>
    </body>
</html>
