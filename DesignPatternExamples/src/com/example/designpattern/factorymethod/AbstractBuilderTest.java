package com.example.designpattern.factorymethod;

public abstract class AbstractBuilderTest extends JUnit_Framework_Testcase {
	protected abstract OutputBuilder createBuilder(String rootName);
	
	public void testAddAboveRoot() {
		// DOMBuilderTest 클래스와 XMLBuilderTest 클래스의 
		// testAddAboveRoot() 메소드가 
		// 바로 아래 createBuilder("orders") 부분만 아래와 같이 다르고
		//  - OutputBuilder outputBuilder = new DOMBuilder("orders");
		//  - OutputBuilder outputBuilder = new XMLBuilder("orders");
		// 모두 동일한 경우에 이 팩토리 메소드 패턴이 유용하다.
		
		// ... 동일한 코드 ...
		
		OutputBuilder outputBuilder = createBuilder("orders");
		
		// ... 동일한 코드 ...
	}
}
