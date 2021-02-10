package com.krollege.training.method.reference;

import java.util.Arrays;
import java.util.Comparator;

import com.krollege.training.interfaces.PersonA;
import com.krollege.training.interfaces.PersonB;

public class MethodReference {

	public static void  staticMethodReference() {
		System.out.println("Referencing a static Method");
	}
	
	public void arbitraryInstanceObjectMethodReference() {
		String [] namesWithComparator = {"Jonh", "Jane", "Doe"};
		
		Arrays.sort(namesWithComparator, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		});
		
		String [] namesWithLambda = {"Jonh", "Jane", "Doe"};
		Arrays.sort(namesWithLambda, (s1, s2) -> s1.compareToIgnoreCase(s2));
		
		String [] namesWithMetRef = {"Jonh", "Jane", "Doe"};
		Arrays.sort(namesWithMetRef, String::compareToIgnoreCase);

			System.out.println("Printing names sorting using Comparator :: " + Arrays.toString(namesWithComparator));
		
		
			System.out.println("Printing names sorting using Lambda :: " + Arrays.toString(namesWithLambda));
		
		
			System.out.println("Printing names sorting using Method Reference :: " + Arrays.toString(namesWithMetRef));
		
	}
	public void constructorReference() {
		
	}
	
	public void reference() {
		
		// This a method reference using Lambdas.
		PersonA personA = () -> MethodReference.staticMethodReference();
		System.out.println("Referencing a static method using Lambdas : ");
		personA.walk();
		
		// This is a method reference, the :: operator allow you to reference a static method in a much cleaner way.
		// Note : Until this day you CAN'T reference a method that has attributes in Java. (Currying)
		PersonB personB = MethodReference::staticMethodReference;
		System.out.println("Referencing a static method using 4 point operator (::) : " );
		personB.walk();
	}
}
