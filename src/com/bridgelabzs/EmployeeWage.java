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
	static final int WAGE_PER_HOUR = 20;
	static final int FULL_TIME_HOUR = 8;
	static final int PART_TIME_HOUR = 4;
	static final int IS_FULL_TIME = 2;
	static final int IS_PART_TIME = 1;
	static final int WORKING_DAYS_PER_MONTH = 20;
	static final int WORKING_HOURS_PER_MONTH=100;

	public static void main(String args[]) {

		int day = 1;
		int totalWage = 0;
		int employeeHours=0;
		while(day<=WORKING_DAYS_PER_MONTH && employeeHours<=WORKING_HOURS_PER_MONTH) {
			/*
			 * Checked the employee present or absent condition by using random function
			 */

			int checkResult = (int) Math.floor(Math.random() * 10) % 3;
			int dailyWage = 0;
			/*
			 * Checking the condition by using switch case
			 */
			switch (checkResult) {
			case IS_FULL_TIME:
				System.out.println("Employee is Full Time");
				dailyWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
				 employeeHours=employeeHours+FULL_TIME_HOUR;
				break;
			case IS_PART_TIME:
				System.out.println("Employee is Part Time");
				dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
				 employeeHours=employeeHours+PART_TIME_HOUR;
				break;
			default:
				System.out.println("Employee is absent");
			}
			System.out.println("Daily Wage of employee is => " + dailyWage);
			day++;
		}
		System.out.println("Total Wages of employee is => " + totalWage);
		System.out.println("Total Wages of employee is => " + employeeHours);
		
	}
}
