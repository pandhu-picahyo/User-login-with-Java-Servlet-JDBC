<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<header>
   	
     <h1>Welcome : <label for="name">${user.name}</label>
   
     <img class="icon" src="data:image/jpg;base64,${user.basephoto}"
            style="width: 50px; border-radius: 80%; margin-right: 10px; margin-bottom: 10px">
	 <a href="loginpage.html" class="container-login100-form-btn m-t-17">
            <button type="submit" class="login100-form-btn">
                  	LOG OUT </button></a>
	 </h1>
 	
</header>
</html>