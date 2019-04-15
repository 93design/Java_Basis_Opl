package Main;

import java.util.ArrayList;
import java.util.List;

import Bar.BubbleTeaBar;
import Bar.Ticket;
import BubbleTea.Apple;
import BubbleTea.Boilable;
import BubbleTea.Bubble;
import BubbleTea.BubbleTeaIngredient;
import BubbleTea.Cinamon;
/**
 * @author Jamie Goegebeur
 * @version 5
 * */
public class MainV5 {
	public static void main(String[] args) {
		Ticket ticket1 = new Ticket(4.20);
		Ticket ticket2 = new Ticket(4.20);
		Ticket ticket3 = new Ticket(4.20);
		
		BubbleTeaBar jammies = new BubbleTeaBar();
		jammies.acceptTicket(ticket1);
		jammies.acceptTicket(ticket2);
		jammies.acceptTicket(ticket3);
		
		System.out.println(jammies.getProfit());
		
		//solving strange precision problem
		System.out.printf("%2.2f",jammies.getProfit());
	}
}
