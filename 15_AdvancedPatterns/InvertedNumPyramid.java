
public class InvertedNumPyramid {
    public static void inverted_half_pyramid_num(int n){
        //outer loop
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){//inner loop
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
inverted_half_pyramid_num(5);
    }
}
