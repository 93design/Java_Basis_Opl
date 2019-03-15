package CalculatorException;

public class Division implements Operation {

	@Override
	public Expression perform(Expression left, Expression right) {
		   try{
               Expression e = new Literal(left.getValue() / right.getValue());
               return e;
           } catch(ArithmeticException e1){
               System.out.println("Cannot devide by zero");
               return new Literal(0);
           }
		   
		   
		
		
	}


}
