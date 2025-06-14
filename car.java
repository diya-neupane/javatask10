// Base class
class Vehicle {
    public void startEngine() {
        System.out.println("Engine started.");
    }

    public void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

// Derived class: Car
class Car extends Vehicle {
    public void drive() {
        System.out.println("Driving the car.");
    }
}

// Derived class: Motorcycle
class Motorcycle extends Vehicle {
    public void ride() {
        System.out.println("Riding the motorcycle.");
    }
}

// Main class to demonstrate hierarchical inheritance
public class car {
    public static void main(String[] args) {
        // Create Car object
        Car myCar = new Car();
        System.out.println("Car Actions:");
        myCar.startEngine();
        myCar.drive();
        myCar.stopEngine();

        System.out.println();

        // Create Motorcycle object
        Motorcycle myMotorcycle = new Motorcycle();
        System.out.println("Motorcycle Actions:");
        myMotorcycle.startEngine();
        myMotorcycle.ride();
        myMotorcycle.stopEngine();
    }
}

