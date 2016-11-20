/**
 * 
 */
package com.mycompany.collections.array;

import java.util.Arrays;

/**
 * @author ilker
 *
 */
public class SortArray1 {
	private String[] students;
	
	public SortArray1() {
		students = new String[]{"john", "david", "james", "trump", "tiffany", "jessica"};
	}
	
	
	public String[] sortString() {
		System.out.println("BEFORE sorting:" + Arrays.toString(students));
		
		int i = 0;
		for (String student : students) {
//			System.out.println("student is:" + student);
		}
		
		Arrays.sort(students);
		System.out.println("AFTER sorting:" + Arrays.toString(students));
		
		i = 0;
		for (String student : students) {
			System.out.println("student is:" + student);
		}
		
		return null;
	}
}
