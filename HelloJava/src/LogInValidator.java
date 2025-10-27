import java.util.Scanner;

public class LogInValidator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Log In Validator Check ===");

        System.out.print("Enter username : ");
        String username1 = sc.nextLine();

        System.out.print("Enter password : ");
        String password1 = sc.nextLine();

        String username = "admin";
        String password = "1234";

        //if(username1==username && password1==password){
            //System.out.println("Your username and password is matched successfully ");
        //} this is the mistake I made
        //if(username1.equals(username) && password1.equals(password)){
        //System.out.println("✅ Login Successful, Welcome Bro!");
        //} this is onw way another way is also there
        if(!username1.equals(username)) {
            System.out.println("❌ Incorrect Username");
        }
        else if(!password1.equals(password)) {
            System.out.println("❌ Incorrect Password");
        }
        else {
            System.out.println("✅ Login Successful, Welcome Bro!");
        }
    }
}
