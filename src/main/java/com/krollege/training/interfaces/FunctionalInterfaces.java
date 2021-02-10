package com.krollege.training.interfaces;

import com.krollege.training.lambda.Operation;


public class FunctionalInterfaces {

	public double operation() {
		Operation operation = (x,y) -> x+y;
		
		return operation.calculate(3, 2);
	}
}
