//Demonstrating Classes & Objects in Java
//Blueprint: Car with properties & behaviors
//Created by Sanika - Week 3 OOP kickoff

class Cars{
    //Instance Variable - each car has its own copy
    String brand;
    String color;
    int speed;

    void start() {
        System.out.println(brand + " is starting... ");
    }

    void accelerate(int increase){
        speed += increase;
        System.out.println(brand + " in now going at " + speed + " km/h ");
    }

    void brake() {
        System.out.println(brand + " is slowing down... ");
        speed = 0;
    }
    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " +speed + " km/h\n");
    }
}

public class CarBlueprint {
    public static void main(String[] args) {
        Cars car1 = new Cars();
        car1.brand = "Tesla";
        car1.color = "Red";
        car1.speed = 0;

        Cars car2 = new Cars();
        car2.brand = "BMW";
        car2.color = "Black";
        car2.speed = 0;

        car1.start();
        car1.accelerate(90);
        car1.showDetails();

        car2.start();
        car2.accelerate(150);
        car2.brake();
        car2.showDetails();
    }
}
