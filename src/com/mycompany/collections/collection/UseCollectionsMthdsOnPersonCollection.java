/**
 * 
 */
package com.mycompany.collections.collection;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.mycompany.collections.model.Person;

/**
 * @author ilker
 *
 */
public class UseCollectionsMthdsOnPersonCollection extends SortPerson1 {
	
	public List<Person> shufflePersons() {
		persons = new ArrayList<Person>(personsOrig);
		System.out.println("BEFORE shuffling:" + persons);

		Collections.shuffle(persons);
		System.out.println("AFTER shuffling:" + persons);

		return persons;
	}
	
	public List<Person> swap0thAndLastElementsInPersons() {
		persons = new ArrayList<Person>(personsOrig);	// make sure we make a deep copy of original collection
		System.out.println("BEFORE swapping:" + persons);

		int lastElementIndex = persons.size() - 1;
		Collections.swap(persons, 0 , lastElementIndex);
		System.out.println("AFTER  swapping:" + persons);

		return persons;
	}

	public List<Person> rotateBy1ElementsInPersons() {
		persons = new ArrayList<Person>(personsOrig);	// make sure we make a deep copy of original collection
		System.out.println("BEFORE rotating:" + persons);

		Collections.rotate(persons, 1);
		System.out.println("AFTER  rotating:" + persons);

		return persons;
	}

	public List<Person> reverseElementsInPersons() {
		persons = new ArrayList<Person>(personsOrig);	// make sure we make a deep copy of original collection
		System.out.println("BEFORE reversing:" + persons);

		Collections.reverse(persons);
		System.out.println("AFTER  reversing:" + persons);

		return persons;
	}

	public List<Person> copyPersons() {
//		List<Person> copyPersons = new ArrayList<Person>(personsOrig);
		// make sure we make a deep copy of original collection then sort it
		// NOTE the "target" collection of copy has to be equal or greater size than "src" of copy
		List<Person> copyPersons = new ArrayList<Person>(personsOrig.size());	// NOTE this is still an empty List with initial capacity of personsOrig size
		// unfortunately there isn't a clone or factory method in Collections. So have to create "target" collection with some garbage
		Person p;
		for (int i = 0; i < personsOrig.size(); i++) {
			p = new Person("", 0);
			copyPersons.add(p);
		}
		Collections.copy(copyPersons, personsOrig);
		System.out.println("persons     copy:" + copyPersons);

		Collections.sort(copyPersons);
		System.out.println("Sorted      copy:" + copyPersons);

		System.out.println("Original persons:" + personsOrig);
		return copyPersons;
	}

	public Person maxPersonInPersonsBasedOnNaturalOrder() {
		persons = new ArrayList<Person>(personsOrig);	// make sure we make a deep copy of original collection
		System.out.println("original persons:" + persons);
		Collections.sort(persons);
		System.out.println("sorted   persons:" + persons);

		Person maxPerson = Collections.max(persons);
		System.out.println("MAX (based on natural order) person:" + maxPerson);

		return maxPerson;
	}
	
	public Person minPersonInPersonsBasedOnNaturalOrder() {
		persons = new ArrayList<Person>(personsOrig);	// make sure we make a deep copy of original collection
		System.out.println("original persons:" + persons);
		Collections.sort(persons);
		System.out.println("sorted   persons:" + persons);

		Person minPerson = Collections.min(persons);
		System.out.println("MIN (based on natural order) person:" + minPerson);

		return minPerson;
	}
	
	public List<Person> fill2replaceAllElementsOfPersons() {
		persons = new ArrayList<Person>(personsOrig);	// make sure we make a deep copy of original collection
		System.out.println("original persons:" + persons);

		Person replaceAllElementsWithMe = new Person("ilker", 18);
		Collections.fill(persons, replaceAllElementsWithMe);
		System.out.println("filled   persons:" + persons);

		return persons;
	}
	
	public void binarySearchWithNaturalOrderedPersons() {
		persons = new ArrayList<Person>(personsOrig);	// make sure we make a deep copy of original collection
		System.out.println("original persons:" + persons);

		Person personToSearch = persons.get(3);
		
		Collections.sort(persons);	// NOTE have to sort before doing binarySearch
		System.out.println("sorted persons:" + persons);
		int indexOfFoundPerson = Collections.binarySearch(persons, personToSearch);
		System.out.println("personToSearch:" + personToSearch + ", indexOfFoundPerson:" + indexOfFoundPerson);
	}

}
