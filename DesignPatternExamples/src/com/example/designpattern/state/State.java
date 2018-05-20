package com.example.designpattern.state;

public interface State {
	public void on_button(Light light);
	public void off_button(Light light);
}
