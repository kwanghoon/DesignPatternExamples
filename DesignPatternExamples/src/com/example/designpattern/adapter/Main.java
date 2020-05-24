package com.example.designpattern.adapter;

public class Main {

	public static void main(String[] args) {
		
		ClassA arr[] = new ClassA[] {
				new ClassA(),
				new ClassBAdapter()
		};
		
		Client.request(arr);

	}

}
