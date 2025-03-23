public class FunctionOverloading {
    // //Function to calculate sum of 2 numbers
    // public static int sum(int a, int b){
    //     return a + b;
    // }

    // //Function to calculate sum of three numbers
    // public static int sum(int a, int b, int c){
    //     return a + b + c;
    // }

    // function to calculate int sum
    public static int sum(int a, int b){
        return a + b;
    }

    //function to calculate float sum
    public static float sum(float a, float b){
        return a + b;
    }
    
    public static void main(String[] args){
        // System.out.println(sum(5 , 3));
        // System.out.println(sum(5 , 3, 1));
        System.out.println(sum(5 , 3));
        System.out.println(sum(5f , 3f));
    }
}
