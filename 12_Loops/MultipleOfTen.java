import java.util.*;

public class MultipleOfTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter your Number : ");
            int n = sc.nextInt();

            if(n % 10 == 0){
                break;  ///Statement
                // continue;  Statement
            }
            System.out.println(n);
        } while (true);
        sc.close();
    }
}
