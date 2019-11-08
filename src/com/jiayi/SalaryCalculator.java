package com.jiayi;

public class SalaryCalculator {
	public static void main(String[] agrs) {
		String career;
		System.out.println("Program start");
		career = "software developer";
		System.out.println("My career is " + career);
		
		int hoursPerWeek = 40;
		int weeksPerYear = 52;
		double rate = 45.10;
		career = "Fullstack Developer";
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		
		System.out.println("My career as a " + career + ",My salary is $" + salary);
	}
	

}
