package frietkotSolved;

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
		Order order1 = new Order();
		
		Fries friesBig = new Fries();
		Fries friesSmall = new Fries();
		Sauce sauceMayo = new Sauce();
		Sauce sauceKetch = new Sauce();
		Water drinkWater = new Water();
		Soda drinkSoda = new Soda();
		
		friesBig.setSize(FriesSize.BIG);
		friesSmall.setSize(FriesSize.SMALL);
		sauceMayo.setName("Mayonaise");
		sauceKetch.setName("Ketchup");
		drinkWater.setName("Chaude");
		drinkSoda.setName("Cola");
		
		order1.addItem(friesBig);		
		order1.addItem(friesSmall);		
		order1.addItem(sauceKetch);		
		order1.addItem(sauceMayo);		
		order1.addItem(drinkWater);		
		order1.addItem(drinkSoda);		
		
		
		
		order1.fryOrder();
		System.out.println("Totaal prijs voor deze order is " + order1.CalculateTotalPrice());
	}
	
	private void makeOrderTwo() {
		
		Order order2 = new Order();
		
		Fries friesBig = new Fries(FriesSize.BIG);
		Fries friesSmall = new Fries(FriesSize.SMALL);
		Sauce sauceMayo = new Sauce("Maynoaise");
		Sauce sauceKetch = new Sauce("Ketchup");
		Water drinkWater = new Water("Chaud");
		Soda drinkSoda = new Soda("Cola");
		
		order2.addItem(friesBig);		
		order2.addItem(friesSmall);		
		order2.addItem(sauceKetch);		
		order2.addItem(sauceMayo);		
		order2.addItem(drinkWater);		
		order2.addItem(drinkSoda);		
		
		
		order2.fryOrder();
		System.out.println("Totaal prijs voor deze order is " + order2.CalculateTotalPrice());
	}

	// make an onlineOrder with a Orderable array
	private void makeOrderTree() {
		
		Orderable[] onlineOrder = new Orderable[] {new Fries(FriesSize.BIG), new Sauce("Ketchup"),  new Water("Chaud")};
		

		Order order3 = new Order(onlineOrder);
		
		//order3.fryOrder();
		System.out.println("Totaal prijs voor deze order is " + order3.CalculateTotalPrice());

	};

	// make an your own Order
	private void makeOrderFour() {

		//order4.fryOrder();
		//System.out.println(order3.CalculateTotalPrice());

	};

}
