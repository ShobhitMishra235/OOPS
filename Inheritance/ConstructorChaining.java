class Animal {

    Animal(int a) {
        System.out.println("Animal constructor " + a);
    }

    void sound() {
        System.out.println("Animal sound");
    }

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {

    Dog() {
        super(5);
        System.out.println("Dog constructor");
    }

    void sound() {
        super.eat();
        System.out.println("Dog barks");
        super.sound();
    }
}
public class ConstructorChaining {
     public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
    }
}
/*

"Before I initialize my Dog part, initialize my Animal part."

That's the main reason super(5) must come first.






So your mental rule should be:

super is used inside a constructor/method (or another executable context) when you want to access something from the superclass.

And one extra important rule:

super(...) must be the first statement of a constructor.

But super.sound() doesn't have to be first:
*/