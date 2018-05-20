package com.example.designpattern.abstractfactory;

public class Main {

	public static void main(String[] args) {
		for (String arg : args) {
			VendorID vendorId;
			
			if ("LG".equalsIgnoreCase(arg)) {
				vendorId = VendorID.LG;
			}
			else if ("Hyundai".equalsIgnoreCase(arg)) {
				vendorId = VendorID.Hyundai;
			} 
			else  {
				vendorId = null;
			}

			if (vendorId != null) {
				ElevatorFactory elevatorFactory = 
						ElevatorFactoryFactory.getFactory(vendorId);

				Door door = elevatorFactory.createDoor();
				Motor motor = elevatorFactory.createMotor();
			}
		}
		
		// Exercise: 벤더에 Samsung을 추가하고 관련 클래스들들을 추가하고 수정하시오.
	}

}
