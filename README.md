# example-collections-1
Example Java project created via STS as Java Project, showing how to;
- initialize an array (SortArray1) of a primitive Class (String), 
- sort using Arrays.sort an array (SortArray1.sortString),
- create a Collection(List<String>) from an array(String[]) via Arrays.asList (SortCollection1), 
- sort a Collection(List<String>) in "Natural Order" of String via Collections.sort (SortCollection1.sortList1), 
- to use Collections.sort or to add to a ordered or sorted collection implementation, the element's Class needs to implement Comparable<T> interface (Person, SortPerson1),
- "Natural Order" of a class is determined by how its compareTo(T other) method is doing comparison
- sort in "Natural Order" via Collections.sort (SortPerson1.sortPerson1),
- sort in reverse of "Natural Order" by using Comparator<T> returned by Collections.reverseOrder() in Collections.sort (SortPerson1.sortPersonInReverseOfNaturalOrder)m,
- implement Comparator<Person> and use that in Collections.sort in using another order other than "Natural Order" to sort (SortPerson1.sortPersonBasedOnAge),
- use Collections.reverseOrder() to reverse order specified by a Comparator<Person> (SortPerson1.sortPersonBasedOnReverseAge),
- use Collections.shuffle to shuffle a collection (UseCollectionsMthdsOnPersonCollection.shufflePersons),
- use Collections.swap to swap 2 elements of a collection (UseCollectionsMthdsOnPersonCollection.swap0thAndLastElementsInPersons),
- use Collections.rotate to rotate elements of a collection like playing musical chairs around (UseCollectionsMthdsOnPersonCollection.rotateBy1ElementsInPersons),
- use Collections.reverse to reverse a collection (UseCollectionsMthdsOnPersonCollection.reverseElementsInPersons),
- use Collections.copy to copy elements of a source collection to a target collection of equal or greater size (UseCollectionsMthdsOnPersonCollection.copyPersons),
- use Collections.max to max element of a collection based on "Natural Order" (UseCollectionsMthdsOnPersonCollection.maxPersonInPersonsBasedOnNaturalOrder),
- use Collections.min to min element of a collection based on "Natural Order" (UseCollectionsMthdsOnPersonCollection.minPersonInPersonsBasedOnNaturalOrder),
- use Collections.fill to replace(fill) all elements of a collection (UseCollectionsMthdsOnPersonCollection.fill2replaceAllElementsOfPersons),
- use Collections.binarySearch to search a sorted collection for a particular element (UseCollectionsMthdsOnPersonCollection.binarySearchWithNaturalOrderedPersons)

## Setup dependencies
Make sure on your machine, you have;
- git installed
- a working unix shell (like git bash. If not there install git and use its "git bash")
- working JDK installed (with JAVA_HOME env variable added, and PATH env variable prefixed with %JAVA_HOME%/bin)

## How to use it  (NOTE in below the directory structure and names are suggested)
### Make sure you created the directory structure you want to store example projects in
As example, at bash command line issue;<br>
mkdir -p /c/it114/exampleProjects

### get(clone) the project from github
cd to where you put your example projects.<br>
As example, at bash command line issue;<br>
cd /c/it114/exampleProjects ) <br>
git clone https://github.com/njit-it114/example-collections-1.git <br>
or<br>
git clone https://github.com/njit-it114/example-collections-1.git  whateverDirectoryNameYouWantStuffToBeClonedInto

## Project directory structure
- README.md this read me file
- src directory of java packages
- design directory of design documents, like class diagram
