package Main;

import java.util.ArrayList;
import java.util.List;

import Bar.BubbleTeaBar;
import BubbleTea.Apple;
import BubbleTea.Bubble;
import BubbleTea.BubbleTea;
import BubbleTea.BubbleTeaIngredient;
import BubbleTea.Cinamon;
import BubbleTea.Orange;
import BubbleTea.Strawberry;

public class MainV9 {

	
	public static void main(String[] args) {
	
		BubbleTeaBar Bubbly = new BubbleTeaBar();
		List<BubbleTeaIngredient> firstTeaList = new ArrayList<>();
		firstTeaList.add(new Apple());
		firstTeaList.add(new Bubble(Bubble.Taste.BLUEBERRY));	
		BubbleTea tea1 = Bubbly.acceptOrder((BubbleTeaIngredient[]) firstTeaList.toArray());
	
		BubbleTea tea2 = new BubbleTea();
		tea2.addIngredient(new Orange());
		tea2.addIngredient(new Cinamon());
		tea2.addIngredient(new Bubble(Bubble.Taste.LIME));
		
		
		BubbleTea tea3 = new BubbleTea();
		tea3.addIngredient(new Strawberry());
		tea3.addIngredients(firstTeaList);
		
		System.out.println(tea1.toString());		
		System.out.println(tea2.toString());
		System.out.println(tea3.toString());
		
		
	}
}
