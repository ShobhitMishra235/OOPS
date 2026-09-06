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
public class ImplementationOfArrayListUsingGenericClass {
    public static void main(String[] args) {

        ExampleGenerics<Integer> obj = new ExampleGenerics<>();

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

Type	Kind	Default value
int	primitive	0
Integer	class/reference	null
Object	class/reference	null 

*/