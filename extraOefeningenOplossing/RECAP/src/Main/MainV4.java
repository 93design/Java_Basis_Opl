package Main;

import java.util.ArrayList;
import java.util.List;

import Bar.BubbleTeaBar;
import BubbleTea.Apple;
import BubbleTea.Boilable;
import BubbleTea.Bubble;
import BubbleTea.BubbleTeaIngredient;
import BubbleTea.Cinamon;

public class MainV4 {
	public static void main(String[] args) {
		BubbleTeaBar JammyBubble = new BubbleTeaBar();
				
		BubbleTeaIngredient ingred1 = new Apple();
		BubbleTeaIngredient ingred2 = new Cinamon();
		BubbleTeaIngredient ingred3 = new Bubble(Bubble.Taste.LIME);

		List<BubbleTeaIngredient> test = new ArrayList<>();

		test.add(ingred1);
		test.add(ingred2);
		test.add(ingred3);

		for (BubbleTeaIngredient ing : test) {
			if (ing instanceof Boilable) {
				((Boilable) ing).boil();
			} else {
				System.out.println("add " + ing.toString() + " to the cup");
			}
		}
	}
}
