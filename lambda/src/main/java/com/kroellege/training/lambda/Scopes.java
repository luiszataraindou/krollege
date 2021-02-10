package com.kroellege.training.lambda;

public class Scopes {

	private static double staticValue1;
	private double staticValue2;
	
	public double testLocalVariable() {
		final double n3 = 3.0;
		Operation operation = new Operation() {
			// Java 7 Approach
			@Override
			public double calculate(double value1, double value2) {
				// The only way to utilize local variables is to mark it as final.
//				n3 = value1 + value2;
				return n3;
			
			}
		};
		// Java 8 Approach
		Operation op = (x, y) -> {
			return x + y + n3;
		};
		return op.calculate(3, 4);
	}
	
	public double testStaticVariable() {
		Operation op = (x, y) -> {
			// Both static and class attributes can be modified inside the stream.
			staticValue1 = x + y;
			staticValue2 = x + y;
			return staticValue1;
		};
		return staticValue2;
		
	}
}
