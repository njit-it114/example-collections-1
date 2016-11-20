/**
 * 
 */
package com.mycompany.collections.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author ilker
 *
 */
public class SortCollection1 {
	
	private List<String> strings;
	public static final String[] STUDENTS_ARRAY = new String[]{"john", "david", "james", "trump", "tiffany", "jessica"};
	
	public SortCollection1() {
		strings = Arrays.asList(STUDENTS_ARRAY);
		// NOTE ilker above line is basically doing what could be done with our method below
//		strings = asList(STUDENTS_ARRAY);
	}
	
	/**
	 * Arrays.asList(strArray)  basically does what this method does
	 * @param strArray String[] array to create List<String> from
	 * @return List<String> created from strArray
	 */
	public List<String> asList(String[] strArray) {
		List<String> strs = new ArrayList<String>();
		
		for (String s : strArray) {
			strs.add(s);
		}
		
		return strs;
	}
	
	public List<String> sortList1() {
		System.out.println("BEFORE sorting:" + strings);

		Collections.sort(strings);
		System.out.println("AFTER sorting:" + strings);

		return strings;
	}
}
