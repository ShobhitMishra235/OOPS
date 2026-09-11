package Generics;

import java.util.*;

class Dog {
    String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class OverridingToString {

    static void fun(List<?> values) {

        Object obj = values.get(0);

        System.out.println(obj);
    }

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("Tommy", 3));

        fun(dogs);
    }
}
/*

toString() — Quick Summary
toString() is a method of the Object class.
Every Java class gets it through inheritance.
It is used to give an object's String representation.
When you write:
System.out.println(obj);

Java automatically calls:

obj.toString();
If you don't override toString(), you usually get something like:
Dog@5acf9800
If you override it:
@Override
public String toString() {
    return "Name: " + name + ", Age: " + age;
}

you get meaningful data:

Name: Tommy, Age: 3
Main concept

Object class → toString() → overriding → runtime polymorphism

And remember:

toString() returns a String; println() prints that String.











Exactly — you didn't explicitly call toString(). Java calls it automatically in certain situations.

For example:

Dog d = new Dog();

System.out.println(d);

You wrote only:

System.out.println(d);

But println() has special handling for objects. Conceptually, Java does:

System.out.println(d.toString());

So the flow is:

You write:
System.out.println(d)
          ↓
println receives a Dog object
          ↓
println converts the object to String
          ↓
toString() is called
          ↓
String is printed
Why does Java do this?

Because println() needs something printable. An object isn't itself a String, so Java uses the object's toString() method to get its String representation.

For example:

class Dog {
    String name = "Tommy";

    @Override
    public String toString() {
        return name;
    }
}

Then:

Dog d = new Dog();
System.out.println(d);

Output:

Tommy

You didn't call:

d.toString()

println() effectively did it for you.

This is called implicit/automatic method invocation as part of object-to-string conversion.
*/