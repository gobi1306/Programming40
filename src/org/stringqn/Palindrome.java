package org.stringqn;

public class Palindrome {
	public static void main(String[]args){
		String s="amma";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--){
		char c=s.charAt(i);
		reverse=reverse+c;
		}
		if(reverse.equals(s)){
		System.out.println("The Given String is Palindrome");
		}
		else{
		System.out.println("The Given String is  Not Palindrome");
		}
		}

}
