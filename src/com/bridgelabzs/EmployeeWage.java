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
public static void main(String args[]) {
	/*
	 * Checked the employee present or absent condition by using random function
	 */
	int checkResult=(int)Math.floor(Math.random()*10) % 2;
	if(checkResult==1) {
		System.out.println("Employee is present");
	}
	else {
		System.out.println("Employee is Absent");
	}
}
}