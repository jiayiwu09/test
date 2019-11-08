package com.jiayi;

public class substring {

	public static void printLength(String s) {
		for (int i=0;i<s.length(); i++) {
			for(int j=i+1;j<s.length()+1;j++) {
				System.out.println("Substring: " + s.substring(i,j));
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		printLength("abc");
	}
}


