package week6.day2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Companies {
	public static void main(String[] args) {
		List<String> comp = new ArrayList<String>();
		
		comp.add("HCL");
		comp.add("Wipro");
		comp.add("Aspirr systems");
		comp.add("CTS");
		comp.add("TCS");
		
		Collections.sort(comp);
		System.out.println(comp);
		
		Collections.reverse(comp);
		System.out.println(comp);
		
		for (int i = 0; i < comp.size(); i++) {
			String ord = comp.get(i);
			System.out.println(ord);
			
		}
	}

}
