/**
 * AbstractionExample
 * 
 * This program demonstrates abstraction in Java using abstract classes.
 */
abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car started");
    }
}

public class AbstractionExample {

    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start(); // Output: Car started
        car.stop();  // Output: Vehicle stopped
    }
}
