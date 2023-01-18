package com.iu.main;

import com.iu.main.departments.DepatmentController;
import com.iu.main.departments.DepatmentDAO;
import com.iu.main.locations.LocationController;
import com.iu.main.locations.LocationDAO;
import com.iu.main.util.DBConnection;

public class JDBCMain {

	public static void main(String[] args) {

		System.out.println("start");

		DepatmentController dc = new DepatmentController();
		LocationController lc = new LocationController();
		 try {
			 lc.start();
			//dc.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		 
		 
		 
		System.out.println("finish");
		
		
		
	}

}
