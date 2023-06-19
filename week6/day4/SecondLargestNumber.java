package week6.day4;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestNumber {

public static void main(String[] args) {
	
	// Here is the input
	int[] data = {3,2,11,4,6,7,2,3,3,6,7};
	
	// Output = 7
	
	// Declare a empty set
	Set<Integer> number = new TreeSet<Integer> ();
	
	// Iterate the values from data Array
	for (int i = 0; i < data.length; i++) {
		
		// Add the values in set
		number.add(data[i]);
	}
	
	// Print the numbers without duplicate in ascending order
	System.out.println(number);
	
	
	List<Integer> num = new ArrayList<Integer>(number);
	
	// Print the seecond largest number
	System.out.println(num.get(num.size()-2));
}

}
