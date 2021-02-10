package com.krollege.training.main;

import com.krollege.training.interfaces.DefaultMethod;
import com.krollege.training.lambda.Lambda;
import com.krollege.training.lambda.LambdaSintax;
import com.krollege.training.method.reference.MethodReference;


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
