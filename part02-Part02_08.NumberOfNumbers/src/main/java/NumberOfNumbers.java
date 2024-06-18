
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int iter = 0;
        
        while(true){
            //Ask for a number
            System.out.println("Give a number:");
            
            //Take input
            int num = Integer.valueOf(scanner.nextLine());
            
            //If 0 -> quit
            //If !0 -> count iteration
            if(num == 0){
                break;
            }else{
                iter++;
            }
        }
        
        System.out.println("Number of numbers: " + iter);
    }
}
