
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            //Take input
            String input = scanner.nextLine();
            
            //Seperate
            String[] pieces = input.split(" ");
            
            //Print last part
            System.out.println(pieces[pieces.length-1]);
            
            if(input.isBlank()){
                break;
            }
        }
    }
}
