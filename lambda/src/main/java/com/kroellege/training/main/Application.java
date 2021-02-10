package com.kroellege.training.main;

import com.kroellege.training.interfaces.DefaultMethod;
import com.kroellege.training.lambda.Lambda;
import com.kroellege.training.lambda.LambdaSintax;
import com.kroellege.training.method.reference.MethodReference;


public class Application {
    public static void main( String[] args )
    {
        LambdaSintax lambdaSintax = new LambdaSintax();
    	Lambda app = new Lambda();
    	app.sort();
    	app.average();
    	
    
    	System.out.println("Lambda Sintax :: " + lambdaSintax.testSintax());
    	
    	DefaultMethod defaultMethod = new DefaultMethod();
    	defaultMethod.walk();
    	defaultMethod.talk();
    	
    	MethodReference methodReference = new MethodReference();
    	methodReference.arbitraryInstanceObjectMethodReference();
    	methodReference.reference();
    	
    	
    }
}
