package com.iu.main.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {

	
	public void getConnection()throws Exception {
	
		//1.id
		String username = "hr";
		//2pw
		String password = "hr";
		//3.url정보
		String url = "jdbc:oracle:thin:@192.168.1.129:1521/XEPDB1";
		//4.driver.정보
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		Class.forName(driver);
		
		
	
		Connection connection = DriverManager.getConnection(url, username, password);
		
		String sql ="SELECT *FROM DEPARTMENTS";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		
		ResultSet rs  = st.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt("DEPARTMENT_ID"));
			System.out.println(rs.getString("DEPARTMENT_NAME"));
			System.out.println(rs.getInt("MANAGER_ID"));
			System.out.println(rs.getInt("LOCATION_ID"));
		}
	}
	
	
}
