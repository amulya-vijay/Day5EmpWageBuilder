package com.empwage;



class Attendance{
	public static void attendance() {
		int att=(int) Math.floor(Math.random()*2);
		if(att==0) {
			System.out.println("Employee is absent");
		}else {
			System.out.println("Employee is present");
		}
	}
}
class DailyWage extends EmployeeWageBuilder{
	public static int fulltimeWage;
	public static int parttimeWage;
	public static void wage_calculator() {
		 fulltimeWage=wage_per_hr*fulltime_hrs;
		 parttimeWage=wage_per_hr*parttime_hrs;
		 System.out.println("Daily wage of a fulltime emmployee="+fulltimeWage);
		 System.out.println("Daily wage of part-time emmployee="+parttimeWage);
	}
}
public class EmployeeWageBuilder {
	final static int wage_per_hr=20;
	final static int fulltime_hrs=8;
	final static int parttime_hrs=4;
	static void welcome() { 
		System.out.println("Welcome to Employee Wage Computation");
	}
	public static void main(String[] args) {
		welcome();
		Attendance.attendance();
		DailyWage.wage_calculator();
	}

}
