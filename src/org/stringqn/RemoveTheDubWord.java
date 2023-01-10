package org.stringqn;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveTheDubWord {

	public static void main(String[] args) {
		String s = "java sql oracle python selenium java python";
		String[] split = s.split(" ");//{"java","sql","oracle","python","selenium","java","python"}
		Set<String> set= new LinkedHashSet<>();
	
		for (String s1 : split) {
			//System.out.println(s1);
			set.add(s1);
			
			
		}
		for (String string : set) {
			System.out.print(string+" ");
			
		}
	}

}
