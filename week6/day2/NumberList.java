package week6.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberList {
	public static void main(String[] args) {
		List<String> num = new ArrayList<String>();
		
		num.add("10");
		num.add("11");
		num.add("09");
		num.add("07");
		num.add("27");
		num.add("77");
		num.add("17");
		num.add("01");
		
		//System.out.println(num);
		
		Collections.sort(num);
		System.out.println(num);
		
		Collections.reverse(num);
		System.out.println(num);
		
		for (int i = 0; i < num.size(); i++) {
			String str = num.get(i);
			System.out.println(str);
		}
		
	}

}
