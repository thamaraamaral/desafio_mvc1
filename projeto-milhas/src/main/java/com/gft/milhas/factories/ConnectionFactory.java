package com.gft.milhas.factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	private static final String HOST = "jdbc:mysql://localhost:3306/bd_projeto_milhas?useTimezone=true&serverTimezone=UTC&useSSL=false";
	private static final String USER = "root";
	private static final String PASS = "root";
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	
	public static Connection getConnection() throws Exception{
		
		Class.forName(DRIVER);
		
		return DriverManager.getConnection(HOST, USER, PASS);
		
	}
}
