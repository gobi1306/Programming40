package org.programming;

public class ReverseTheString {
	public static void main(String[]args){
		String s="welcome to java class";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--){
		        char c= s.charAt(i);
		        //System.out.print(c);
		}
		
		//another method
	    for (int i=s.length()-1;i>=0;i--) {
	    	char ch = s.charAt(i);
	    	
	    	 reverse=reverse+ch;
			
		}
	    System.out.println(reverse);
		}

}
