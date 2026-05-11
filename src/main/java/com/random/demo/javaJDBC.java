package com.random.demo;

import java.sql.*;
public class javaJDBC {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://localhost:5432/demo";
		String username="postgres";
		String password="P@ssword@123";
		String sql="select * from student where sid=1";
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection Established");
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		
		System.out.println("rs : "+rs.next());
		
		System.out.println(rs.getString("name"));
		
		System.out.println("Connection closed");
		con.close();
	}
}
