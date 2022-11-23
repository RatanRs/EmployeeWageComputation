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
    static final int IS_FULL_TIME=2;
    static final int IS_PART_TIME=1;
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
	switch(checkResult) {
    case IS_FULL_TIME:
        System.out.println("Employee is Full Time");
        dailyWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
        break;
    case IS_PART_TIME:
        System.out.println("Employee is Part Time");
        dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
        break;
    default:
        System.out.println("Employee is absent");
}
System.out.println("Daily Wage of employee is => "+dailyWage);
}
}