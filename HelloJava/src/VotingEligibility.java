import java.util.Scanner;
public class VotingEligibility {
    //day3 practice examples
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("=== Voting Eligibility Check ===");

        System.out.print("Enter Your Age: ");
        int age= sc.nextInt();

        if(age < 0){
            System.out.println("Bro, Age can't be negative");
        }
        else if(age >= 18)
        {
            System.out.println("Bro, You are Eligible to Vote");
        }
        else{
            System.out.println("Bro, You have to wait until you turn 18");
        }
    }
}
