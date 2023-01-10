package org.programming;

public class ReverseTheGivenNumber {

	public static void main(String[] args) {

		int number=345;//34//3//0
		int reminder=0;//5/4//0
		int result=0;//5 //54//543
		
		while (number>0) {
			
			reminder=number%10;//0=345%10 =5//34%10=4//3%10=3
			result=(result*10)+reminder;//0*10+5=5//5*10+4=54//54*10+3=543
			number=number/10;//345/10=34//34/10=3//3/10=0
			
		}
		System.out.println(result);
	}

}
