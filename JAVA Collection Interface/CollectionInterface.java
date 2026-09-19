// Demonstrates the Java Collection interface.

import java.util.*;


public class CollectionInterface {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);
        int n = c.size();
        System.out.println(c.size());
        System.out.println(n);
        System.out.println(c.isEmpty());
        System.out.println(c.contains(2));
     // toArray() returns an array object.
     // Object[] obj = c.toArray();
     // for(Object o : obj) {
     // System.out.println(o);
     // } 
     // So this is generally not use another type of toArray(T[] a) is used.
     Integer[] arr2 = new Integer[0]; // If the supplied array is too small → a new array is created and returned. If it is large enough → the supplied array can be used.
     Integer[] arr = c.toArray(arr2);
     for(Integer i : arr) {
        System.out.println(i);
     }

/*

add(E)
  ↓
"I am ADDING an element"
  ↓
Must follow the collection's generic type

remove(Object)
  ↓
"I am LOOKING FOR something to remove"
  ↓
Can give any Object

*/

    boolean b  = c.add(3); // boolean add(E e)
    System.out.println(b);

// boolean remove(Object obj)

    System.out.println(c.remove("king kong"));
    System.out.println(c.remove(4));


// boolean addAll(collection<? extends E> c). ? extends = you cannot write INTO that collection. It does NOT mean you cannot use that collection as a source for writing somewhere else.
/*  

for (Object x : source) {   // READ from source
    c.add(x);                // WRITE into c
} 
    
*/
c.addAll(List.of(5, 6, 7, 8, 9));
System.out.println(c);

// boolean containsAll(Collection<?> c)
System.out.println(c.containsAll(List.of(1, 2, 3)));

// boolean removeAll(Collection<?> c)
c.removeAll(List.of(1, 2));
System.out.println(c);

// boolean retainAll(Collection<?> c)
c.retainAll(List.of(1, 2));
System.out.println(c);

c.clear();
System.out.println(c);
    }
}

// add, remove, addAll, removeAll, retainAll, contains, containsAll, toArray, iterator, size, isEmpty methods in collection interface.
// equals, hashcode methods present in object class so these are also present.