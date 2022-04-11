package com.bridgelabz.ForLoop;
/*
 * @author : Ashwini
 * Program to reverse the integer number eg. Input n=231 reverse is 132
 */
public class ReversIntegerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 231, reversed = 0;

	    for(;num != 0; num /= 10) {
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;
	    }

	    System.out.println("Reversed Number: " + reversed);


	}

}
