package com.krollege.training.interfaces;

@FunctionalInterface
public interface PersonA {
	
	public void walk();

	default void talk() {
		System.out.println("Person A Walking");
	}
}
