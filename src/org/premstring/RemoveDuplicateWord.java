package org.premstring;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWord {

	public static void main(String[] args) {

		String s = "java sql selenium python java python";
		Set<String>si=new LinkedHashSet<>();
		String[] sp = s.split(" ");
		for (String s1 : sp) {
			si.add(s1);
		}
		for (String s2 : si) {
			System.out.print(s2+" ");
			
		}
	}
	

}
