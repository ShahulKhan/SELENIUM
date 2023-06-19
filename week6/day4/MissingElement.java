package week6.day4;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class MissingElement {

public static void main(String[] args) {
	
	int[] num = {1,2,3,4,5,7,2,5,8,9};
	
	// Missing element = 6
	
	Set<Integer> unique = new TreeSet<Integer> ();
	
	// Iterate the values from starting number and verify the 
		for (int i = 0; i < num.length; i++) {
			
			// Add the values in set
			unique.add(num[i]);
		}
		
		// Print the numbers without duplicate in ascending order
		System.out.println(unique);
		
		List<Integer> ele = new ArrayList <Integer> (unique);
		
}
}
