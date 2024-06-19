
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Get user
        System.out.println("Enter username:");
        String user = scanner.nextLine();
        
        //Get password
        System.out.println("Enter password:");
        String attempt = scanner.nextLine();
        
        //Check user and password
        if((user.equals("alex") && attempt.equals("sunshine")) || (user.equals("emma") && attempt.equals("haskell"))){
            System.out.println("You have successfully logged in!");
        } else{
            System.out.println("Incorrect username or password!");
        }
        
    }
}
