package org.premstring;

public class UpperCaseOfFirstLetterEachWord {

	public static void main(String[] args) {

		String s ="welcome to java class";
		String[] sp = s.split(" ");
		String result="";
		for (int i = 0; i < sp.length; i++) {
			String s1=sp[i];
			char c = s1.charAt(0);//w     
			String sub = s1.substring(1);//elcome
			char caps = Character.toUpperCase(c);
			result=result+caps+sub+" ";
			
		}
		System.out.println(result);
	}

}
