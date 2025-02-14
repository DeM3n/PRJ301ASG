<%-- 
    Document   : register
    Created on : Feb 14, 2025, 2:20:18 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
         <link rel="stylesheet" href="css/styles.css">
           <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
    </head>
    <body>
        <div class="loginpage">
        <form action="" method="post">
            <h2>Register</h2>
            <div class="input-box"> 
                <input type="email" placeholder="Gmail" required=""/>
                <i class='bx bxl-gmail'></i>
            </div>
             <div class="input-box"> 
                <input type="text" placeholder="Username" required />
                 <i class='bx bxs-user'></i>
                </div>
                <div class="input-box">
                <input type="password" placeholder="Password" required />
            <i class='bx bx-low-vision'></i>
                </div>
             <div class="input-box">
                <input type="password" placeholder="Confirm Password" required />
            <i class='bx bx-low-vision'></i>
                </div>
              <button type="submit" class="button">Submit</button>
               <div class="register-link">
                     <p>Already have an account?
                         <a href="login.jsp">Sign in</a> </p> 
                </div>
        </form>
        </div>
    </body>
</html>
