package com.iu.main.departments;

public class DepartmentDTO {

	// 모든 멤버 변수는 잡근지정자는 private
	//멤버 변수의 데이터 타입과 변수명은
	//table의 컬럼의 데이터 타입과 컬럼명을 일치시킴 
	//getter/ Setter생성
	// 생성자는 여려개 잇어도 상관없음
	//꼭 기본 생성자는 있어야함
	
	private Integer department_id;
	private String  department_name;
	private Integer manager_id;
	private Integer location_id;
	
	public Integer getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public Integer getManager_id() {
		return manager_id;
	}
	public void setManager_id(Integer manager_id) {
		this.manager_id = manager_id;
	}
	public Integer getLocation_id() {
		return location_id;
	}
	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}
	
	
}
