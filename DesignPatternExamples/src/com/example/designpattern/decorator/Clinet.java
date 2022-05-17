package com.example.designpattern.decorator;

public class Clinet {
	public static void main(String[] args) {
		System.out.println("[Combination 1]");
		Display road = new RoadDisplay();
		road.draw();
		
		System.out.println("[Combination 2]");
		Display roadWithLane = new LaneDecorator(new RoadDisplay());
		roadWithLane.draw();
		
		System.out.println("[Combination 3]");
		Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
		roadWithTraffic.draw();
		
		System.out.println("[Combination 4]");
		Display roadWithLaneAndTraffic = new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
		roadWithLaneAndTraffic.draw();
	}

}
