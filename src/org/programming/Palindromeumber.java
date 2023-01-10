package org.programming;

public class Palindromeumber {

	public static void main(String[] args) {
		int number=121;
		int n=number;
		int reminder=0;
		int result=0;
		
		while (number>0) {
			
			reminder=number%10;
			result=(result*10)+reminder;
			number=number/10;
			
		}
		
		if (n==result) {
			System.out.println("Number is Palindrome");
			
		}
		else {
			System.out.println("Number is Not palindrome");
		}

	}
	

}
