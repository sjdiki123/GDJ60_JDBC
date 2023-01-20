package com.iu.main.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

import com.iu.main.util.DBConnection;

public class EmployeesDAO {

	
	
	//월급에 평균

	public void getAvg() throws Exception{
		HashMap<String, Double> map =new HashMap<String, Double>();
		
		Connection con = DBConnection.getConnection();

		String sql="SELECT AVG(SALARY)*12+100 AS A, SUM(SALARY) FROM EMLOYEES";
		
		PreparedStatement st =con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		rs.next();
		
		
		//1.list,array
		//2 dto(class)
		//3.Map(key,Value)
		
		
		map.put("avg", rs.getDouble("A"));
		map.put("sum", rs.getDouble(2));
		
		
//		System.out.println(rs.getDouble("A"));
//		System.out.println(rs.getDouble(2));
//		
		
		
		
		
		
		
		DBConnection.disConnect(st, con);
		
	}
	
	
	
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
		ArrayList<EmployeesDTO> ar = new ArrayList<EmployeesDTO>();
				
				
	}
	
	
}
