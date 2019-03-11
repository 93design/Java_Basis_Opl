package frietkotempty;

public class Fryshack {

	private String name;

	public Fryshack(String string) {
		this.name = string;
	}

	public String getName() {
		return name;
	}

	public void makeOrders() {
		makeOrderOne();
		makeOrderTwo();
		makeOrderTree();
		makeOrderFour();
	}

	// make an order by making Fries, Sauce and Drink Objects and setting them with
	// there Setters
	private void makeOrderOne() {


		//order1.fryOrder();
		//System.out.println(order1.CalculateTotalPrice());
	}

	// make an order by making new Fries, Sauce and Drink Objects and setting them
	// with there Constructors
	private void makeOrderTwo() {
		

		//order2.fryOrder();
		//System.out.println(order2.CalculateTotalPrice());
	}

	// make an onlineOrder with a Orderable array
	private void makeOrderTree() {
		
		
		//order3.fryOrder();
		//System.out.println(order3.CalculateTotalPrice());

	};

	// make an your own Order
	private void makeOrderFour() {

		//order4.fryOrder();
		//System.out.println(order3.CalculateTotalPrice());

	};

}
