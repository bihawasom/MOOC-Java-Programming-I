
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            //Read input
            String input = scanner.nextLine();
            
            //Split input
            String[] pieces = input.split(" ");
            
            //Print first part
            System.out.println(pieces[0]);
            
            if(input.isBlank()){
                break;
            }
        }


    }
}
