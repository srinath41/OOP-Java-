/*
- Abstraction: Abstract class `Vehicle` with an abstract method `displayInfo()`.
- Inheritance: `Car` and `Bike` subclasses extending `Vehicle`.
- Polymorphism: Method overloading in the `Calculator` class.
- Encapsulation: Private fields with getters and setters in the `Vehicle` class.
*/


// Abstract class demonstrating Abstraction
abstract class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Getter and Setter for brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter and Setter for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayInfo();
}

// Car subclass demonstrating Inheritance and Method Overriding
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Year: " + getYear());
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Bike subclass demonstrating Inheritance and Method Overriding
class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String brand, int year, boolean hasCarrier) {
        super(brand, year);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Year: " + getYear());
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}

// Calculator class demonstrating Method Overloading
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Main class to test the concepts
public class OOPdemo {
    public static void main(String[] args) {
        // Test Abstraction, Inheritance, Encapsulation, and Method Overriding
        Vehicle myCar = new Car("Toyota", 2022, 4);
        Vehicle myBike = new Bike("Yamaha", 2021, true);

        System.out.println("Car Info:");
        myCar.displayInfo();
        System.out.println();

        System.out.println("Bike Info:");
        myBike.displayInfo();
        System.out.println();

        // Modify vehicle attributes using getters and setters
        ((Car) myCar).setBrand("Honda");
        ((Car) myCar).setYear(2023);

        System.out.println("Updated Car Info:");
        myCar.displayInfo();
        System.out.println();

        // Test Method Overloading
        Calculator calculator = new Calculator();
        System.out.println("Sum of 2 integers: " + calculator.add(5, 10));
        System.out.println("Sum of 3 integers: " + calculator.add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + calculator.add(5.5, 10.3));
    }
}
