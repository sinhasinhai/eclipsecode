package com.Demo.Zeeshan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {

	public static void main(String[] args) {
    Connection con=null;
    PreparedStatement pstmt =null;
    String qry="insert into test.student values(?,?,?)";
    try {
    	Class.forName("com.mysql.jdbc.Driver");
    	con=DriverManager.getConnection("jdbc:mysql://localhost:3306?username=root&password=root");
    	
    	pstmt=con.prepareStatement(qry);
    	pstmt.setInt(1,1);
    	pstmt.setString(2,"sneha");
    	pstmt.setDouble(3,73.66);
    	pstmt.executeUpdate();
    	pstmt.setInt(1,2);
    	pstmt.setString(2,"puru");
    	pstmt.setDouble(3,83.23);
    	pstmt.executeUpdate();
    	pstmt.setInt(1,3);
    	pstmt.setString(2,"shanu");
    	pstmt.setDouble(3,63.22);
    	pstmt.executeUpdate();
    	System.out.println("data's inserted..");
    }catch(ClassNotFoundException|SQLException e) {
    	e.printStackTrace();
    }
    finally {
    	if(pstmt!=null) {
    		try {
    			pstmt.close();
    		}catch(SQLException e) {
    			e.printStackTrace();
    			
    		}
    	}
    	if(con!=null) {
    		try {
    			con.close();
    		}catch(SQLException e) {
    			e.printStackTrace();
    		}
    	}
    }
	}
}
