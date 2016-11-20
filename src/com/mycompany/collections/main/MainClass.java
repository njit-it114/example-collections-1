package com.mycompany.collections.main;
/**
 * 
 */

import com.mycompany.collections.array.SortArray1;
import com.mycompany.collections.collection.UseCollectionsMthdsOnPersonCollection;
import com.mycompany.collections.collection.SortCollection1;
import com.mycompany.collections.collection.SortPerson1;

/**
 * @author ilker
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// sorting an array
//		SortArray1 sa1 = new SortArray1();
//		sa1.sortString();
		
		// sorting a Collection of elements of Java object (like String)
//		SortCollection1 sc1 = new SortCollection1();
//		sc1.sortList1();

		// sorting a Collection of elements of our class (like Person)
//		SortPerson1 sp1 = new SortPerson1();
//		sp1.sortPerson1();			// this sorts in "Natural Order", which is determined by compareTo method of Person, which uses Person.name to compare
//		sp1.sortPersonInReverseOfNaturalOrder();
//		sp1.sortPersonBasedOnAge();	// this sorts using a Comparator, which compare based on Person.age
//		sp1.sortPersonBasedOnReverseAge();
		
		UseCollectionsMthdsOnPersonCollection pc1 = new UseCollectionsMthdsOnPersonCollection();
		// shuffling via Collections.shuffle
//		pc1.shufflePersons();
		// swap 0th and last element of persons collection
//		pc1.swap0thAndLastElementsInPersons();
		// rotate (move) elements of persons collection by 1 index. Upon rotating 1, the last element will be 1st and rest will move by 1
//		pc1.rotateBy1ElementsInPersons();
		// reverse order of elements in persons collection
//		pc1.reverseElementsInPersons();
		// copy persons to a new collection
//		pc1.copyPersons();
		// MAX (based on natural order) person in persons collections
//		pc1.maxPersonInPersonsBasedOnNaturalOrder();
		// MIN (based on natural order) person in persons collections
//		pc1.minPersonInPersonsBasedOnNaturalOrder();
		// replace (fill) all elements of persons with one Person
//		pc1.fill2replaceAllElementsOfPersons();
		// binarySearch in persons
		pc1.binarySearchWithNaturalOrderedPersons();
	}

}
