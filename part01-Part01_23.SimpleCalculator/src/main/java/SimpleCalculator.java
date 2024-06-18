
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        //First num
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        
        //Sec num
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        //Answers
        int add = first + second;
        int sub = first - second;
        int mult = first * second;
        double div = (double) first / second;
        
        System.out.println(first + " + " + second + " = " + add);
        System.out.println(first + " - " + second + " = " + sub);
        System.out.println(first + " * " + second + " = " + mult);
        System.out.println(first + " / " + second + " = " + div);
    }
}
