package org.stringqn;

public class FirstLetterCap {
	public static void main(String[] args) {
		String s="welcome to java class";
		String[] sp = s.split(" ");
		String result="";
		for (int i = 0; i < sp.length; i++) {
			String s1=sp[i];
			char ch = s1.charAt(0);
			String sub = s1.substring(1);
			char cap = Character.toUpperCase(ch);
			result=result+cap+sub+" ";
			
		}
		System.out.println(result);
	}

}
