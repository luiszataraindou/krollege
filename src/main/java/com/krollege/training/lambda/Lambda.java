package com.krollege.training.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda
{
	
	public void average() {
		// Java 7 Approach
		Operation operationJava7 = new Operation() {
			@Override
			public double calculate(double value1, double value2) {
				return (value1 +value2)/2;
			}
		};
		// Java 8 Approach
		Operation operationJava8 = (double x, double y) -> (x+y)/2;
		
        System.out.println( "operation with Java 7 Approach :: " + operationJava7.calculate(2,3) );
        System.out.println( "operation with Java 8 Approach :: " + operationJava8.calculate(2,3) );


	}
	
	
	public void sort() {
		List<String> simpleListJava7 = new ArrayList<>();
		simpleListJava7.add("Kroellege");
		simpleListJava7.add("Java 7");
		simpleListJava7.add("Lambda");

		List<String> simpleListJava8 = new ArrayList<>();
		simpleListJava8.add("Kroellege");
		simpleListJava8.add("Java 8");
		simpleListJava8.add("Lambda");
		
		// Java 7 Approach 
		Collections.sort(simpleListJava7, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		// Java 8 Approach
		Collections.sort(simpleListJava8, (String o1, String o2) -> o1.compareTo(o2));
			
		
		for(String element : simpleListJava7) {
	        System.out.println( "Java 7 element :: " + element );
	
		}
		
		for(String element : simpleListJava8) {
	        System.out.println( "Java 8 element :: " + element );
	
		}
		
	}
	


}
