package org.premstring;

public class StarPatternOrTriangular {

	public static void main(String[] args) {

		int n=5;
		for (int i = 1; i <=n; i++) {//i=1<=5,2<=5,3<=5
			for (int j = 0; j < i; j++) {//0<1,1<1//0<2//1<2//0<3
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
	}

}
