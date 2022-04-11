package com.bridgelabz.IfElse;
/*
 * @author : Ashwini
 * Number 1,10,100,1000 and display unit, ten hundred
 */
import java.util.Scanner;

public class DisplayNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number From 1, 10, 100, 1000 : ");
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		if(a == 1 ) {
			System.out.println(a + " = Unit ");
		}
		else if (a == 10) {
			System.out.println(a + " = Ten ");
		}
		else if (a == 100) {
			System.out.println(a + " = Hundred ");
		}
		else if (a == 1000) {
			System.out.println(a + " = Thausand ");
		}
		else {
			System.out.println("Enter the Number between given Number : ");
		}
	}

}


