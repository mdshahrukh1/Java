
public class ReverseaNumber {
    public static void main(String[] args) {
        int n = 10899;
        //Printing Last digit of a Number;
        // while (n > 0) {
        //     int lastDigit = n % 10;
        //     System.out.print(lastDigit);
        //     n = n / 10; // n /= 10;
        // }

        int rev = 0;

        while(n > 0){
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n/10;
        }
        System.out.println(rev);
    }
}
