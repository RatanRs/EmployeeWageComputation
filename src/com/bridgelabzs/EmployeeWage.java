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
	static final int WAGE_PER_HOUR=20;
    static final int FULL_TIME_HOUR=8;
public static void main(String args[]) {
	/*
	 * Checked the employee present or absent condition by using random function
	 */
	int checkResult=(int)Math.floor(Math.random()*10) % 2;
	int dailyWage=0;
	
	if(checkResult==1) {
		System.out.println("Employee is present");
		dailyWage=WAGE_PER_HOUR*FULL_TIME_HOUR;
	}
	else {
		System.out.println("Employee is Absent");
	}
	 System.out.println("Daily Wage of employee is => "+dailyWage);
}
}