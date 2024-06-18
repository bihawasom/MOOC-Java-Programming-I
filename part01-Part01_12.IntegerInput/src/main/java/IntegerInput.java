
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        //Ask for a value
        System.out.println("Give a number:");
        
        //Recieve value
        int num = Integer.valueOf(scanner.nextLine());
        
        //Response
        System.out.println("You gave the number " + num);
    }
}
