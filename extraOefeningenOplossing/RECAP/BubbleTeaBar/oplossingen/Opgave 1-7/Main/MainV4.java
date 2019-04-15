package Main;

import java.util.ArrayList;
import java.util.List;

import Bar.BubbleTeaBar;
import BubbleTea.Apple;
import BubbleTea.Boilable;
import BubbleTea.Bubble;
import BubbleTea.BubbleTeaIngredient;
import BubbleTea.Cinamon;

/**
 * @author Jamie Goegebeur
 * @version 4
 * */
public class MainV4 {
	public static void main(String[] args) {

		BubbleTeaIngredient ingred1 = new Apple();
		BubbleTeaIngredient ingred2 = new Cinamon();
		BubbleTeaIngredient ingred3 = new Bubble(Bubble.Taste.LIME);

		System.out.println(ingred1);
		System.out.println(ingred2);
		System.out.println(ingred3);

		// opdracht 1
		List<BubbleTeaIngredient> test = new ArrayList<>();

		test.add(ingred1);
		test.add(ingred2);
		test.add(ingred3);
		
		//opdracht 2
		double sum = 0;
		for (int i = 0; i < test.size(); i++) {
			sum += test.get(i).getPrice();
		}
	
		System.out.println("\nforEach: " + sum);

			// With streams
			double sum2 = test.stream().mapToDouble(i -> i.getPrice()).sum();
			System.out.println("streamSum: " + sum2+ "\n");
			
		//opdracht3
			System.out.println("Boiling water:");
			for (BubbleTeaIngredient ing : test) {
				if (ing instanceof Boilable) {
					((Boilable) ing).boil();
				} else {
					
				}
			}
	}
}
