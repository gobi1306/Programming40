package org.stringqn;

import java.util.LinkedHashSet;

public class RemoveDublicates {

	public static void main(String[] args) {
		String s = "raining     here....";
		LinkedHashSet<Character> li = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			li.add(c);
		}

		for (Character ch : li) {
			System.out.print(ch);
			
		}
		
	}

}
