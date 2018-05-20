package com.example.designpattern.abstractfactory;

public class LGElevatorFactory extends ElevatorFactory {

	@Override
	Motor createMotor() {
		return new LGMotor();
	}

	@Override
	Door createDoor() {
		return new LGDoor();
	}

}
