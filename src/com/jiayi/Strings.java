package com.jiayi;

public class Strings {
	public static void main(String[] arg) {
	String bookTitle;
	String wordChoice = "Rings";
	bookTitle="The Lord Of The Rings";
	
	if(bookTitle.contains(wordChoice)) {
		System.out.println("The book contains the word Rings");
	}
	String webbrowser="Chrome";
	if(webbrowser.equalsIgnoreCase("chrome")) {
		System.out.println		("webbrowser is chrome");
	}
	
	int a = 1;
	do {
		System.out.println("aaaa");
		a++;
	} while (a < 5);
	
	}
	
}
