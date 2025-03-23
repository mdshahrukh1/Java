public class BinomialCoeff {
    public static int fact(int n){
        int f = 1;
        
        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;  //factorial of n
    }

    public static int binCoef(int n, int r){
        int fact_n = fact(n);
        int facr_r = fact(r);
        int fact_nmr = fact(n-r);

        int binCoef = fact_n/(facr_r * fact_nmr);
        return binCoef;

    }
    public static void main(String[] args){
        System.out.println(binCoef(5, 2));
    }
}
