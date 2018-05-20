package com.example.designpattern.abstractfactory;

public class HyundaiElevatorFactory extends ElevatorFactory {

	@Override
	Motor createMotor() {
		return new HyundaiMotor();
	}

	@Override
	Door createDoor() {
		return new HyundaiDoor();
	}

}
