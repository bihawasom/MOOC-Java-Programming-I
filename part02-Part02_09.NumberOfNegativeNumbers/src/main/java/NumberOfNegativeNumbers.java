
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //iter = number of iterations
        int iter = 0;
        while(true){
            //Ask for number
            System.out.println("Give a number:");
            
            //Take input
            int num = Integer.valueOf(scanner.nextLine());
            
            //If neg -> count iter
            //If 0 -> quit
            if(num < 0){
                iter++;
            }else if(num == 0){
                break;
            }
        }
        
        System.out.println("Number of negative numbers: " + iter);
    }
}
