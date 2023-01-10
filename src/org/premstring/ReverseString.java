package org.premstring;

public class ReverseString {

	public static void main(String[] args) {
        String s = "Welcome to java class";
                  //012345678901234567890
        for (int i =s.length()-1; i>=0 ; i--) {//i=19,19>=0
        	char c = s.charAt(i);
        	System.out.print(c);
			
		}
	}

}
