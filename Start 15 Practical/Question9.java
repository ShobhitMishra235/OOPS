/*

WAP to create a class named Shape and create three subclasses Circle, 
Triangle and Square, each class has two-member functions named 
draw () and erase (). Implement this concept using polymorphism.

*/
class Shape {

    void draw() {
        System.out.println("Drawing Shape");
    }

    void erase() {
        System.out.println("Erasing Shape");
    }
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    void erase() {
        System.out.println("Erasing Circle");
    }
}

class Triangle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    void erase() {
        System.out.println("Erasing Triangle");
    }
}

class Square extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    void erase() {
        System.out.println("Erasing Square");
    }
}

public class Question9 {

    public static void main(String[] args) {

        // Runtime Polymorphism
        Shape s;

        s = new Circle();
        s.draw();
        s.erase();

        s = new Triangle();
        s.draw();
        s.erase();

        s = new Square();
        s.draw();
        s.erase();
    }
}


