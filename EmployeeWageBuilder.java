package com.empwage;

class Attendance{
	public static int attendance() {
		int att=(int) Math.floor(Math.random()*2);
		if(att==0) {
			System.out.println("Employee is absent");
			return 0;
		}else {
			System.out.println("Employee is present");
			return 1;
		}
	}
}
public class EmployeeWageBuilder {
	static void welcome() { 
		System.out.println("Welcome to Employee Wage Computation");
	}
	public static void main(String[] args) {
		welcome();
		Attendance.attendance();
	}

}
