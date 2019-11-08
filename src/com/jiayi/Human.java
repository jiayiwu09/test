package com.jiayi;

public class Human {
	private int numberOfHands;
	private int numberOfFeet;
	private int numberOfEyes;
	private String name;
	
	public Human() {
		this.numberOfEyes = 2;
		this.numberOfHands = 2;
		this.numberOfFeet = 2;
		this.name = name;
	}
	
	public Human(int numberOfHands, int numberOfFeet, int numberOfEyes, String name) {
		this.numberOfHands = numberOfHands;
		this.numberOfFeet = numberOfFeet;
		this.numberOfEyes = numberOfEyes;
		this.name = name;
	}
}
