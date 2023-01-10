package org.programming;

public class CountOfAGivenNumber {
	public static void main(String[] args) {
		int number=153;
		int count=0;//1//2//3
		while (number>0) {//153>0 T//15>0 T//1>0 T//0>0 False
			number=number/10;//153/10=15//15/10=1//1/10=0
			count++;//0+1=1//1+1=2//2+1=3
		}
		System.out.println(count);
	}
	
	

}
