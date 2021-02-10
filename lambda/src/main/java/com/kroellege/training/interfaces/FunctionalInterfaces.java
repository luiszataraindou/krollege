package com.kroellege.training.interfaces;

import com.kroellege.training.lambda.Operation;


public class FunctionalInterfaces {

	public double operation() {
		Operation operation = (x,y) -> x+y;
		
		return operation.calculate(3, 2);
	}
}
