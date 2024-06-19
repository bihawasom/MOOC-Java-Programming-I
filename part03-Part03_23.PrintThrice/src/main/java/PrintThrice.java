
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        //Get user input
        System.out.println("Give a word:");
        String input = scanner.nextLine();
        
        //Print 
        System.out.print(input+input+input);

    }
}
