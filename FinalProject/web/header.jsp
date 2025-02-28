<%-- 
    Document   : header
    Created on : Feb 25, 2025, 12:28:13 PM
    Author     : no-solace
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <style>
        /* Reset CSS */
        @import url('https://fonts.googleapis.com/css2?family=Nunito+Sans:ital,opsz,wght@0,6..12,200..1000;1,6..12,200..1000&family=Nunito:ital,wght@0,200..1000;1,200..1000&display=swap');
        @import url('https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css');

        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: "Nunito", serif;
        }

        /* Body Styling */
        body {
            background-color: #FAFAFA;
            /* Màu nền nhẹ nhàng */
            color: #2C2C2C;
            /* Màu chữ thanh lịch */
            line-height: 1.8;
            font-size: 18px;
        }

        /* Header */
        .header {
            width: 100%;
            background-color: #FFFFFF;
            height: 70px;
            padding: 10px 50px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            border-bottom: 2px solid #DDD;
        }

        .navtab h1 {
            align-items: center;
            border-bottom: 2px #000;
        }

        /* Logo */
        .logo {
            width: 20%;
            display: flex;
            height: 50px;

        }

        .logo img {
            height: 100%;
            border-radius: 10px;
        }

        .logo h1 {
            line-height: 20px;
            display: flex;
            align-items: center;
            justify-items: center;
            padding: 10px;
            border-left: 2px solid;
            border-color: #000;
            font-size: 20px;
            font-weight: 700;
            color: #2C2C2C;
            margin-top: 10px;
            margin-left: 10px;
            height: 30px;
        }

        /* Navigation */
        .navbar ul {
            align-items: center;
            list-style: none;
            display: flex;
            gap: 25px;
        }

        .navbar ul li a {
            text-decoration: none;
            color: #333;
            font-size: 18px;
            font-weight: 500;
            padding: 10px 15px;
            transition: 0.3s;
        }

        .navbar ul li a:hover {
            color: #000;
            border-bottom: 2px solid #333;
        }

        /* Call-to-Action Button */
        .cta {
            display: flex;
            align-items: center;
        }

        .user-section {
            height: 50px;
            width: 20%;
            justify-content: right;
            justify-items: right;
            display: flex;
            align-items: center;
        }

        .user-section .signin {
            justify-items: center;
            align-items: center;
            padding: 10px 10px;
            font-size: 20px;
            font-weight: 700;
            background-color: transparent;
            height: 80%;
            border: none;
            margin: 10px;
            transition: 0.3s;
        }

        .user-section .signin:hover {
            color: #000;
            border-bottom: 2px solid #333;
        }

        .user-section .icon-person {
            margin-right: 10px;
        }


        /* Footer */
        .footer {
            background-color: #F5F5F5;
            text-align: center;
            padding: 20px;
            font-size: 16px;
            color: #777;
            border-top: 2px solid #DDD;
        }
    </style>
    <head>
        <meta charset="UTF-8" />
        <title>Test</title>
        <link rel="stylesheet" href="style.css">
    </head>

    <body>

        <header class="header">
            <div class="logo">
                <img src="assets/images/logo.png" alt="tel Logo" style="width: 50px ; height: 50px">
                <h1>SISYPHUS</h1>
            </div>

            <nav class="navbar">
                <ul class ="home-btn">
                    <li><a href="#">Home</a></li>
                    <li><a href="#">Service</a></li>
                    <li><a href="#">About Us</a></li>
                    <li><a href="#">Contact</a></li>
                </ul>
            </nav>
            <div class="user-section">
                <button class="signin" onclick="window.location.href = 'login.jsp'"> <span
                        class="fa fa-user icon-person"></span>Sign in</button>
            </div>
        </header>

    </body>

</html>