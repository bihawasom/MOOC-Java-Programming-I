
import java.util.Scanner;

public class MultiplicationFormula {

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
        int answer = first * second;
        System.out.println(first + " * " + second + " = " + answer);
    }
}
