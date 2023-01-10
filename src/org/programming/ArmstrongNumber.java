package org.programming;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number =371;
		int n=number;
		int reminder=0;
		int result=0;

		while(number>0){//true (371>0)//37>0//3>0

		reminder = number%10;//371%10=1//37%10=7//3%10=3
		result=(reminder*reminder*reminder)+result;//1*1*1+0=1//7*7*7=343+1=344//3*3*3=27+344=371
		number=number/10;//371/10=37.1=37//37/10=3.7=3//3/10=0.3
		}
		if(result==n){
		System.out.println("the number is amstrong");
		}
		else{
		System.out.println("the number is not armstrong");
		}




		

	}

}
