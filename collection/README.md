## Notes

* All the concrete classes in the Java Collections Framework implement the java.lang. Cloneable and java.io.Serializable interfaces except that java.util.PriorityQueue does not implement the Cloneable interface. Thus, all instances of Cloneable except priority queues can be cloned and all instances of Cloneable can be serialized.

* Each collection is Iterable. You can obtain its Iterator object to traverse all the elements in the collection

* You can use ForEach loop to loop through a collection:
  ```java
  for (String element: collection)
      System.out.print(element.toUpperCase() + " ");
  ```
  This loop is read as “for each element in the collection, do the following.” The foreach loop can be used for arrays as well as any instance of Iterable.

* The List interface extends the Collection interface and defines a collection for storing elements in a sequential order. To create a list, use one of its two concrete classes: ArrayList or LinkedList.

* Comparator can be used to compare the objects of a class that doesn’t implement Comparable.

  * Comparable is used to compare the objects of the class that implement Comparable.
  * Comparator can be used to compare the objects of a class that doesn’t implement Comparable.
  * Comparing elements using the Comparable interface is referred to as comparing using natural order, and comparing elements using the Comparator interface is referred to as comparing using comparator



## Readings



## Problems
