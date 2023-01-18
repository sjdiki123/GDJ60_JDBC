package com.iu.main.locations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;

import com.iu.main.util.DBConnection;


public class LocationDAO {

	public void getDetail(int location_id) throws Exception {
		Connection connection = DBConnection.getConnection();
		String  sql = "SELECT *FROM  LOCATIONS  WHERE LOCATION_ID=?";
		PreparedStatement st = connection.prepareStatement(sql);
	
		st.setInt(1, location_id);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			
			System.out.println(rs.getInt("LOCATION_ID"));
			System.out.println(rs.getString("STREET_ADDRESS"));
			System.out.println(rs.getString("POSTAL_CODE"));
			System.out.println(rs.getString("CITY"));
			System.out.println(rs.getString("STATE_PROVINCE"));
			System.out.println(rs.getString("COUNTRY_ID"));

		}
		else {
			System.out.println("data없다");
		}
		
		DBConnection.disConnect(rs, st, connection);
		
	}
	
	public void getList () throws Exception {
	
		//DBConnection dbConnection = new DBConnection();
		Connection connection = DBConnection.getConnection();
		
		
		//커리문 만들기
		String sql = "SELECT *FROM LOCATIONS";
		
		
		//미리 전송
		PreparedStatement st = connection.prepareStatement(sql);
		
		
		//?
		
		//최종 결과
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			LocationDTO locationDTO = new LocationDTO();
			locationDTO.setLocation_id(rs.getInt("LOCATION_ID"));
			locationDTO.setState_province(rs.getString("STATE_PROVINCE"));
			locationDTO.setStreet_address(rs.getString("STREET_ADDRESS"));
			locationDTO.setCity(rs.getString("CITY"));
			locationDTO.setPostal_code(rs.getString("POSTAL_CODE"));
			locationDTO.setCountry_id(rs.getString("COUNTRY_ID"));
	
			
		
			
			

		}
		DBConnection.disConnect(rs, st, connection);
	}
	
	
}
