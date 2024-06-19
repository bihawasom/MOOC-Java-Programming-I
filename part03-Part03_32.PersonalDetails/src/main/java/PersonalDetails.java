
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = "";
        int nameLength = 0;
        int sumOfYear = 0;
        int iter = 0;
        
        while(true){
            //Take input
            String input = scanner.nextLine();
            
            //Exit if nothing
            if(input.isBlank()){
                break;
            }
            
            //Split name, year
            String[] nameYear = input.split(",");
            
            //Look for longest name
            for(int i=0; i<nameYear.length; i++){
                if(i%2 == 0){
                    if(nameLength < nameYear[i].length()){
                        nameLength = nameYear[i].length();
                        name = nameYear[i];
                    }
                }
            }
            
            //Sum the years
            for(int j=0; j<nameYear.length; j++){
                if(j%2 != 0){
                    sumOfYear += Integer.valueOf(nameYear[j]);
                    iter++;
                }
            }
            
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (double)sumOfYear/iter);
    }
}
