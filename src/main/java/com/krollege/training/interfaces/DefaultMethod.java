package com.kroellege.training.interfaces;

public class DefaultMethod implements PersonA, PersonB {

	@Override
	public void walk() {
		System.out.println("Person Walking");		
	}

	// If you implement two interfaces with the same default method declared,
	// You will have to Override Method Walk, because it's defined in Both Person interfaces 
	// so the compiler doesn't know which one to pick.
	@Override
	public void talk() {
		System.out.println("Person Talking");
		PersonA.super.talk();
		PersonB.super.talk();
	}

}
