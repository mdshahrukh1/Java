
public class LogicalOp {
    public static void main(String[] args) {
        //&& Logical AND
        System.out.println((3 > 2) && (5 > 0));//True
        // System.out.println((3 < 2) && (5 > 0));//False
        System.out.println((3 > 2) && (5 < 0));//False
        // System.out.println((3 < 2) && (5 < 0));//False

        //|| Logical OR
        // System.out.println((3 > 2) || (5 > 0));//True
        System.out.println((3 < 2) || (5 > 0));//True
        // System.out.println((3 > 2) || (5 < 0));//True
        System.out.println((3 < 2) || (5 < 0));//False

        // ! Logical NOT
        System.out.println(!(3>2)); //False
        System.out.println(!(0>5)); //True

    }
}
