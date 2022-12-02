package com.bridgelabzs;

/**
 * 
 * @author Admin
 *
 */

public class EmployeeWage {
	/**
	 * 
	 * @param args
	 */

	static final int FULL_TIME_HOUR = 8;
	static final int PART_TIME_HOUR = 4;
	static final int IS_FULL_TIME = 2;
	static final int IS_PART_TIME = 1;

	/***
	 * 
	 * @param WAGE_PER_HOUR
	 * @param WORKING_DAYS_PER_MONTH
	 * @param WORKING_HOURS_PER_MONTH
	 */
	public static void employeWage(int WAGE_PER_HOUR, int WORKING_DAYS_PER_MONTH, int WORKING_HOURS_PER_MONTH) {
		int day = 1;
		int totalWages = 0;
		int empHours = 0;
		while (day <= WORKING_DAYS_PER_MONTH && empHours <= WORKING_HOURS_PER_MONTH) {
			int employeeAttendance = (int) Math.floor(Math.random() * 10) % 3;
			int dailyWage = 0;
			switch (employeeAttendance) {
			case IS_FULL_TIME:
				System.out.println("Employee is Full Time");
				dailyWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
				empHours = empHours + FULL_TIME_HOUR;
				break;
			case IS_PART_TIME:
				System.out.println("Employee is Part Time");
				dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
				empHours = empHours + PART_TIME_HOUR;
				break;
			default:
				System.out.println("Employee is absent");
			}
			totalWages += dailyWage;
			System.out.println("Daily Wage of employee for day " + day + " is => " + dailyWage);
			day++;
		}
		System.out.println("Total working hours of employee is => " + empHours);
		System.out.println("Total Wages of employee is => " + totalWages);
	}

	public static void main(String[] args) {
		/*
		 * Created object called company
		 */
		EmployeeWage company = new EmployeeWage();
		System.out.println("Employee Wage for Oracle =");
		company.employeWage(20, 30, 40);
		System.out.println("Employee Wage for TCS =");
		company.employeWage(21, 22, 45);
		System.out.println("Employee Wage for IBM =");
		company.employeWage(21, 22, 49);
	}

}