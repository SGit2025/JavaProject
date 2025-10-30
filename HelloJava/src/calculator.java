public class calculator {
    //Method Overloading Example

    //Method 1:adds two numbers
    int add(int a, int b){
        return a + b;
    }

    //Method 2:adds three numbers
    int add(int x, int y, int z){
        return x + y + z;
    }

    //Method 3:adds two doubles
    double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args){
        calculator calc = new calculator();

        System.out.println("Sum of 2 integers: " + calc.add(5,10));
        System.out.println("Sum of 3 integers: " + calc.add(10,5,34));
        System.out.println("Sum of two double: " + calc.add(12.5,23.76));
    }
}
