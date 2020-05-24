package com.example.designpattern.adapter;

public class ClassBAdapter extends ClassA {
	private ClassB classB; // association, not inheritance
	                       // cf. No multiple inheritance allowed in Java
	
	public ClassBAdapter() {
		classB = new ClassB();
	}
	public void request() {
		// ...
		
		classB.specificRequest();
		
		// ...
	}
}
