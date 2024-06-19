
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        
        while(true){
            //Take input
            String input = scanner.nextLine();
            
            //Exit if input is nothing
            if(input.isBlank()){
                break;
            }
            
            //Split ages
            String[] age = input.split(",");
            
            //Look for oldest
            for(int i=0; i<age.length; i++){
                if(i%2 != 0){
                    if(oldest < Integer.valueOf(age[i])){
                        oldest = Integer.valueOf(age[i]);
                    }
                }
            } 
        }
        
        //Print out oldest
        System.out.println("Age of the oldest: " + oldest);
        
    }
}
