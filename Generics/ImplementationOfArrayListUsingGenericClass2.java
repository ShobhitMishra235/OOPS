package Generics;
class ExampleGenerics<T> {
    private Object[] arr = new Object[5];
    private int size = 0;
    public void add(T val) {
        if (size == arr.length) {
            System.out.println("Array is full");
            return;
        }
        arr[size] = val;
        size++;
    }
    public void remove(int index) {
        if(index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }
        for(int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = null;
        size--;
    }
    public void display() {
    for(int i = 0; i < size; i++) {
        System.out.println(arr[i]);
    }
}
}
public class ImplementationOfArrayListUsingGenericClass2 {
    public <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        ExampleGenerics<Integer> obj = new ExampleGenerics<>();
        ImplementationOfArrayListUsingGenericClass2 example = new ImplementationOfArrayListUsingGenericClass2();
        example.printArray(arr);
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);

        System.out.println("Before remove:");
        obj.display();

        obj.remove(1);

        System.out.println("After remove:");
        obj.display();
    }
}

/* 

<T> = declares a generic type parameter
T = uses that already-declared type parameter
When you 


If a class is declared with <T>, then T becomes a type parameter of that class. Therefore, inside that class, you can directly use T as a type without writing <T> again.

Example:

class Box<T> {
    T value;          // use T
    void add(T x) {   // use T
        value = x;
    }
}

Here, <T> is written once with the class to declare T.

When the class is used:

Box<Integer> b = new Box<>();

T becomes Integer.

If the class is NOT generic

If the class does not have <T>:

class Box {
    T value;   // ❌
}

You cannot use T because it has not been declared.

You must declare it, for example:

class Box {
    <T> void add(T x) {
        // use T here
    }
}

Non-static → can use class's T
Static → cannot use class's T; declare its own <T>

*/