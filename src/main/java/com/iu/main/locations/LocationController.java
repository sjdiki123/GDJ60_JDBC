package com.iu.main.locations;

import java.util.ArrayList;
import java.util.Scanner;

import com.iu.main.departments.DepatmentDAO;

public class LocationController {

	private Scanner sc;	
	private LocationDAO  locationDAO;
	
	 public LocationController() {
	
		 this.sc = new Scanner(System.in);
		 this.locationDAO = new LocationDAO();
	}
	
	
	 public void start()throws Exception{
		
			boolean check = true;
		
			while(check) {
			System.out.println("1.배고프다");
			System.out.println("2.음....");
			System.out.println("3.음....");			
			System.out.println("4.집에가자");
			
			int select = sc.nextInt();
			
			
			switch (select) {
			case 1:
	  ArrayList<LocationDTO> ar	=locationDAO.getList();
			break;
			case 2:
				System.out.println("번호를 입력하세요"); 
				select = sc.nextInt();
				locationDAO.getDetail(select);
				break;
				
			case 3:
				System.out.println("검색할 주소");
				String add = sc.next();
		default:
			 check= false;
			
			}
		}
	}
	
}
