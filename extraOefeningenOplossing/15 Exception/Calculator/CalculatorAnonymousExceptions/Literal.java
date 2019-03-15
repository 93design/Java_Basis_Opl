package CalculatorAnonymousExceptions;

public class Literal extends Expression{
	
	private Integer value;
	Literal(Integer value) {
		this.value = value;
	}
	public Literal() {
		// TODO Auto-generated constructor stub
	}
	@Override
	int getValue() {
		return value.intValue();
	}

}
