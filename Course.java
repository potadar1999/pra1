package com.SevenDay;

import java.util.Scanner;

public class Course {
	
	int couseId;
	String courseName;
	int courseFee;
	
	 void displaycourseDetails() {
		// TODO Auto-generated method stub
		 
		 System.out.println("Course Id "+couseId);
		 System.out.println("Course Name "+courseName);
		 System.out.println("Course Fee "+courseFee);	 

	}
	 
	 
	

	 
	 
	 static void Authentication(String username,String passaword) {
		 
		 if(username.equals("Admin") && passaword.equals("123")) {
			 Scanner sc= new Scanner(System.in);
			 System.out.println("Enter here course id");
			 int c1=sc.nextInt();
			 System.out.println("Enter here course Name");
			 String c2=sc.next();
			 System.out.println("Enter here course Fees");
			 int c3=sc.nextInt();
			
			 Course c4=new Course();
			 c4.couseId=c1;
			 c4.courseName=c2;
			 c4.courseFee=c3;
			 
			 c4.displaycourseDetails();
		 }
		 else {
			 System.out.println("Invalid Username or password");
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Authentication("Admin", "123");
		System.out.println("-------------");
		Authentication("dmin", "23");
		
	}

}
