package com.example.designpattern.singleton;

public class TicketManager {
	private static TicketManager instance;
	
	private TicketManager() { // private constructor
		count = 0;
	}
	
	public static TicketManager getInstance() {
		if (instance == null) {
			instance = new TicketManager();
		}
		return instance;
	}
	
	static int count;
	
	public Ticket sellTicket() {
		return new Ticket(count++);
	}
}
