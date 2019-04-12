package Main;

import BubbleTea.Apple;
import BubbleTea.Bubble;
import BubbleTea.BubbleTeaIngredient;
import BubbleTea.Cinamon;


public class MainV2 {
	public static void main(String[] args) {
		BubbleTeaIngredient ingred1 = new Apple(2);
		BubbleTeaIngredient ingred2 = new Cinamon(0.75);
		BubbleTeaIngredient ingred3 = new Bubble(Bubble.Taste.LIME, 1);
		
		System.out.println(ingred1.getClass().getName() + " prijs " + ingred1.getPrice());
		System.out.println(ingred2.getClass().getName()  + " prijs " + ingred2.getPrice());
		System.out.println(ingred3 + "prijs " + "prijs " +  ingred3.getPrice());
	}
}
