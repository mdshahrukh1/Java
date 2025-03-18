// import java.util.*;

public class ArithmaticOp {
    public static void main(String[] args) {
        int A = 10;
        int B = 5;
        System.out.println("Add = " + (A+B));
        System.out.println("Subtract = " + (A-B));
        System.out.println("Multiplly = " + (A*B));
        System.out.println("Divide = " + (A/B));
        System.out.println("Modulo(remainder) = " + (A/B));

   //Unary Operator
        int c = 10;
        int d = c++;
        int g = ++c;
        System.out.println(c);
        System.out.println(d);
        System.out.println(g);

        int e = 10;
        int f = e--;
        int h = --e;
        System.out.println(e);
        System.out.println(f);
        System.out.println(h);
    }
}
