package org.programming;

public class Exp {
	public static void main(String[] args) {
		System.out.println(2 / 2);
		System.out.println(4 / 2);
		System.out.println(6 / 2);
		try {
			System.out.println(8 / 0);
		}

			catch (Exception e) {
				System.out.println(e);
			}
		finally {
				System.out.println("exception handled or not it will execute");

				
			}
		System.out.println(10 / 2);
		System.out.println(12 / 2);
		
	}

}
