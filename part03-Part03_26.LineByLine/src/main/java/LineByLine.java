
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            //Takes string from user
            String input = scanner.nextLine();

            //Split the string
            String[] pieces = input.split(" ");
            
            for(String word: pieces){
                System.out.println(word);
            }
            if(input.isBlank()){
                break;
            }
        }
    }
}
