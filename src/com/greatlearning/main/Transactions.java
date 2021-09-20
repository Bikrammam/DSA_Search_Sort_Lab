package com.greatlearning.main;

import java.util.Scanner;

public class Transactions {
	private static Scanner sc = new Scanner( System.in );
    
	public static void main( String[] args ) {
    	// get the size of transactions from user
		System.out.println( "Enter the size of transaction array" );
    	int size = sc.nextInt();
    	
		// allocate an array of provided size
    	int[] transactions = new int[size];
    	
		
    	System.out.println( "Enter the values of array" );
       // get the elements of the array (in a loop)
    	for( int i = 0; i < size; i++ ) {
    		transactions[i] = sc.nextInt();
    	}
    	
    	// get the number of targets
    	System.out.println( "Enter the total no of targets that needs to be achieved" );
    	int numTargets = sc.nextInt();
    	
    	
    	
    	// loop so many times (as number of targets)
    	for( int i = 0; i < numTargets; i++) {
    	    // get the target
    		System.out.println( "Enter the value of target" );
    		int target = sc.nextInt();
    		
    	    // again start a loop to calculate the sum
    		int sum = 0;
    	    for( int j = 0; j < transactions.length; j++ ) {	
    	        // sum till the element
    	    	sum = sum + transactions[j];
    	    	
    	        // check if target is reached
    	    	if( sum >= target ) {
    	    		// print out the number of transactions when target is reached	
    	    	    System.out.println( "Target is achieved after " + ( j + 1 ) + " transactions" );
    	    	    break; // we stop execution of the closest (inner) for loop
    	    	}
    	    	
    	    	// we reached the final transaction and target is still not reached :(
    	    	if( j == transactions.length - 1 && sum < target ) {
    	    		System.out.println( "Target is not reached" );
    	    	}       
    	    }
    	}    
    }
}
