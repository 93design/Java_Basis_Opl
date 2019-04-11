package jamie;

import java.util.Arrays;
import java.util.stream.Stream;

public class SmoothieBar {

	private double profit;
	private Stock stock = new Stock(20, 10, 20, 15, 10, 10);
	private int orderTotal = 0;

	public SmoothieBar(Stock stock) {
		super();
		this.stock = stock;
	}

	public SmoothieBar() {
	}

	public void acceptOrder(Mixable[] orderIn) {
		System.out.println("accepted order:" + orderTotal + " of an special Smoothie: "+ Arrays.toString(orderIn)  );
		makeOrder(orderIn);
		orderTotal++;

	}

	public void acceptOrder(MenuKaart menuChoice) {
		System.out.println("accepted order:" + orderTotal + " of a " + menuChoice.name().toLowerCase() + " smoothie");
		makeOrder(menuChoice.getMix());
		System.out.println("Order:" + orderTotal + " made");
		System.out.println("price:" + calcOrder(menuChoice.getMix()) );
	}

	private void makeOrder(Mixable[] orderIn) {
		for (Mixable mix: orderIn) {
			mix.mix();
		}
	}

	private double calcOrder(Mixable[] orderIn) {		
		return Stream.of(orderIn).mapToDouble(order -> order.getPrice()).sum();
	}
}
