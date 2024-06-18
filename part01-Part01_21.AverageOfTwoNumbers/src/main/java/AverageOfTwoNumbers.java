
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        //First num
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        
        //Sec num
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        //Result
        double numerator = (double)first + second;
        double answer = numerator / 2;
        System.out.println("The average is "+ answer);
    }
}
