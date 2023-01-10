package org.premstring;

public class CapAndSmallCount {

	public static void main(String[] args) {

		String s = "GreensTechTask546@gmail.com";
		String caps = "";
		int capscount=0;
		String sml ="";
		int smlcount=0;
		String digit ="";
		int digitcount=0;
		String spl ="";
		int splcount=0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int x =c;
			//System.out.println(x);
			if (x>=65&&x<=90) {
				caps = caps+c;
				capscount++;
			}
			else if (x>=97&&x<=122) {
				sml=sml+c;
				smlcount++;
			}
			else if (x>=48&&x<=57) {
				digit = digit+c;
				digitcount++;
			}
			else {
				spl=spl+c;
				splcount++;
			}	
		}
		System.out.println("capsletter :"+caps);
		System.out.println("capscount :"+capscount);
		System.out.println("smallletter :"+sml);
		System.out.println("smallscount :"+smlcount);
		System.out.println("digits :"+digit);
		System.out.println("digitcount :"+digitcount);
		System.out.println("splletter :"+spl);
		System.out.println("splcount :"+splcount);
	}

}
