// Demonstrating super(), constructor chaining & runtime polymorphism

class Vehicle {
    String brand;
    int wheels;

    Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
        System.out.println("🚗 Vehicle constructor called");
    }

    void start() {
        System.out.println(brand + " vehicle is starting...");
    }
}

class Car extends Vehicle {
    int airbags;

    Car(String brand, int wheels, int airbags) {
        super(brand, wheels); // calls parent constructor
        this.airbags = airbags;
        System.out.println("🚘 Car constructor called");
    }

    @Override
    void start() {
        super.start();
        System.out.println(brand + " car with " + airbags + " airbags is running smoothly!");
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String brand, int wheels, int airbags, int batteryCapacity) {
        super(brand, wheels, airbags);
        this.batteryCapacity = batteryCapacity;
        System.out.println("⚡ ElectricCar constructor called");
    }

    @Override
    void start() {
        super.start();
        System.out.println(brand + "electric car is starting silently with battery: " + batteryCapacity + " kWh 🔋");
    }
}

public class SuperPolymorphismDemo {
    public static void main(String[] args) {
        Vehicle v = new ElectricCar(" Tesla", 4, 6, 100); // runtime polymorphism
        v.start();
    }
}