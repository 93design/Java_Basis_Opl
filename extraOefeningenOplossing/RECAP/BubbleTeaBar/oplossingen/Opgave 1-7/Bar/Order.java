package Bar;

import java.util.List;

import BubbleTea.BubbleTeaIngredient;
import BubbleTea.Cream;

public class Order {
	
	private List<BubbleTeaIngredient> orderList;
	private static int orderNo = 0;
	private int id;
	{
		
		this.id = orderNo;
		orderNo++;
	}

	
	public Order(List<BubbleTeaIngredient> orderList) {
		super();
		this.orderList = orderList;
	}

	public List<BubbleTeaIngredient> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<BubbleTeaIngredient> orderList) {
		this.orderList = orderList;
	}

	public static int getOrderNo() {
		return orderNo;
	}

	public void addIngredient(BubbleTeaIngredient ingredient) {
		this.orderList.add(ingredient);
		
	}

	public int getId() {
		return id;
	}
	
	
	
	

}
