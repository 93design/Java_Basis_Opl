package frietkotSolved;

import java.util.Arrays;

public class Order {
	
	private Orderable[] order;
	private static int orderCount = 0;
	
	
	public double CalculateTotalPrice() {
		double sum = 0;
		for(Orderable el: order) {
			sum += el.getPrice();
		}		
		return sum;
	}
	
	public Order() {
		this.order = new Orderable[0];
		orderCount++;
	}
	
	public Order(Orderable[] onlineOrder) {
		this.order = onlineOrder;
		orderCount++;
	}

	//Put everything in fryer
	public void fryOrder() {	
		
		
		for(Orderable el: order) {
			if (el instanceof Fryable) {			
				((Fryable) el).Fry();
			}
		}
	}

	public static int getOrderNumber() {
		return 0;
	}

	public void addItem(Orderable orderIn) {
		order = Arrays.copyOf(order, order.length+1);
		order[order.length-1] = orderIn;
	}	
	
	
}

