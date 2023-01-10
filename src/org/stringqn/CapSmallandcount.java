package org.stringqn;

public class CapSmallandcount {

	public static void main(String[] args) {
	String s="Gobi@13061994@gmail.CoM";
	String cap="";
	int capcount=0;
	String small="";
	int smallcount=0;
	String num="";
	int numcount=0;
	String spl="";
	int splcount = 0;
	
	for (int i = 0; i <s.length(); i++) {
		char c = s.charAt(i);
		if (c>='A'&&c<='Z') {
			cap=cap+c;
			capcount++;
		}else if (c>='a'&&c<='z') {
			small=small+c;
			smallcount++;
		}else if (c>='0'&&c<='9') {
			num=num+c;
			numcount++;
		}else {
			spl=spl+c;
			splcount++;
		}	
	}
	System.out.println(cap);
	System.out.println(capcount);
	System.out.println(small);
	System.out.println(smallcount);
	System.out.println(spl);
	System.out.println(splcount);

	}

}
