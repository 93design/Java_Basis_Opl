package Calculator;

public class CompoundExpression extends Expression {

		Expression left;
		Expression right;
		Operation op;
		
		public CompoundExpression(Expression left, Operation op, Expression right) {
			this.left = left;
			this.op = op;
			this.right = right;
		}

		@Override
		int getValue() {
			return op.perform(left, right).getValue();
		}
		
}
