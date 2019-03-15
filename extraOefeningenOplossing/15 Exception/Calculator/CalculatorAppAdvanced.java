package Calculator;

public class CalculatorAppAdvanced {
	public static void main(String [] args) {
		
			//methode 1
			Operation add = new Addition();			
			Expression resultAdd = add.perform(new Literal(20), new Literal(30));			
			System.out.println(resultAdd.getValue());		

			//methode2
			Operation sub = new Subtraction();		
			Literal twenty = new Literal(20);
			Literal thirty = new Literal(30);
			Expression resultSub = sub.perform(twenty, thirty);			
			System.out.println(resultSub.getValue());		
			
			
			//methode3
			Operation multi = new Multiplication();			
			System.out.println(multi.perform(new Literal(20), new Literal(30)).getValue());	
			
			//methode4
			Literal lit;
			Operation div = new Division();
			System.out.println(div.perform(lit = new Literal(50), new Literal(5)).getValue());
			
			//qoute out if no exception handling yet
			//Operation div2 = new Division();
			//System.out.println(div2.perform(new Literal(30), new Literal(0)));
			
			//methode5
			
			
	}
}
