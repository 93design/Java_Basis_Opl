package CalculatorException;

public class Literal extends Expression{
	
	private Integer value;
	Literal(Integer value) {
		this.value = value;
	}
	@Override
	int getValue() {
		return value.intValue();
	}

}
