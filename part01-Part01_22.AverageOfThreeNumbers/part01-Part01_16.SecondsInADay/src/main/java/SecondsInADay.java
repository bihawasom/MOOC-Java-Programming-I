
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        //Get days
        int days = Integer.valueOf(scanner.nextLine());
        //Calculate
        int secs = days * 86400;
        
        System.out.println(secs);
        
    }
}
