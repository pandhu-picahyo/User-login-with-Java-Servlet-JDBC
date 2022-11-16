<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
    <title>Login</title>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">

</head>

<body>
<div class="limiter">
    <div class="container-login100">
            <div class="wrap-login100 p-t-50 p-b-90">
                <form action="login?status=typed" method="post" class="login100-form validate-form flex-sb flex-w">
                    <h3 align="center">Login</h3>

                    ${alert}

                    <label for="usernames">Username</label>
					<input type="text" id="address" name="username">
					<br><br>
					<label for="password">Password</label>
					<input type="text" id="password" name="password">
					<br><br><br>

                    <div class="container-login100-form-btn m-t-17">
                        <button type="submit" class="login100-form-btn">
                            Login
                        </button>
                    </div>
                </form>
            </div>

            <div class="text-center">
                <p class="txt1" style="color: #999999">
                    Don't have an account?
                    <a href="registrationpage.jsp" class="container-login100-form-btn m-t-17">
                        <button type="submit" class="login100-form-btn">
                            SIGN UP
                        </button>
                    </a>
                </p>
            </div>
    </div>
</div>

</body>
</html>