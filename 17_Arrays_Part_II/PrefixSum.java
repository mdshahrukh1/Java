
public class PrefixSum {
    public static void maxSubarraysSum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        //calculate prefix array
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for(int i = 0; i < numbers.length; i++){
            int start = i;
            for(int j = i; j < numbers.length; j++){
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum = " + maxSum);
    }

    public static void main(String[] args){
        // int numbers[] = {2, 4, 6, 8, 10};
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubarraysSum(numbers);
    }
}
