package com.jiayi;

public class Day {
	public static void main(String[] agrs) {
		String dayofWeek ="Tuesday";
		switch(dayofWeek) {
		case "Monday" : 
			System.out.println("Today is Monday");
			break;
		}
		int numA = 100;
		int numB = 30;
		System.out.println(addNumber(numA, numB));
		numA = 120;
		numB = 150;
		System.out.println(addNumber(numA, numB));
	}
	
	static int addNumber(int numberA, int numberB) {
//		int numberA = 10;
//		int numberB = 20;
		return numberA + numberB;
	}
	
	String[] a= {"aa", "bbb", "ccc"};
	String b= "aaa";        
}
