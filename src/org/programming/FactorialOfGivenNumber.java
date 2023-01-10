package org.programming;

public class FactorialOfGivenNumber {
	public static void main (String[]args){

		int number=5;
		int factorial=1;
		for(int i=1;i<=number;i++){//1<=5 T//2<=5 T//3<=5 T//4<=5//5<=5
		factorial=factorial*i;//1*1=1//1*2=2//2*3=6//6*4=24//24*5=120
		}
		System.out.println(factorial);
		}


}
