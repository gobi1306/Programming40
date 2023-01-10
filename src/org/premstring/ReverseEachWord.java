package org.premstring;

public class ReverseEachWord {

	public static void main(String[] args) {

		String s ="welcome to java class"; //{welcome,to,java,class}
		String[]sp=s.split(" ");
		String result ="";
		for(int i=0;i<sp.length;i++){
		String s1=sp[i];
		String reverse ="";
		for(int j=s1.length()-1;j>=0;j--){
		 char c =s1.charAt(j);
		 reverse=reverse+c;
		}
		result =result+reverse+" ";
		}
		System.out.println(result);
		}
	}


