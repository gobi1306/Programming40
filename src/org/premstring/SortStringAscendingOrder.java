package org.premstring;

public class SortStringAscendingOrder {

	public static void main(String[] args) {

		String s ="goodday";
		char[] a = s.toCharArray();
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					char temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				
					
				}
				
			}
			
		}
		for (char c : a) {
			System.out.println(c);
		}
	}

}
