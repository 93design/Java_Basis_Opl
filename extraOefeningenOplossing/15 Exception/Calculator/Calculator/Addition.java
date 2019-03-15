package Calculator;

public class Addition implements Operation{

	@Override
	public Expression perform(Expression left, Expression right) {		
		return new Literal(left.getValue() + right.getValue());
	}

}
