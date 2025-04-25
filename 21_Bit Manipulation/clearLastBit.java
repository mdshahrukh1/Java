public class clearLastBit {
    public static int clearlastBit(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static void main(String args[]){
        System.out.println(clearlastBit(15, 2));
    }
}
