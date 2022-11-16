package com.view;

import java.io.IOException;  
import java.io.PrintWriter;

import com.info.User;
import com.dao.UserDao;

import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse; 

@WebServlet("/UserView")  
public class UserView extends HttpServlet {  
	private static final long serialVersionUID = 1L;
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        
    	response.setContentType("text/html");  
        PrintWriter out=response.getWriter();    
        out.println("<h1>useeerrrrrrrrrrrrrrrrrrrrr Data</h1>");  
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
          
        User e= UserDao.getUserById(id);  
        
        out.print("<table border='1' width='100%'");
        out.print( 
        		"<br><h2>Name       : "+e.getName()+"</h2>" + 
        		"<h2>Email          : "+e.getEmail()+"</h2>" +
        		"<a href='EditData?id="+e.getId()+"'>edit</a>" +
        		"<a href='DeleteData?id="+e.getId()+"'>delete</a></h1></td></tr>");
        
        // get file name belum
        		  		  
        out.print("</table>"); 
        }
    	
            
}  