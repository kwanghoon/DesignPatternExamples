package com.example.designpattern.composite;

public class Client {
	public static void main(String[] args) {
		Body body = new Body();
		Keyboard keyboard = new Keyboard();
		Monitor monitor = new Monitor();

		Computer computer = new Computer();
		computer.addComponent(body);
		computer.addComponent(keyboard);
		computer.addComponent(monitor);

		System.out.println(computer.getPrice());
		System.out.println(computer.getPower());
	}
}

// Exercise: 스피커를 새로 추가하시오. 
// 기존에 작성한 클래스들 중 어느 것을 수정하는지 파악하시오.
