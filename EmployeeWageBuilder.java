package com.empwage;

class Attendance{
	public static int attendance() {
		int att=(int) Math.floor(Math.random()*2);
		if(att==0) {
			return 0;
		}else {
			return 1;
		}
		
	}
}
class DailyWage extends EmployeeWageBuilder{
	public static int fulltimeWage;
	public static int parttimeWage;
	public static void wage_calculator() {
		 fulltimeWage=wage_per_hr*fulltime_hrs; //daily wage of fulltime employee
		 parttimeWage=wage_per_hr*parttime_hrs; //daily wage of part time employee
		 /*System.out.println("Daily wage of a fulltime emmployee="+fulltimeWage);
		 System.out.println("Daily wage of part-time emmployee="+parttimeWage);*/
	}
}
class EmpType extends EmployeeWageBuilder{
	public static void type() {
	if(empcheck==1) {
		System.out.println("Full Time Employee(workinghrs/day=8)");
	}else {
		System.out.println("Part Time Employee(workinghrs/day=4)");
	}
}
}
class Wages extends Attendance{
	public static void dailywage() {
		if(attendance()==1) {
			System.out.println("Employee is present");
			switch(EmployeeWageBuilder.empcheck) {
			case EmployeeWageBuilder.full_time:
				System.out.println("Daily wage of full time employee:"+DailyWage.fulltimeWage);
				break;
			case EmployeeWageBuilder.part_time:
				System.out.println("Daily wage of part time employee:"+DailyWage.parttimeWage);
				break;
			default:
				break;
			}
		}else {
			System.out.println("Employee is absent");
		}
	}
}
class MonthlyWage extends EmployeeWageBuilder{
	public static int monthlyWage;
	public static void monthlyWage() {
			if(empcheck==1) {
				monthlyWage=wage_per_hr*fulltime_hrs*num_of_days;
				System.out.println("Monthly wage of full time  employee="+monthlyWage);
			}else {
				monthlyWage=wage_per_hr*parttime_hrs*num_of_days;
				System.out.println("Monthly wage of part time employee"+monthlyWage);
			}
	}
}

public class EmployeeWageBuilder {
	final static int wage_per_hr=20;
	final static int fulltime_hrs=8;
	final static int parttime_hrs=4;
	final static int num_of_days=20;
	final static int total_hrs=100;
	final static int full_time=1;
	final static int part_time=2;
	final static int empcheck=(int) Math.floor(Math.random()*2+1);
	static void welcome() { 
		System.out.println("Welcome to Employee Wage Computation");
	}
	public static void main(String[] args) {
		welcome();
		Attendance.attendance();
		DailyWage.wage_calculator();
		EmpType.type();
		Wages.dailywage();
		MonthlyWage.monthlyWage();
	}

}
