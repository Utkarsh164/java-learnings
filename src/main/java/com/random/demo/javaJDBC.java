package com.random.demo;

import java.sql.*;
public class javaJDBC {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://localhost:5432/demo";
		String username="postgres";
		String password="P@ssword@123";
		String sql="select * from student";
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection Established");
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		//next must hei warna error milega
		//System.out.println("rs : "+rs.next());
		
//		System.out.println(rs.getString("name"));
		while(rs.next()) {
			System.out.print(rs.getInt("sid")+" ");
			System.out.print(rs.getString("name")+" ");
			System.out.println(rs.getInt("mark"));
		}
		
		System.out.println("Connection closed");
		con.close();
	}
}
