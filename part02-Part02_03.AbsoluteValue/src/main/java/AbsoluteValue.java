
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = Integer.valueOf(scanner.nextLine());
        
        if(num < 0){
            num *= -1;
        }else{
            num = Math.abs(num);
        }
        
        System.out.println(num);
    }
}
