package com.UserManagement.Dalrada;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import org.apache.catalina.tribes.group.Response;

@WebServlet("/page")
public class page extends GenericServlet {
	private static final long serialVersionUID = 1L;

public page() {
  super();
}

public void service(ServletRequest request , ServletResponse response) {
	Connection con=null;
	PreparedStatement per=null;
	String Full_Name=request.getParameter("p1");
	String Email=request.getParameter("p2");
	String Role=request.getParameter("p3");
	String Password=request.getParameter("p4");
	
	try {
		PrintWriter pr=response.getWriter();
		pr.println("you are done with the registration");
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=");
		per=con.prepareStatement("insert into Demo.user_manage values(?,?,?,?)");
		per.setString(1,Full_Name);
		per.setString(2,Email);
		per.setString(3,Role);
		per.setString(4,Password);
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally{
		try {
			if(con!=null) {
				con.close();
			}
			if(per!=null) {
				per.close();
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	
	}
	}
}