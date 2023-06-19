package week6.day2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LearnList {
	
public static void main(String[] args) {
	
	// Method 1
		List<String> name = new ArrayList<String>();
		
		name.add("Eeshwa");
		name.add("Shahul");
		name.add("Vasanth");
		name.add("Revanth");
		name.add("Kumaran");
		name.add("Kabilan");
		name.add("Shahul");
		name.add("Jeeva");
		
		System.out.println(name);
		
		Collections.sort(name);
		System.out.println(name);
		
		Collections.reverse(name);
		System.out.println(name);
		
		name.remove("Hameed");
		System.out.println(name);
		
		boolean contains = name.contains("Shahul");
		System.out.println("contains = " + contains);
		
	
	// Method 2
		
		List<String> name1 = new LinkedList<String>();
		
}

}
