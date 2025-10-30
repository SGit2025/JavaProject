//Runtime polymorphism (Method Overriding)

class shape {
    void area(){
        System.out.println("Calculating area of a generic shape...");
    }
}

class Circle extends shape{
    @Override
    void area(){
        System.out.println("Area of Circle = π * r * r");
    }
}

class Rectangle extends shape{
    @Override
    void area(){
        System.out.println("Area of Rectangle = length * breadth ");
    }
}

class Triangle extends shape{
    @Override
    void area(){
        System.out.println("Area of Triangle = 0.5 * base * height");
    }
}

public class PolymorphismExample {
    public static void main(String[] args)
    {
        shape s;

        s = new Circle();
        s.area(); // calls circle's overridden method

        s = new Rectangle();
        s.area(); // calls Rectangle's overridden method

        s = new Triangle();
        s.area(); // calls Triangle's overridden method
    }
}
