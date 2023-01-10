package org.programming;

public class FibonacciSeries {
	public static void main (String[]args){

		int a=0;
		int b=1;
		System.out.println(a);//0
		System.out.println(b);//1
		for(int i=1;i<=5;i++){//1<=5 T
		int c=a+b;//0+1=1
		System.out.println(c);//1
		a=b;
		b=c;
		}
		}


}
