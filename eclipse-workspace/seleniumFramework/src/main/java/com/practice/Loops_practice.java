package com.practice;

import java.util.Scanner;

public class Loops_practice {
	
	public static int sumOfElements(int[] array) {
		int total=0;
		for(int i: array) {
			total+=i;
		}return total;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int input =sc.nextInt();
		int factorial = 1;
		for(int i=1;i<=input;i++) {
			factorial*=i;
		}
	
		System.out.println("fact of " + input + "is " + factorial);
		
		Scanner  sc1 = new Scanner(System.in);
		System.out.println("Enter name: ");
		String original = sc1.nextLine();
		String rev = "";
		
		for (int i=original.length()-1;i>=0;i--) {
		
			rev+=original.charAt(i);
			
		}
		if(original.equals(rev)) {
			System.out.println(original + " is a palindrome");
		}else {
			System.out.println(original + " is not a palindrome");
		}
		
		int[] num = {10,20,30,5};
		int output = sumOfElements(num);
		System.out.println(output);
		
	}		
	
}
