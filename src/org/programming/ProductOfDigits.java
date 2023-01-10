package org.programming;

public class ProductOfDigits {
	public static void main (String[]args){

		int number=153;
		int reminder=0;
		int result=1;
		while(number>0){
		reminder=number%10;
		result=reminder*result;
		number=number/10;
		}
		System.out.println(result);
		}
}
