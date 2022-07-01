package com.greatlearning.assesment1;

public class Assignment1{
	//  Declaring Super class named as SuperDepartment
 static class SuperDepartment 
 {
	 // Declaring methods inside Super Department
	public String departmentName () {
		return "Super Department ";
	}
	public String getTodaysWork  () {
		return "No Work as of now";
	}
	public String getWorkDeadline() {
		return "Nil";
	}
	public String isTodayAHoliday() {
		return  "Today is not a holiday";
		}

}
// Declaring AdminDepartment class which inherits SuperDepartment class
 static class AdminDepartment extends SuperDepartment{
	 public  String departmentName () {
		return "Admin Department ";
	}
	public String getTodaysWork  () {
		return "Complete your documents Submission";
	}
	public String getWorkDeadline() {
		return "Complete by EOD ";
	} 
	
}
//Declaring HrDepartment class which inherits SuperDepartment class
 
 static class HrDepartment extends SuperDepartment
 {
	 public String departmentName () {
			return "Hr Department  ";
		}
		public String getTodaysWork  () {
			return "Fill today’s worksheet and mark your attendance";
		}
		public String getWorkDeadline() {
			return "Complete by EOD ";
		}
		public String  doActivity() {
			return "team Lunch";
		}
	 
 }
//Declaring TechDepartment class which inherits SuperDepartment class
 static class TechDepartment extends SuperDepartment
 {
	 public String departmentName () {
			return "Tech Department  ";
		}
		public String getTodaysWork  () {
			return "Complete coding of module 1";
		}
		public String getWorkDeadline() {
			return "Complete by EOD ";
		}
		public String getTechStackInformation() {
			return "core Java";
		}
 }
 // Declaring Driver class - Main  
 public static void main(String[] args) {
	 
	 // Creating object to access methods inside AdminDepartment class
	 
	 AdminDepartment adminDept = new AdminDepartment();
	 
	 System.out.println("Welcome to " + adminDept.departmentName());
	 System.out.println(adminDept.getTodaysWork());
	 System.out.println(adminDept.getWorkDeadline());
	 System.out.println(adminDept.isTodayAHoliday());
	 System.out.println();
	 
	 // Creating object to access methods inside HrDepartment class
	 HrDepartment hrDept = new HrDepartment();
	 
	 System.out.println("Welcome to " + hrDept.departmentName());
	 System.out.println(hrDept.getTodaysWork());
	 System.out.println(hrDept.getWorkDeadline());
	 System.out.println(hrDept.isTodayAHoliday());
	 System.out.println();
	 
	 // Creating object to access methods inside TechDepartment class
	 
	 TechDepartment techDept = new TechDepartment();
	 
	 System.out.println("Welcome to " + techDept.departmentName());
	 System.out.println(techDept.getTodaysWork());
	 System.out.println(techDept.getWorkDeadline());
	 System.out.println(techDept.getTechStackInformation());
	 System.out.println(techDept.isTodayAHoliday());
 }
}
 
 
