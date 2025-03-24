
public class RotatedHalfPyramid {
    public static void inverted_pyramid(int n){
        //Outer loop for rows
        for(int i = 1; i <= n; i++){
            //Spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            //Starts
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }


    public static void main(String[] args){
        inverted_pyramid(4);

    }
}
