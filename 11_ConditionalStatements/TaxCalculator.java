import java.util.*;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int Tax;
        sc.close();
        
        if(income < 500000){
            Tax = 0;
        } else if(income >= 500000 && income < 1000000){
            Tax = (int)(income * 0.2);  
        } else {
            Tax = (int)(income * 0.3);
        }
        
        System.out.println("Your Tax is: "+ Tax);
    }
}
