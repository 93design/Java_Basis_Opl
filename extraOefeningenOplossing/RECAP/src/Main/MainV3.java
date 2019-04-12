package Main;

import Bar.BubbleTeaBar;
import Bar.Ticket;
import BubbleTea.Apple;
import BubbleTea.Bubble;
import BubbleTea.BubbleTeaIngredient;
import BubbleTea.Cinamon;

public class MainV3 {
	public static void main(String[] args) {
		BubbleTeaIngredient ingred1 = new Apple();
		BubbleTeaIngredient ingred2 = new Cinamon();
		BubbleTeaIngredient ingred3 = new Bubble(Bubble.Taste.LIME);
		
		
		System.out.println(ingred1.getClass().getName() + " prijs " + ingred1.getPrice());
		System.out.println(ingred2.getClass().getName()  + " prijs " + ingred2.getPrice());
		System.out.println(ingred3 + "prijs " + "prijs " +  ingred3.getPrice());
	}
}
