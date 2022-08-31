package com.tutorial;

public class TestInheritance {
	
	public static void main (String[] args) {
		Children obj = new Children();
		obj.helloFromParent();
		obj.helloFromChildren();
		
		System.out.println("Number from parent " + obj.numFromParent);
		System.out.println("Number from children " + obj.numFromChildren);	
	}
	
}
