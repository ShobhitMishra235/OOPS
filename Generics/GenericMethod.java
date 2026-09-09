package Generics;

public class GenericMethod {

    public <T> T getValue(T value) {
        return value;
    }

    public static void main(String[] args) {

        GenericMethod d = new GenericMethod();

        String name = d.getValue("Shobhit");
        Integer age = d.getValue(20);
        Double marks = d.getValue(85.5);

        System.out.println(name);
        System.out.println(age);
        System.out.println(marks);
    }
}
/*

<T> T getValue(T value)
 ↑  ↑
 │  └── Return type may be void or any type
 └───── Declares T as a generic type
 
*/