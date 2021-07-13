package dsa450;

public class dsa8_largestSumContigousSubArray_KadanesAlgorithm {
    public static void main(String args[]) {
//        int[] input = {1, -3, 2, 1, 4, -1};
//        int[] input = {-2, 1, 2, 4, -11, 6};
        int[] input = {1,2,3,-2,5};
        //int result = myBruteForce(input);
        int result = myKadane(input);
        System.out.println(result);
    }

    static int myKadane(int[] a) {
        int currMax = a[0];//max till current index, here 0
        int globalMax = currMax;//max among all previous currMaxes

        for(int i=1;i<a.length;i++){
            currMax = Math.max(a[i],a[i]+currMax);//max until this point
            globalMax = Math.max(globalMax,currMax);// resets globalMax only if max until this point calculated above exceeds global max
        }

        return globalMax;
    }
}

