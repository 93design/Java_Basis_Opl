package Main;

import Bar.BubbleTeaBar;
import Bar.Ticket;

public class MainV6 {

	
	public static void main(String[] args) {
		Ticket ticket1 = new Ticket(10);
		Ticket ticket2 = new Ticket(5);
		Ticket ticket3 = new Ticket(2.5);
		
		BubbleTeaBar jammies = new BubbleTeaBar();
		jammies.acceptTicket(ticket1);
		jammies.acceptTicket(ticket2);
		jammies.acceptTicket(ticket3);
		System.out.println(jammies.getProfit());
	}
}
