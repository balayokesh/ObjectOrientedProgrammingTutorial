package com.tutorial;

public class TestInheritance {
	
	public static void main (String[] args) {
		Children2 obj = new Children2();
		obj.helloFromParent();
		obj.helloFromChildren1();
		obj.helloFromChildren2();
		
		System.out.println("Number from parent " + obj.numFromParent);
		System.out.println("Number from children 1 " + obj.numFromChildren1);
		System.out.println("Number from children 2 " + obj.numFromChildren2);
	}
	
}
