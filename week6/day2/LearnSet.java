package week6.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
public static void main(String[] args) {
	
	// Method 1
	// using HashSet
	// Random 
	
//	Set<String> name = new HashSet<String>();
	
	// Method 2 
	// using TreeSet
	// ASCII
	
	Set<String> name = new TreeSet<String>();
	
	// Method 3
	// using LinckedHashSet
//	Set<String> name = new LinkedHashSet<String>();
	
	
	boolean add = name.add("Kabilan");
	System.out.println(add);
	
	name.add("Mohammed");
	name.add("Chiranjeevi");
	name.add("Vasanth");
	name.add("Eeshawa");
	name.add("Kumaran");
	name.add("Jeeva");
	
	boolean add2 = name.add("Kabilan");
	System.out.println(add2);
	
	System.out.println(name);

	}

}
