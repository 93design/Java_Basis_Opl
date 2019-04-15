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
	
	}
	/** Constructor accepting an array of ingredients*/
	public BubbleTea(BubbleTeaIngredient[] bubbleTeaIngredients) {
		
		this.ingredients = Stream.of(bubbleTeaIngredients).collect(Collectors.toList());
	}

	public List<BubbleTeaIngredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<BubbleTeaIngredient> ingredients) {
		this.ingredients = ingredients;
	}
	
	/**adds a list of extra ingredients to the back of the list*/
	public void addIngredients(List<BubbleTeaIngredient> ingredients) {
		this.ingredients.addAll(ingredients);
	}
	/**adds an extra ingredient to the back of the list*/
	public void addIngredient(BubbleTeaIngredient ingredient) {
		this.ingredients.add(ingredient);
	}
	/** Methode display the drinking of a Tea and then make the list empty*/
	public void drink() {
		System.out.println("Drinking a BubbleTea" + ingredients.toString());
		ingredients.clear();
	}

	@Override
	public String toString() {
		return "BubbleTea " + ingredients + "";
	}
	
	

}
