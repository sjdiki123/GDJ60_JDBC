package com.iu.main.departments;

import java.util.ArrayList;
import java.util.Scanner;

public class DepatmentController {
   private Scanner sc;
   private DepatmentDAO departmentDAO;
   private DepatmentView departmentView;
   
   public DepatmentController() {
      this.sc = new Scanner(System.in);
      this.departmentDAO = new DepatmentDAO();
      this.departmentView = new DepatmentView();
   }
   
   public void start() throws Exception{
      boolean check = true;
      
      while(check) {
         System.out.println("1. 부서 리스트");
         System.out.println("2. 부서 상세 정보");
         System.out.println("3. 종       료");
         int select = sc.nextInt();
         
         switch(select) {
         case 1:
            ArrayList<DepartmentDTO> ar = departmentDAO.getList();
            departmentView.view(ar);
            break;
         case 2:
            System.out.println("부서번호 입력");
            select = sc.nextInt();
            DepartmentDTO departmentDTO = departmentDAO.getDetail(select);
            
            if(departmentDTO != null) {
               departmentView.view(departmentDTO);
            }
            else {
               departmentView.view("DATA 없음");
            }
            break;
         default:
            check = false;
         }
      }
   }
   
}
