package com.iu.main.departments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.main.util.DBConnection;

public class DepatmentDAO {

	public DepartmentDTO getDetail(int department_id) throws Exception {
		Connection connection = DBConnection.getConnection();
	    DepartmentDTO departmentDTO = null;
		
		String sql = "SELECT *FROM DEPARTMENTS WHERE DEPARTMENT_ID=?";
		PreparedStatement st = connection.prepareStatement(sql);
	
		st.setInt(1, department_id);
		
		
		ResultSet rs = st.executeQuery();
	
		if(rs.next()) {
			
			 departmentDTO = new DepartmentDTO();
	         departmentDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
	         departmentDTO.setDepartment_name(rs.getString("DEPARTMENT_NAME"));
	         departmentDTO.setManager_id(rs.getInt("MANAGER_ID"));
	         departmentDTO.setLocation_id(rs.getInt("LOCATION_ID"));

		}
		
		DBConnection.disConnect(rs, st, connection);
		
		 return departmentDTO;

	}
	
	
	
	public ArrayList<DepartmentDTO> getList() throws Exception {
		ArrayList<DepartmentDTO> ar = new ArrayList<DepartmentDTO>();
		
		
		//DBConnection dbConnection = new DBConnection();
		Connection connection = DBConnection.getConnection();
		
		// 커리문 만들기
		String sql = "SELECT *FROM DEPARTMENTS";
		
		
		//미리 전송
		PreparedStatement st = connection.prepareStatement(sql);
		
		
		
		//?세팅
		
		//최종 결과
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			DepartmentDTO departmentDTO = new DepartmentDTO();
			departmentDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
			departmentDTO.setDepartment_name(rs.getString("DEPARTMENT_NAME"));
			departmentDTO.setManager_id(rs.getInt("MANAGER_ID"));
			departmentDTO.setLocation_id(rs.getInt("LOCATION_ID"));
			ar.add(departmentDTO);
			
			
		}
	
			//해제

		DBConnection.disConnect(rs, st, connection);
		
		return ar;
	}
	
	
}
