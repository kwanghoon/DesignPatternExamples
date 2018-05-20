package com.example.designpattern.abstractfactory;

public class ElevatorFactoryFactory {
	public static ElevatorFactory getFactory(VendorID vendorId) {
		switch (vendorId) {
		case LG:
			return new LGElevatorFactory();
			
		case Hyundai:
			return new HyundaiElevatorFactory();
			
		default:
			return null;
		}
	}
}
