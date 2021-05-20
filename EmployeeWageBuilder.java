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
class DailyWage extends EmployeeWageBuilder{
	public static int fulltimeWage;
	public static void wage_calculator() {
		 fulltimeWage=wage_per_hr*fulltime_hrs;
		 System.out.println("Daily wage of an emmployee="+fulltimeWage);
	}
}
public class EmployeeWageBuilder {
	final static int wage_per_hr=20;
	final static int fulltime_hrs=8;
	static void welcome() { 
		System.out.println("Welcome to Employee Wage Computation");
	}
	public static void main(String[] args) {
		welcome();
		Attendance.attendance();
		DailyWage.wage_calculator();
		
	}

}
