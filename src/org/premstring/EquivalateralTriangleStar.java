package org.premstring;

public class EquivalateralTriangleStar {

	public static void main(String[] args) {

		int n=5;
		for (int i = 1; i <n; i++) {//1<5//2<5
			for (int j = n-i; j >0; j--) {//4>0//3>0//2>0//1>0//fail//5-2=3
				System.out.print(" ");
				
			}
			for (int j = 0; j <i; j++) {//0<1//
				System.out.print(i+ " ");
				
			}
			System.out.println();
		}
	}

}
