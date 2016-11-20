/**
 * 
 */
package com.mycompany.collections.model;

import java.util.Comparator;
import java.util.Random;

/**
 * @author ilker
 *
 */
//public class Person {
// NOTE ilker when Person does not implement Comparable<T> like above line instead of below one, then;
//  1) it can not be added to a collection implementation that is auto sorted upon adding an element like SortedSet
//  2) a collection containing elements of Person can not be sorted via Collections.sort (like SortPerson1's methods do) or Arrays.sort (for array containing elements of Person)
public class Person implements Comparable<Person> {

	public static class PersonAgeComparator implements Comparator<Person> {

		@Override
		public int compare(Person left, Person right) {
			return left.getAge().compareTo(right.getAge());
		}	
	}
	
	private String name;
	private Integer age;
	
	public Person(String _name) {
		name = _name;
		
		// generate a random int value and assign to age
		Random generator = new Random();
		age = generator.nextInt(10);
	}
	
	public Person(String _name, int _age) {
		name = _name;
		age = _age;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}
	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{").append(name).append(",").append(age).append("}");
		return sb.toString();
	}

	@Override
	public int compareTo(Person p) {
		return name.compareTo(p.name);
	}
}
