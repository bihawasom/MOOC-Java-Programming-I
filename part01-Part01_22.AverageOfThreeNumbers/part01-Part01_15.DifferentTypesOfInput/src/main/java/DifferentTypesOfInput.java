
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        //Give a string, int, double, bool
        System.out.println("Give a string:");
        String string = scan.nextLine();
        
        System.out.println("Give an integer:");
        int numInt = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double numDouble = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean bool = Boolean.valueOf(scan.nextLine());
        
        //Output
        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + numInt);
        System.out.println("You gave the double " + numDouble);
        System.out.println("You gave the boolean " + bool);
        
    }
}
