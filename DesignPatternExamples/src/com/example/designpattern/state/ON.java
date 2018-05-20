package com.example.designpattern.state;

public class ON implements State {

	@Override
	public void on_button(Light light) {
	}

	@Override
	public void off_button(Light light) {
		light.setState( new OFF() );
	}

}
