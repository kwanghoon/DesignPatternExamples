package com.example.designpattern.adapter;

public class ClassBAdapter extends ClassA {
	private ClassB classB; // 위임 방식으로 어댑터 패턴을 구현
	                       // 상속 방식으로 어댑터 패턴을 구현할 때 Java의 문제점은?
	
	public ClassBAdapter() {
		classB = new ClassB();
	}
	public void request() {
		// ...
		
		classB.specificRequest();
		
		// ...
	}
}
