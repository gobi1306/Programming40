package org.premstring;

public class LeftAngleTrianglePattern {

	public static void main(String[] args) {

		int n=5;
		for (int i = 1; i <=n; i++) {
			
			for (int j = n-i; j>0; j--) {
				System.out.print(" ");
				
			}
			for (int j = 0; j <i; j++) {
				System.out.print(i);
				
			}
			System.out.println();
		}
	}

}
