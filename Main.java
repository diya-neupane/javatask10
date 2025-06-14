// Superclass
class Vehicle {
    public void drive() {
        System.out.println("The vehicle is being driven.");
    }
}
class Car extends Vehicle {
    String brand;
    String model;
    int year;
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public void display() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2021);
        myCar.drive();     
        myCar.display();   
    }
}
