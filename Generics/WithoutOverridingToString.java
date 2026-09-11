package Generics;

import java.util.*;

class Dog1 {
    String name;
    int age;

    Dog1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class WithoutOverridingToString {

    static void fun(List<?> values) {

        Object obj = values.get(0);

        System.out.println(obj);
    }

    public static void main(String[] args) {

        List<Dog1> dogs = new ArrayList<>();

        dogs.add(new Dog1("Tommy", 3));

        fun(dogs);
    }
}

