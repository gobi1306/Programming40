package org.premstring;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String s = "raining ..here ...";
		Set<Character> s1=new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			s1.add(c);
			
			
		}
		for (Character dup : s1) {
			System.out.print(dup);
		}
	}

}
