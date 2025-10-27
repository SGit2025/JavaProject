import java.util.Scanner;
public class day3 {
    public static void main(String[] args)
    {
        //Day3
        Scanner sc = new Scanner(System.in);
        System.out.println("If else statement");
        System.out.print("Enter Your Age: ");
        int age= sc.nextInt();

        if(age >= 21) {
            System.out.println("Eligible for corporate chai meets ☕");
        }
        else {
            System.out.println("Still on juice box \uD83E\uDDC3, bro.");
        }
    }
}
