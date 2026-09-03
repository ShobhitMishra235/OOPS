package Inheritance;
class Parent {
    void display() {
        System.out.println("Parent");
    }
}
class Child extends Parent {
    void display() {
        System.out.println("Child");
    }
    void show() {
        System.out.println("Show");
    }
}
public class InheritancePractice1 {
    public static void main(String[] args) {
         Parent obj = new Child();
         obj.display();
    }
    // You cannot call obj.show() because show exist only in Child but reference type is Parent and Parent does not know about show.
}

// Remember this distinction can i call the method decided by reference type which overridden version run is decided by actual objects. 

/*  
This is also example of runtime polymorphism At compile time, Java knows:
obj is a Parent reference, and Parent has display(), so this call is valid.
But at runtime, Java sees:
The object stored in obj is actually a Child object.
Therefore it runs:
Child.display();
Output:
Child
Why is it called "runtime" polymorphism?
Because the decision of which overridden method to execute is made based on the actual object at runtime.
              Compile time
                   ↓
       Parent obj.display()
       "Is display() available?"
                   ↓
                  YES
                   ↓
              Runtime
                   ↓
       What object is actually there?
                   ↓
              Child object
                   ↓
          Child.display()
                   ↓
                Child
The important point:
Parent obj = new Child(); creates the situation for runtime polymorphism, but obj.display() demonstrates it, because the Child version is selected at runtime.
*/