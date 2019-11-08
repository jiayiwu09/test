package com.jiayi;

public class FizzBuzz {
	
	public static void Fizzbuzz(){
		for(int i=1;i<=100;i++) {
//			String str = "";
//			if (i%3==0) {
//				str += "Fizz";
//			}
//			
//			if (i%5==0) {
//				str += "Buzz";
//			}
//			
//			str = str == "" ? Integer.toString(i) : str;
//			System.out.println(str);
			if(i/3==0 && i/5==0) {
				System.out.println("FizzBuzz");
				break;
			}
			System.out.println();
			
		}
	}
	
	public static void main(String[] arg) {
		Fizzbuzz();
	}
	

}
