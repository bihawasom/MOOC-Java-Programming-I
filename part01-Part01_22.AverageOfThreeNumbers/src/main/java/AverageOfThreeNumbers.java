
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        //First num
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        
        //Sec num
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        //Third num
        System.out.println("Give the third number:");
        int third = Integer.valueOf(scanner.nextLine());
        
        //Result
        double numerator = (double)first + second + third;
        double answer = numerator / 3;
        System.out.println("The average is "+ answer);
    }
}