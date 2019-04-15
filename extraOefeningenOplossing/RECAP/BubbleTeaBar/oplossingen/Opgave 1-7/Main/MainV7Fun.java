package Main;

import java.util.LinkedList;
import java.util.Queue;

import Bar.BubbleTeaBar;
import Bar.Ticket;

public class MainV7Fun {

	public static void main(String[] args) {

	
		BubbleTeaBar jammies = new BubbleTeaBar();

		for (int i = 0; i < 100; i++) {
		
			jammies.acceptTicket(new Ticket(i));
		}

		System.out.println(jammies.getProfit());
		
		//ticketList.stream().forEach(t -> System.out.println(t.getPrice()));

		//ticketList.parallelStream().forEach(t -> System.out.println(t.getPrice()));
	}
}
