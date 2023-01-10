package org.premstring;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s1="silent";
		String s2="listen";
		if (s1.length()==s2.length()) {
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			String a =String.valueOf(c1);
	        String b = String.valueOf(c2);
	        
			
			if (a.equals(b)) {
				System.out.println("it is anagram");
				
			}else {
			
				System.out.println("it is not anagram character not matched");
			}
		
		}else {
			System.out.println("it is not anagram length not matched");
			
		}
		
	}

}
