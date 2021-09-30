package com.bridgelabz.basiccoreprograms;

public class FlipCoin {
   /**
    * Flip the Coin program and checking Head or 
    * Tail using Random function
    */
	public static void main(String[] args) {
		double coin = (int) (Math.random() * 10) % 2;	 
		if (coin == 1) {
			System.out.println("Head");
		} else {
			System.out.println("Tail");
		}
	}

}
