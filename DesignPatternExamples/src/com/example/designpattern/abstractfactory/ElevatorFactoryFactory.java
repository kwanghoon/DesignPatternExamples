package com.example.designpattern.abstractfactory;

// 팩토리 메소드 패턴: 
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
