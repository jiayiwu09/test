package com.jiayi;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberOfMethods(100));
	}
	
	public static int numberOfMethods(int n) {
		if (n==1) {
			return 1;
		}
		if (n==2) {
			return 2;
		}
		return numberOfMethods(n-1)+numberOfMethods(n-2);
	}

}
