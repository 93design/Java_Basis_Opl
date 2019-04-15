package Main;

import java.util.ArrayList;
import java.util.List;

import Bar.BubbleTeaBar;
import Bar.Order;
import Bar.Ticket;
import BubbleTea.Apple;
import BubbleTea.Bubble;
import BubbleTea.BubbleTeaIngredient;
import BubbleTea.Cinamon;
import BubbleTea.Cream;

/**
 * @author Jamie Goegebeur
 * @version 6
 * 	
 * */
public class MainV6 {

	public static void main(String[] args) {
		BubbleTeaBar jammies = new BubbleTeaBar();
		// Ticket 1
		
	
		List<BubbleTeaIngredient> test = new ArrayList<>();
		BubbleTeaIngredient ingred1 = new Apple();
		BubbleTeaIngredient ingred2 = new Bubble(Bubble.Taste.STRAWBERRRY);
		test.add(ingred1);
		test.add(ingred2);
		Order order1 = new Order(test);
		Ticket ticket1 = new Ticket(order1);
		jammies.acceptTicket(ticket1);
		// Ticket 2
		Ticket ticket2 = new Ticket(new Order(new ArrayList<BubbleTeaIngredient>() {
			{
				add(new Cinamon());
				add(new Bubble(Bubble.Taste.SWEETAPPLE));
				add(new Cream());
			}

		}));
		jammies.acceptTicket(ticket2);
		
		//ticket3
		Order order3 = order1;
		order3.addIngredient(new Cream());
		Ticket ticket3 = new Ticket(order3);

		
	
		jammies.acceptTicket(ticket3);
		
		
		
		System.out.println("Total profit " + jammies.getProfit());
	}
}
