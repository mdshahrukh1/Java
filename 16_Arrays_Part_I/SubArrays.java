
public class SubArrays {
    public static void printSubarrays(int numbers[]) {
        int TS = 0;
        for(int i = 0; i < numbers.length; i++){
            int start = i;
            for(int j = i; j < numbers.length; j++){
                int end = j;
                for(int k = start; k <= end; k++){// print
                    System.out.print(numbers[k] + " ");
                }
                TS++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub-Arrays = " + TS);
    }

    public static void main(String[] args){
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}
