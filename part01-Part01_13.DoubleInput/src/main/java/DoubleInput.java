
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        //Ask for number
        System.out.println("Give a number:");
        
        //Get number
        double num = Double.valueOf(scanner.nextLine());
        
        //Response
        System.out.println("You gave the number " + num);
    }
}
