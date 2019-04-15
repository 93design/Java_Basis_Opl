package Bar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import BubbleTea.Boilable;
import BubbleTea.BubbleTea;
import BubbleTea.BubbleTeaIngredient;

public class BubbleTeaBar {

	private double profit;
	private int orderTotal = 0;
	private List<Boilable> ingredient;
	private Register register = new Register();

	public BubbleTeaBar() {

	}

	public BubbleTea acceptOrder(BubbleTeaIngredient[] bubbleTeaIngredients) {
		System.out.println(
				"accepted order:" + orderTotal + " of an special Smoothie: " + Arrays.toString(bubbleTeaIngredients));
		makeOrder(bubbleTeaIngredients);
		orderTotal++;
		
		return new BubbleTea(bubbleTeaIngredients);
	}

	public void acceptTicket(Ticket ticketIn) {
		System.out.println("\n\n-----------------------------------------------------");
		if (ticketIn.getOrder() != null) {
			System.out.println(
					"		Ticket " + ticketIn.getId() + "\nOrder: " + orderTotal + ": " + ticketIn.getOrder().toString());
			makeOrder(ticketIn.getOrder());
			orderTotal++;
			register.addTicket(ticketIn);
		} else {
			System.out.println("Ticket " + ticketIn.getId() + " zonder order ");	
			if(ticketIn.getPrice() > 0) {
				register.addTicket(ticketIn);
			}
		}
	
		System.out.println("	total price: " + ticketIn.getPrice());
		System.out.println("--------------------------------------------------------");
	}

	public void acceptOrder(Ticket ticketIn) {
		System.out.println("--------------------------------------");
		System.out
				.println("accepted order:" + orderTotal + " of an special Smoothie: " + ticketIn.getOrder().toString());
		makeOrder((BubbleTeaIngredient[]) ticketIn.getOrder().toArray());
		orderTotal++;
		register.addTicket(ticketIn);
		System.out.println("--------------------------------------");
		
		System.out.println("	total price: " + ticketIn.getPrice());
	}

	public void acceptOrder(MenuKaart menuChoice) {
		System.out.println("accepted order:" + orderTotal + " of a " + menuChoice.name().toLowerCase() + " smoothie");
		makeOrder(menuChoice.getMix());
		System.out.println("Order:" + orderTotal + " made");
		System.out.println("price:" + calcOrder(menuChoice.getMix()));
		orderTotal++;
		double total = calcOrder(menuChoice.getMix());
		register.addTicket(new Ticket(total));
	}

	private BubbleTea makeOrder(BubbleTeaIngredient[] bubbleTeaIngredients) {
		
		System.out.println("starting making new order. WaterHeating up");
	
		for (BubbleTeaIngredient mix : bubbleTeaIngredients) {
			if (mix instanceof Boilable) {
				((Boilable) mix).boil();
			}
		}
		
	return new BubbleTea(bubbleTeaIngredients);
	}
	
	private BubbleTea makeOrder(List<BubbleTeaIngredient> bubbleTeaIngredients) {
		
		System.out.println(" - starting making new order: WaterHeating up");
		for (BubbleTeaIngredient mix : bubbleTeaIngredients) {
			if (mix instanceof Boilable) {
				((Boilable) mix).boil();
			} else {
				System.out.println(" - added " + mix + " to the cup");
			}
		}
	
		
	return new BubbleTea(bubbleTeaIngredients);
	}

	private double calcOrder(BubbleTeaIngredient[] bubbleTeaIngredients) {
		return Stream.of(bubbleTeaIngredients).mapToDouble(order -> order.getPrice()).sum();
	}

	public double getProfit() {
		return register.getProfit();
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
