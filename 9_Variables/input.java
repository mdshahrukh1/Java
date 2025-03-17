import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in); // Create a Scanner object named 'a' to read input from the console
       // Scanner b = new Scanner(System.in); // Create a Scanner object named 'a' to read input from the console
        String iput = a.nextLine(); // Read sentence or paragraph (token) from the user's input and store it in the variable 'iput'
        String put = a.next(); // Read a single word (token) from the user's input and store it in the variable 'iput'
        System.out.println(iput); // Print the value of 'iput' to the console
        System.out.println(put); // Print the value of 'iput' to the console
        int c = a.nextInt();
        int d = a.nextInt();
        int product = c * d;
        System.out.println(product);
        a.close();
    }
}


