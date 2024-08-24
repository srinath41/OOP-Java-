/**
 * PolymorphismExample
 * 
 * This program demonstrates polymorphism in Java.
 */
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square");
    }
}

public class Polymorphism{

    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Square();

        shape1.draw(); // Output: Drawing a circle
        shape2.draw(); // Output: Drawing a square
    }
}
