
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        System.out.println("What's your name?");
        
        //Takes name
        String name = scanner.nextLine();
        
        //Print
        System.out.println("Hi " + name);
        
    }
}
