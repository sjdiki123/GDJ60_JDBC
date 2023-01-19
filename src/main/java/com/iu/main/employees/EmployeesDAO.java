package com.iu.main.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.main.util.DBConnection;

public class EmployeesDAO {

	
	
	public void getDetail() throws Exception {
		ArrayList<EmployeesDTO> ar = new ArrayList<EmployeesDTO>();
		Connection connection = DBConnection.getConnection();
	String sql = "	SELEC *FROM  EMPLOYEES ORDER BY HIRE_DATE DESC";
	PreparedStatement st = connection.prepareStatement(sql);
	
	
	ResultSet rs = st.executeQuery();
	
	
	while(rs.next()) {
		
		EmployeesDTO employeesDTO = new EmployeesDTO();
		employeesDTO.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
		employeesDTO.setFirst_name(rs.getString("FIRST-NAME"));
	 
	
	
	}
	    
	
	
	
	
	}
	
	public ArrayList<EmployeesDTO> getFind() throws Exception{
		ArrayList<EmployeesDTO> ar = new ArrayList<EmployeesDTO>()
				
				
	}
	
	
}
