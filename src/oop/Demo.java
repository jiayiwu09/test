package oop;

class Person{
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name +"is walking");
		
	}
	void eat() {
		System.out.println(name+"is eating");
		
	}
	void sleep() {
		System.out.println(name+"is sleeping");
		
	}
}

public class Demo {

	public static void main(String[] args) {
		Person person1=new Person();
		person1.name="Joe";
		person1.email="Joe@testemail.com";
		person1.phone="999999";
		
		person1.eat();
		person1.walk();
		person1.sleep();
		
		Person person2=new Person();
		person2.name="sara";
		
		person2.sleep();
		
		
		
		/*
		// TODO Auto-generated method stub
		String name = "Joe ";
		String email="joe@testemail.com";
		String phone="00009999";

		walking(name);
		System.out.println(name+"is eating");
		
		String name2 = "Sara ";
		String email2="sara@testemail.com";
		String phone2="8888889";

		walking(name2);
		System.out.println(name2+"is eating");
	}

	static void walking(String name) {
		System.out.println(name + "is walking");
		*/
	}
}
