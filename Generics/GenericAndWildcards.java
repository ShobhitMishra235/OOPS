package Generics;

import java.util.*;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class GenericAndWildcards {

    static <T> void printAnimal(List<? extends T> list) {

        T value = list.get(0);

        System.out.println(value);
    }

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog());

        printAnimal(dogs);
    }
}

