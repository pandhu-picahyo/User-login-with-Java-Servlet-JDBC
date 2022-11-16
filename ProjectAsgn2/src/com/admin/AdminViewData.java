package com.admin;

import com.info.User;
import com.dao.UserDao;

import java.io.IOException;  
import java.io.PrintWriter;
import java.util.List;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

@WebServlet("/ViewData")  
public class AdminViewData extends HttpServlet {  
	private static final long serialVersionUID = 1L;
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        
    	response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        
        String n = request.getParameter("name");  
        out.print("Welcome "+n);    
          
        List<User> list=UserDao.getAllUsers();  
          
        out.print("<table border='1' width='100%'");  
        out.print(
        		"<tr><th>Id</th> "+ 
        		"<th>Name</th>" + 
        		"<th>Email</th>" + 
        		"<th>Username</th>" +
        		"<th>View</th>" +
        		"<th>Edit</th>" +
        		"<th>Delete</th></tr>");
        
        for(User e:list){  
         out.print(
        		 	"<tr><td>"+e.getId()+"</td>"
        		 		+ "<td>"+e.getName()+"</td>"
        		  		+ "<td>"+e.getEmail()+"</td>"
        		  		+ "<td>"+e.getUsername()+"</td>"
        		  		+ "<td><a href='DetailData?id="+e.getId()+"'>view</a></td>"
        		  		+ "<td><a href='EditData?id="+e.getId()+"'>edit</a></td>"
        		  		+ "<td><a href='DeleteData?id="+e.getId()+"'>delete</a></td></tr>");  
        
        }  
        out.print("</table>");  
          
        out.close();  
    }  
}  