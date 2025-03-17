import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println(sum);
        
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int d = sc.nextInt();
        int sum2 = c + d;
        System.out.println(sum2);
        sc.close();
    }
}
