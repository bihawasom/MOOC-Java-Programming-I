
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        //Ask for first number
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        
        //Ask for second number
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        //Ask for third number
        System.out.println("Give the third number:");
        int third = Integer.valueOf(scanner.nextLine());
        
        //Give sum of three numbers
        System.out.println("The sum of the numbers is " + (first + second + third));
    }
}
