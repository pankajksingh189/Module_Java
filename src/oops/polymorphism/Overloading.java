package oops.polymorphism;

import java.util.ArrayList;

public class Overloading {


	public static void JavaHungry(Object o){
		System.out.println("Object");
	}

	public static void JavaHungry(String s){
		System.out.println("String");
	}
//	public static void JavaHungry(Integer in){
//		System.out.println("Integer");
//	}

	public static void main(String[] args) {
		JavaHungry(null);
		
	}
}
