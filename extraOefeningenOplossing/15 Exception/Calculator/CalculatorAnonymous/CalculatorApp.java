package CalculatorAnonymous;

public class CalculatorApp {
	public static void main(String[] args) {

		// methode 1
		Operation add = new Addition();
		Expression resultAdd = add.perform(new Literal(20), new Literal(30));
		System.out.println(resultAdd.getValue());

		// methode5
		Operation Square = new Operation() {

			@Override
			public Expression perform(Expression left, Expression right) {
				int result = left.getValue();
				for (int i = 1; i < right.getValue(); i++) {
					result *= result;
				}
				return new Literal(result);
			}

		};

		System.out.println(Square.perform(new Literal(5), new Literal(2)).getValue());

		// methode6
		Literal sixTeen = new Literal(16);

		System.out.println(new Operation() {

			public Expression perform(Expression left) {
				double x = Math.sqrt(left.getValue());
				try {
					return new Expression() {
						@Override
						int getValue() {
							// TODO Auto-generated method stub
							return 0;
						}

						Expression getDoubleValue() throws NegativeExpressionException {

							if (left.getValue() < 0) {
								throw new NegativeExpressionException();
							}
							return new Literal((int) Math.round(x));
						}

					}.getDoubleValue();

				} catch (NegativeExpressionException e) {
					System.out.println("No negative numbers allowed");
					e.printStackTrace();
					return null;
				}

			}

			@Override
			public Expression perform(Expression left, Expression right) {
				return null;
			}

		}.perform(sixTeen).getValue());
		
		// methode6
				Literal sixTeenNegative = new Literal(-16);

				System.out.println(new Operation() {

					public Expression perform(Expression left) {
						double x = Math.sqrt(left.getValue());
						try {
							return new Expression() {
								@Override
								int getValue() {
									// TODO Auto-generated method stub
									return 0;
								}

								Expression getDoubleValue() throws NegativeExpressionException {

									if (left.getValue() < 0) {
										throw new NegativeExpressionException();
							 		}
									return new Literal((int) Math.round(x));
								}

							}.getDoubleValue();

						} catch (NegativeExpressionException e) {
							System.out.println("No negative numbers allowed");
							//e.printStackTrace();
							return new Literal(0);
						}
						
					}

					@Override
					public Expression perform(Expression left, Expression right) {
						return null;
					}

				}.perform(sixTeenNegative).getValue());
		
		
		
	}

}
