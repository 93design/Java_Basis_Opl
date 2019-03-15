package Calculator;

public class CalculatorAppCompound {
	public static void main(String [] args) {
		
			//methode 1
			Operation add = new Addition();			
			CompoundExpression first = new CompoundExpression(new Literal(20), add,  new Literal(30));
			System.out.println(first.getValue());
		
			//methode2
			Operation sub = new Subtraction();		
			Literal twenty = new Literal(20);
			Literal thirty = new Literal(30);
				
			CompoundExpression second = new CompoundExpression(twenty, sub,  thirty);
			System.out.println(first.getValue());
			
			
			
			
	}
}
