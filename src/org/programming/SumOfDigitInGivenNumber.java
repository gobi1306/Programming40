package org.programming;

public class SumOfDigitInGivenNumber {
	public static void main (String[]args){

		int number=153;
		int reminder=0;
		int result=0;
		while(number>0){//153>0 T//15>0 T//1>0//0>0 False
		reminder=number%10;//153%10=3;//15%10=5//1%10=1
		result=reminder+result;//3+0=3//5+3=8//1+8=9
		number=number/10;//153/10=15.3=15//15/10=1.5=1//0.1
		}
		System.out.println(result);
		}

}
