
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Ask value of gift
        System.out.println("Value of the gift?");
        
        //Take input
        int gift = Integer.valueOf(scan.nextLine());
        
        //Tax
        double tax = 0;
                
        //Do the calculation
        if(gift < 5000){
            tax = 0;
        }else if(gift >= 5000 && gift < 25000){
            tax = 100 + (gift-5000)*0.08;
        }else if(gift >= 25000 && gift < 55000){
            tax = (double)1700 + (gift-25000)*0.10;
        }else if(gift >= 55000 && gift < 200000){
            tax = (4700 + (gift-55000)*0.12);
        }else if(gift >= 200000 && gift < 1000000){
            tax = (22100 + (gift-200000)*0.15);
        }else{
            tax = (142100 + (gift-1000000)*0.17);
        }
        
        //Output the tax
        if(tax == 0){
            System.out.println("No tax!");
        }else{
            System.out.println("Tax: " + tax);
        }
        

    }
}
