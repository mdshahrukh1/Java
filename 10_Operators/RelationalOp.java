
public class RelationalOp {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println((a == b)); //False
        System.out.println((a != b)); //True
        System.out.println((a > b)); //True
        System.out.println((b > a)); //False
        System.out.println((a < b)); //False
        System.out.println((b < a)); //True
         
        //There are more >=  and <=
        int c = 10;
        int d = 10;
        System.out.println((c <= d));// True
        System.out.println((c >= d));// True
    }
}
