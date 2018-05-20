package com.example.designpattern.factorymethod;

public class XMLBuilderTest extends AbstractBuilderTest {

	@Override
	protected OutputBuilder createBuilder(String rootName) {
		return new XMLBuilder();
	}

}
