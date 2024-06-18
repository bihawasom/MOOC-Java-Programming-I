
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int sum = 0;
        int iter = 0;
        double avg = 0;

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            } else if(num > 0){
                sum += num;
                iter++;
                continue;
            } else{
                continue;
            }
        }
        
        avg = (double)sum/iter;
        
        if(avg == 0 || Double.isNaN(avg)){
            System.out.println("Cannot calculate the average");
        } else{
            System.out.println(avg);
        }
        
    }
}
