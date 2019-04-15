package Main;

import Bar.BubbleTeaBar;
import Bar.Ticket;

/**
 * @author Jamie Goegebeur
 * @version 7
 * */
public class MainV7 {

	
	public static void main(String[] args) {
		Ticket ticket1 = new Ticket(10);
		Ticket ticket2 = new Ticket(10);
		Ticket ticket3 = new Ticket(10);
		
		BubbleTeaBar jammies = new BubbleTeaBar();
		jammies.acceptTicket(ticket1);
		jammies.acceptTicket(ticket2);
		
		System.out.println(jammies.getProfit());
	}
}
