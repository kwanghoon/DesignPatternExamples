package com.example.designpattern.factorymethod;

public class DOMBuilderTest extends AbstractBuilderTest {

	@Override
	protected OutputBuilder createBuilder(String rootName) {
		return new DOMBuilder();
	}

}
