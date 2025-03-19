import java.util.*;

public class OddOrEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        if(num % 2 == 0){
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
        //Ternary Operator
        // String type = ((num % 2) == 0) ? "Even" : "Odd";
        // System.out.println(type);
    }
}
