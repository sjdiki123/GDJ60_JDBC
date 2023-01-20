package com.iu.main;

import java.util.Scanner;

import com.iu.main.departments.DepatmentController;
import com.iu.main.employees.EmployeesController;
import com.iu.main.locations.LocationController;

public class FrontController {

	private Scanner sc;
	private DepatmentController depatmentController;
	private LocationController locationController;
	private EmployeesController employeesController;
	
	public  FrontController() {
		
		this.sc =new Scanner(System.in);
		
		
		this.depatmentController= new DepatmentController();
		this.locationController=new LocationController();
		this.employeesController = new EmployeesController();
		
	}
	
	
	public void start() throws Exception{
		boolean check =true;
		
		while(check) {
			
			System.out.println("1.부서관리");
			System.out.println("2.지역관리");
			System.out.println("3.사원관리");
			System.out.println("4 종료 ");
			
			int select = sc.nextInt();
			
			
			switch (select) {
			
			case 1:
				this.depatmentController.start();
				break;
			case 2:
				locationController.start();
				break;
			case 3:
				employeesController.start();
				break;
		
			
			
			
			}
		
			
		}
		
		
	}
	
	
}
