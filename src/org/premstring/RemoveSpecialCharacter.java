package org.premstring;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {

		String s ="greens$%608!@gmail.com";
		String rep=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(rep);
	}

}
