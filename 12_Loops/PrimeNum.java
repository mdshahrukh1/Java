import java.util.*;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if(n == 2){
            System.out.println("N is Prime Number");
        } else {
            boolean isPrime = true;
            for(int i = 2; i <= Math.sqrt(n); i++){  //for(int i = 2; i <= n-2; i++)
                if(n % i == 0){  // n is a multiple of i (i not equal to 1 or n)
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println("N is a Prime Number");
            } else {
                System.out.println("N is Not a Prime Number");
            }
        }
    }
}
