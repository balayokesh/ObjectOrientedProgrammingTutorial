package com.tutorial;

public class TestInheritance {
	
	public static void main (String[] args) {
		
		Children1 obj1 = new Children1();
		Children2 obj2 = new Children2();
		
		obj1.helloFromParent();
		obj2.helloFromParent();
		
//		obj1.helloFromChildren1();
//		obj2.helloFromChildren2();
		
		System.out.println("Number from parent from children 1 " + obj1.numFromParent);
		System.out.println("Number from parent from chidlren 2 " + obj2.numFromParent);
		
//		System.out.println("Number from children 1 " + obj1.numFromChildren1);
//		System.out.println("Number from children 2 " + obj2.numFromChildren2);
	}
	
}
