package Main;

import java.util.LinkedList;
import java.util.Queue;

import Bar.BubbleTeaBar;
import Bar.Ticket;

public class MainV7Fun {

	
	public static void main(String[] args) {
		
		//List<Ticket> ticketList = new LinkedList<>();
		Queue<Ticket> ticketList = new LinkedList<>();
		Ticket ticket1 = new Ticket(10);
		ticketList.add(ticket1);
		System.out.println(( ticketList.poll().getTime()));
		BubbleTeaBar jammies = new BubbleTeaBar();
		
		for(int i =0; i <1000; i++) {
			ticketList.add(new Ticket(i));
			jammies.acceptTicket(new Ticket(i));
		}
		

			
		System.out.println(jammies.getProfit());
		System.out.println( ticketList.poll().getTime());
		ticketList.stream().forEach( t -> System.out.println(t.getPrice()));
			
		ticketList.parallelStream().forEach( t -> System.out.println(t.getPrice()));
	}
}
