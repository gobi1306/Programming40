package org.premstring;

public class VowelsAndConsonants {

	public static void main(String[] args) {

		String s = "all the best";
		String s1 = s.replace(" ", "");
		String vow ="";
		int vowcount=0;
		String cons ="";
		int conscount=0;
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				
				vow =vow+c;
				vowcount++;
				
			}
			else {
				cons =cons+c;
				conscount++;
			}
		}
		System.out.println("vowels are :"+vow);
		System.out.println("vowels count :"+vowcount);
		System.out.println("cons are :"+cons);
		System.out.println("conscount :"+conscount);
	}
	

}
