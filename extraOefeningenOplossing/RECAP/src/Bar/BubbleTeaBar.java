package Bar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import BubbleTea.Boilable;
import BubbleTea.BubbleTeaIngredient;

public class BubbleTeaBar {

	private double profit;
	private int orderTotal = 0;
	private List<Boilable> ingredient;
	private Register register = new Register();

	public BubbleTeaBar() {

	}

	
	  public void acceptOrder(BubbleTeaIngredient[] bubbleTeaIngredients) {
	  System.out.println( "accepted order:" + orderTotal +
	  " of an special Smoothie: " + Arrays.toString(bubbleTeaIngredients));
	  makeOrder(bubbleTeaIngredients); orderTotal++; }
	 
	
	public void acceptTicket(Ticket ticketIn) {
		if(ticketIn.getOrder() != null) {
			System.out.println("accepted order:" + orderTotal + " of an special Smoothie: " + ticketIn.getOrder().toString());
			makeOrder((BubbleTeaIngredient[]) ticketIn.getOrder().toArray());
			orderTotal++;
			register.addTicket(ticketIn);
		}	
	}
	
	public void acceptOrder(Ticket ticketIn) {
		System.out
				.println("accepted order:" + orderTotal + " of an special Smoothie: " + ticketIn.getOrder().toString());
		makeOrder((BubbleTeaIngredient[]) ticketIn.getOrder().toArray());
		orderTotal++;
		register.addTicket(ticketIn);
	}

	public void acceptOrder(MenuKaart menuChoice) {
		System.out.println("accepted order:" + orderTotal + " of a " + menuChoice.name().toLowerCase() + " smoothie");
		makeOrder(menuChoice.getMix());
		System.out.println("Order:" + orderTotal + " made");
		System.out.println("price:" + calcOrder(menuChoice.getMix()));
		orderTotal++;
	}

	private void makeOrder(BubbleTeaIngredient[] bubbleTeaIngredients) {
		System.out.println("--------------------------------------");
		System.out.println("starting making new order. WaterHeating up");
		System.out.println("---------------------------------------");
		for (BubbleTeaIngredient mix : bubbleTeaIngredients) {
			if (mix instanceof Boilable) {
				((Boilable) mix).boil();
			}
		}
	}

	private double calcOrder(BubbleTeaIngredient[] bubbleTeaIngredients) {
		return Stream.of(bubbleTeaIngredients).mapToDouble(order -> order.getPrice()).sum();
	}


	public double getProfit() {
		return profit;
	}


	public void setProfit(double profit) {
		this.profit = profit;
	}


	public Register getRegister() {
		return register;
	}


	public void setRegister(Register register) {
		this.register = register;
	}
	
	

}
