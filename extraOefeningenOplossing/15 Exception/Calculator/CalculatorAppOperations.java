package Calculator;

public class CalculatorAppOperations {
	public static void main(String [] args) {
		
			
			Operation add = new Addition();			
			Expression result = add.perform(new Literal(20), new Literal(30));			
			System.out.println(result.getValue());		

			
			//qoute out if no exception handling yet
			Operation div = new Division();
			System.out.println(div.perform(new Literal(30), new Literal(0)));
			
			
	}
}
