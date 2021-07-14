package dsa450;

public class SlidingWindow_1_MaxSumSubarrayofsizeK {
    public static void main(String args[]){
        int input[] = {100, 200, 300, 400};
        int k=2;//window size
        //ans is 700

        //using brute force
        int sum = 0;
        int maxSum = 0;
        for(int i=0;i<input.length-1;i++){
            sum = 0;
            for(int j=i;j<i+k;j++){
                sum = sum+input[j];
            }
            maxSum = Math.max(maxSum,sum);
        }
        System.out.println("Using brute force, max sum of sub-array of size k: "+maxSum);

        //using optimized sliding-window technique
        int i = 0;
        int j = 0;
        sum = 0;
        maxSum = 0;

        while(j<=input.length-1){
            sum = sum + input[j];
            if(j-i+1<k){//j-i+1 always gives window size
                j++;
            }
            else{
                maxSum = Math.max(maxSum,sum);
                sum = sum - input[i];
                j++;
                i++;
            }
        }
        System.out.println("Using optimized sliding window technique, max sum of sub-array of size k: "+maxSum);
    }
}

//        Using brute force, max sum of sub-array of size k: 700
//        Using optimized sliding window technique, max sum of sub-array of size k: 700