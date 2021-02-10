package com.krollege.training.lambda;
// A Functional interface can contain only one abstract method, and with this
// Annotation we ensure no other abstract method is added.

@FunctionalInterface
public interface Operation {
	
	public double calculate(double value1, double value2);
	
}
