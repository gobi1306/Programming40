package org.premstring;

public class SwapStrinngWithoutThirdVarriable {

	public static void main(String[] args) {

		String s1="chennai";
		String s2="bangalore";
		s1=s1+s2;//chennaibangalore
		s2=s1.substring(0, s1.length()-s2.length());//0,chennaibangalore-bangalore=chennai
		s1=s1.substring(s2.length());//chennaibangalore//bangalore
		System.out.println(s1);
		System.out.println(s2);
				
	}

}
