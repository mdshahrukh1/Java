public class Fibonacci {
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        // int fibo1 = fib(n - 1);
        // int fibo2 = fib(n - 2);
         int fibo = fib(n - 1) + fib(n - 2);
        return fibo;
    }
    public static void main(String args[]){
        int n = 6;
        System.out.println(fib(n));
    }
}
