
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        //Take in string
        String message = scanner.nextLine();
        
        //Prints out 3 times
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
    }
}
