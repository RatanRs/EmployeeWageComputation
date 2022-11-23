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
    static final int PART_TIME_HOUR=4;
public static void main(String args[]) {
	/*
	 * Checked the employee present or absent condition by using random function
	 */
	int checkResult=(int)Math.floor(Math.random()*10) % 3;
	/*
	 * initial Daily wage we have to take zero
	 */
	int dailyWage=0;
	/*
	 * Checking the condition by using if esle condition
	 */
	if(checkResult==2) {
		System.out.println("Employee is present");
		/*
		 * daily wage calcultion
		 */
		dailyWage=WAGE_PER_HOUR*FULL_TIME_HOUR;
	}
	else if(checkResult==1){
		System.out.println("Employee is part time ");
		dailyWage=WAGE_PER_HOUR*PART_TIME_HOUR;
	}
	else {
		System.out.println("Employe is absent");
	}
	
	 System.out.println("Daily Wage of employee is => "+dailyWage);
}
}