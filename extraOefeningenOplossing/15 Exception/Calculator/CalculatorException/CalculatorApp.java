package CalculatorException;

public class CalculatorApp {
	public static void main(String [] args) {
		
			
			Operation add = new Addition();
			System.out.println(add.perform(new Literal(20), new Literal(30)).getValue());
			

			Operation div = new Division();
			System.out.println(div.perform(new Literal(30), new Literal(0)).getValue());
			
			
	}
}
