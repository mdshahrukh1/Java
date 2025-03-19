
public class LargestOfThree {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 6;

        if((a >= b) && (a >= c)){
            System.out.println("Largest: "+ a);
        } else if( b >= c){
            System.out.println("Largest: "+ b);  
        } else { // (c >= b)
            System.out.println("Largest: "+ c);
        }
    }
}
