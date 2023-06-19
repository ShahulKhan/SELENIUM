package week6.day2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

public static void main(String[] args) {
	
	int[] num = {1,2,3,4,5,6,6,7,2,4};
	
	Set<Integer> val = new LinkedHashSet<Integer>();
	
	for (int i = 0; i < num.length; i++) {
		//number.add(num[i]);
		if(!val.add(num[i])) {
			System.out.println(num[i]);
		}
	}
	
//	System.out.println(number);
	for (Integer integer : val) {
		System.out.println(integer);
	}
	
	List<Integer> number = new ArrayList<Integer>(val);
	
	Integer min = Collections.min(val);
	System.out.println("min = " + min);
//	System.out.println("Minmum Value = " + number.get(0);
	
	Integer max = Collections.max(number);
	System.out.println("max = " + max);
	System.out.println("Maximum Value = " + number.get(number.size()));
	
}

}
