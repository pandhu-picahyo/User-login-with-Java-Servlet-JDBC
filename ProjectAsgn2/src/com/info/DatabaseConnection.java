package com.info;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public Connection getConnection() {
        
    	Connection conn;
        try 
        {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/asignment2", "root", "root");
            return conn;
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(new DatabaseConnection().getConnection());
    }
}