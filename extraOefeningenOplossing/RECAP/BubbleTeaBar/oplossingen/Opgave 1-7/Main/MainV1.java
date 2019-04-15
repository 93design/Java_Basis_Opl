package Main;

import Bar.Register;
import Bar.Ticket;

/**
 * @author Jamie Goegebeur
 * @version 1
 * Just testing creating object and then passing object to an class who needs it as composition
 * */
public class MainV1 {

	
	public static void main(String[] args) {
		Ticket ticket1 = new Ticket(3);
		Ticket ticket2 = new Ticket(5);
		Ticket ticket3 = new Ticket(10);
		
		
		Register jammies = new Register();
		jammies.acceptTicket(ticket1);
		jammies.acceptTicket(ticket2);
		jammies.acceptTicket(ticket3);
		
		System.out.println("Profit is " + jammies.getProfit());
	}
}
