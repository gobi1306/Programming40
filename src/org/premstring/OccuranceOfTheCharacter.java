package org.premstring;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfTheCharacter {

	public static void main(String[] args) {
                 // 0123456789  
		String s = "jayaetjyjycutiees";
		Map<Character, Integer> mp = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {//i=0,0<1 T,i=1,1<10
			char c = s.charAt(i);//0=a,1=u
			if (mp.containsKey(c)) {//mp contains any of value means then it ll come to if block otherwise it ll go to else block and store the value in map...
				Integer count = mp.get(c);
				mp.put(c, count+1);
				
			}
			else {
				mp.put(c, 1);
			}
			
		}
		System.out.println(mp);
	}

}
