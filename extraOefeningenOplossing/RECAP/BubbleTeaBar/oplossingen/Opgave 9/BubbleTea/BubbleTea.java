package BubbleTea;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BubbleTea {
	
	List<BubbleTeaIngredient> ingredients = new ArrayList<>();

	public BubbleTea(List<BubbleTeaIngredient> listIn) {
		this.ingredients = listIn;
	}

	public BubbleTea() {
		// TODO Auto-generated constructor stub
	}

	public BubbleTea(BubbleTeaIngredient[] bubbleTeaIngredients) {
		
		this.ingredients = Stream.of(bubbleTeaIngredients).collect(Collectors.toList());
	}

	public List<BubbleTeaIngredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<BubbleTeaIngredient> ingredients) {
		this.ingredients = ingredients;
	}
	
	public void addIngredients(List<BubbleTeaIngredient> ingredients) {
		this.ingredients.addAll(ingredients);
	}
	
	public void addIngredient(BubbleTeaIngredient ingredient) {
		this.ingredients.add(ingredient);
	}
	public void drink() {
		System.out.println("Drinking a BubbleTea" + ingredients.toString());
	}

	@Override
	public String toString() {
		return "BubbleTea " + ingredients + "";
	}
	
	

}
