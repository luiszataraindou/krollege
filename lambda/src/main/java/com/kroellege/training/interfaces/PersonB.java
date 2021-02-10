package com.kroellege.training.interfaces;

@FunctionalInterface
public interface PersonB {
	
	public void walk();

	default void talk() {
		System.out.println("Person B Walking");
	}

}
