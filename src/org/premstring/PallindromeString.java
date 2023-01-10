package org.premstring;

public class PallindromeString {

	public static void main(String[] args) {

		String s = "madam";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--){
		  char c = s.charAt(i);
		  reverse=reverse+c;
		}
		if(reverse.equals(s)){
		System.out.println("the given string is pallindrome");
		}
		else{
		System.out.println("the given string is not pallindrome");
		}
	}

}
