package Array;

import java.util.Set;
import java.util.TreeSet;

public class dublicateAndSortArray {

	public static void main(String[] args) {

		int a[]= {10,20,30,40,50,50,10,60,90,20};
		Set<Integer>s1=new TreeSet<>();
	for (int i = 0; i < a.length; i++) {
		int v = a[i];
		s1.add(v);
		
	}
	System.out.println(s1);
		}
}
