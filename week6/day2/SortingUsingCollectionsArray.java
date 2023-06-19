package week6.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollectionsArray {
	public static void main(String[] args) {
	
		String[] company = {"HCL","TCS","CTS","ZOHO","IBM"};
		
		List<String> companyList = new ArrayList<String>();
		
//		int size = ;
//		System.out.println(size);
		
//		System.out.println(companyList);
		
		companyList.add("AWS");
		System.out.println(companyList);
		
		Collections.sort(companyList);
		System.out.println(companyList);
		
//		companyList.remove(3);
//		System.out.println(companyList);
//		
//		companyList.clear();
//		System.out.println(companyList);
//		boolean 
		
		Collections.reverse(companyList);
		System.out.println(companyList);

		for (int i = 0; i < company.length; i++) {
			companyList.add(company[i]);
			System.out.println(company[i]);
		}
	}

}
