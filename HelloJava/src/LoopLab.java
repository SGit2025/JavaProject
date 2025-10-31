public class LoopLab {
    public static void main(String[] args) {

        System.out.println("=== For Loop ===");
        // Print numbers 1 to 5
        for(int i = 1; i <= 5; i++){
            System.out.println("Count: " + i);
        }

        System.out.println("\n=== While Loop ===");
        int n = 1;
        // Run until condition is true
        while (n <= 5){
            System.out.println("While Count: " + n);
            n++;
        }

        System.out.println("\n=== Do-While Loop ===");
        int m = 1;
        //Executes at least once
        do{
            System.out.println("Do-While Count: " + m);
            m++;
        }while (m <= 5);

        System.out.println("\n=== Break & Continue Demo ===");
        for (int i = 1; i <= 10; i++){
            if (i == 6) {
                System.out.println("Hit 6 → breaking out");
                break; // stops loop
            }
            if (i % 2 == 0) {
                System.out.println("Skipping even: " + i);
                continue; //skips even numbers
            }
            System.out.println("Odd number: " + i);
        }

        System.out.println("\n=== Enhanced For Loop (for-each) ===");
        String[] cars = {"BMW", "Audi", "Tata", "Mahindra"};
        for (String car : cars) {
            System.out.println("Car brand: " + car);
        }
    }
}