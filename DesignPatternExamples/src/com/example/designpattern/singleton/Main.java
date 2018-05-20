package com.example.designpattern.singleton;

public class Main {
	public static void main(String[] args) {
		TicketManager ticketManager;
		
		ticketManager = TicketManager.getInstance();
		
		Ticket ticket1 = ticketManager.sellTicket();
		Ticket ticket2 = ticketManager.sellTicket();
		Ticket ticket3 = ticketManager.sellTicket();
			
		ticketManager = TicketManager.getInstance(); // 동일한 인스턴스
		
		Ticket ticket4 = ticketManager.sellTicket();
		Ticket ticket5 = ticketManager.sellTicket();
	}
}
