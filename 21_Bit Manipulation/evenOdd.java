// import java.util.*;

public class evenOdd {
    public static void OddOrEven(int n){
       int bitMask = 1;
       if((n & bitMask) == 1) {
        //even number
        System.out.println("Odd Number");
       }
       else{
        System.out.println("Even Number");
       }
    }
    public static void main(String args[]){
        OddOrEven(3);
        OddOrEven(11);
        OddOrEven(14);
    }
    
}
