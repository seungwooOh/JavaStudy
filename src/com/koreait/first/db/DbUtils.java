package com.koreait.first.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtils {
	public static void close(Connection con) {
		if(con != null) {
			try {
				con.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static Connection getCon() {
		Connection con = null;
		
		final String URL ="jdbc:mysql://localhost:3306/test";
		final String USER = "root";
		final String PW = "koreait2020";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, USER, PW);			
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("접속완료");
		return con;
	}
}
