package Bar;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;

import BubbleTea.BubbleTeaIngredient;

public class Ticket {

	private double price;
	private static int ticketNo = 0;
	private List<BubbleTeaIngredient> orderList;
	private BubbleTeaIngredient [] orderArray;
	private Order order;
	private LocalDateTime time;
	private String id;
	
	/**
	 * @param accepts a double price
	 * constuctor makes an internal time stamp and basses his id on it
	 * */
	public Ticket(double price) {
		this.price = price;
		this.time = LocalDateTime.now();
		ZoneOffset zone = ZoneOffset.of("Z");
		this.id = time.getDayOfYear() + "_" + time.toEpochSecond(zone) + "_" +ticketNo ;
		ticketNo++;
	}
	
	/**
	 * @param accepts an order and makes an internal time stamp and basses his id on it
	 * constuctor makes an internal time stamp and basses his id on it
	 * */
	public Ticket(Order order) {

		super();
		this.order = order;
		this.orderList = order.getOrderList();
		calcPrice(order.getOrderList());
		this.time = LocalDateTime.now();
		ZoneOffset zone = ZoneOffset.of("Z");
		this.id = time.getDayOfYear() + "_" + time.toEpochSecond(zone) + "_" +ticketNo ;
		ticketNo++;
	}
	/**
	 *  constuctor makes an internal time stamp and basses his id on it
	 * @param accepts an List and makes an internal time stamp and basses his id on it
	 * */
	public Ticket(List<BubbleTeaIngredient> orderList) {
		super();
		this.orderList = orderList;
		calcPrice(orderList);
	}

	public double getPrice() {
		return price;
	}

	public static int getTicketNo() {
		return ticketNo;
	}

	public static void setTicketNo(int ticketNo) {
		Ticket.ticketNo = ticketNo;
	}

	public List<BubbleTeaIngredient> getOrder() {
		return orderList;
	}

	public void setOrder(List<BubbleTeaIngredient> order) {
		this.orderList = order;
		calcPrice(order);
	}

	public BubbleTeaIngredient[] getOrderArray() {
		return orderArray;
	}

	public void setOrderArray(BubbleTeaIngredient[] orderArray) {
		this.orderArray = orderArray;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public List<BubbleTeaIngredient> getOrderList() {
		return orderList;
	}

	public void setOrder(Order order) {
		this.order = order;
		this.orderList = order.getOrderList();
	}
	/**
	 * calculates price and sets it also returns it
	 * @param accepts an List and makes an internal time stamp and basses his id on it
	 * @returns calculated price of a list
	 * 
	 * */
	public double calcPrice(List<BubbleTeaIngredient> order) {
		this.price = order.stream().mapToDouble(i -> i.getPrice()).sum();
		return this.price;
	}

	public String getId() {
		return id;
	}
	
	
}
