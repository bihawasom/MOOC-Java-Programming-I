
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            //Take user input
            String input = scanner.nextLine();
            
            //Split string
            String[] pieces = input.split(" ");
            
            //Search for av
            for(String word: pieces){
                if(word.contains("av")){
                    System.out.println(word);
                }
            }
            if(input.isBlank()){
                break;
            }
        }

    }
}
