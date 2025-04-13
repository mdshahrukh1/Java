public class PrimeNumber {
    // public static boolean isPrime(int n){
    // //corner Cases only for n >= 2
    // if(n == 2){
    // return true;
    // }

    // // boolean isPrime = true;

    // for(int i = 2; i <= n-1; i++){
    // if(n % i == 0){ //Completely dividing
    // // isPrime = false;
    // // break; //return isPrime;
    // return false;
    // }
    // }
    // // return isPrime;
    // return true;
    // }
    
    // using factors
    // int n = ... // some integer
    // int factors = 0;for(
    // int i = 1;i<=n;i++)
    // {
    //     if (n % i == 0) {
    //         factors++;
    //     }
    //     if (factors > 2)
    //         break; // more than two factors means not a prime
    // }System.out.println(factors==2?"Prime":"Not Prime");

    // Optimized Solution
    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
}
