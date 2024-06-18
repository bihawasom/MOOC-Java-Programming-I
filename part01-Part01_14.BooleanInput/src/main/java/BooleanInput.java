
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        //Question
        System.out.println("Write something:");
        
        //Take bool
        boolean bool = Boolean.valueOf(scanner.nextLine());
        
        //T or F?
        System.out.println("True or false? " + bool);
    }
}
