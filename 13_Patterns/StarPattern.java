
public class StarPattern {
    public static void main(String[] args){
        for(int line = 1; line <= 4; line++){
            //one Line
            for(int star = 1; star <= line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
