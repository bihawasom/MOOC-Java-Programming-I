
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Read two integers
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        
        //Calculate sqrt
        double sqrt1 = Math.sqrt(first);
        double sqrt2 = Math.sqrt(second);
        
        //Sum the sqrts
        double answer = sqrt1 + sqrt2;
        
        //Print the answer
        System.out.println((int)answer);
    }
}
