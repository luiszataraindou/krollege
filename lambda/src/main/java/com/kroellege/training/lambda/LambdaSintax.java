package com.kroellege.training.lambda;

public class LambdaSintax {

	
	public double testSintax() {
		// The three of this syntaxes are correct and have the same result.
		Operation operation = (double x, double y) -> (x+y)/2;
//		Operation operation = (x, y) -> {return (x+y)/2;};
//		Operation operation = (x, y) -> {
//			double a = 2.0;
//			return (x+y)/a;
//			};
		
		return operation.calculate(2, 3);
	}
	
	
}
