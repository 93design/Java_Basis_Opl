package Bar;

import java.util.List;

import BubbleTea.BubbleTeaIngredient;

public class Ticket {

	private double price;
	private static int ticketNo = 0;
	private List<BubbleTeaIngredient> order;
	private BubbleTeaIngredient [] orderArray;

	{
		ticketNo++;
	}

	public Ticket(int i) {
		this.price = i;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static int getTicketNo() {
		return ticketNo;
	}

	public static void setTicketNo(int ticketNo) {
		Ticket.ticketNo = ticketNo;
	}

	public List<BubbleTeaIngredient> getOrder() {
		return order;
	}

	public void setOrder(List<BubbleTeaIngredient> order) {
		this.order = order;
	}

	public BubbleTeaIngredient[] getOrderArray() {
		return orderArray;
	}

	public void setOrderArray(BubbleTeaIngredient[] orderArray) {
		this.orderArray = orderArray;
	}
	
	
}
