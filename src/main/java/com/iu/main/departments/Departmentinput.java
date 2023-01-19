package com.iu.main.departments;

import java.util.Scanner;

public class Departmentinput {

private Scanner sc;

public Departmentinput() {
	sc =new Scanner(System.in);
}
	

//업데이트
public DepartmentDTO updatedata() {
	DepartmentDTO departmentDTO = new DepartmentDTO();
	
	System.out.println("수정할 부서 번호 입력");
	departmentDTO.setDepartment_id(sc.nextInt());
	System.out.println("수정할부서명 입력");
	departmentDTO.setDepartment_name(sc.next());
	System.out.println("수정할 매니저 번호");
	departmentDTO.setManager_id(sc.nextInt());
	System.out.println(" 수정할 지역번호 입력");
	departmentDTO.setLocation_id(sc.nextInt());
	
	return departmentDTO;
}


	
	//추가
	public DepartmentDTO setData() {
		DepartmentDTO departmentDTO = new DepartmentDTO(); 
		
		System.out.println("부서명 입력");
		departmentDTO.setDepartment_name(sc.next());
		System.out.println("매니저 번호");
		departmentDTO.setManager_id(sc.nextInt());
		System.out.println("지역번호 입력");
		departmentDTO.setLocation_id(sc.nextInt());
		
		return departmentDTO;
		
	}
	
	
	
	//삭제
	public DepartmentDTO deleteData() {
		DepartmentDTO departmentDTO = new DepartmentDTO();
	System.out.println("삭제 할 부서 번호");
		departmentDTO.setDepartment_id(sc.nextInt());
		return departmentDTO;
	}
	
	
}
