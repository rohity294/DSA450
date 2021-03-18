package dsa450;

public class dsa2_findMaxMin {
    public static void main(String args[]){
        int[] input = {10,0,-7,13,-3,2,111,13,0,-7,55};
        //findMaxByBrute(input);
        //findMinByBrute(input);
        //findMaxByRecursion(input,input[0],1);
        MinMaxPair pair = findMinMaxPairByRecursion(input,0,input.length-1);
        System.out.println("Min:"+pair.min);
        System.out.println("Max:"+pair.max);
    }

    static void findMaxByBrute(int[] input){
        int max = input[0];
        for(int i=1;i<input.length;i++){
            if(input[i] > max){
                max = input[i];
            }
        }
        printMaxOrMin(max);
    }

    static void findMinByBrute(int[] input){
        int min = input[0];
        for(int i=1;i<input.length;i++){
            if(input[i] < min){
                min = input[i];
            }
        }
        printMaxOrMin(min);
    }

    static void findMaxByRecursion(int[] input,int max,int current){
        if(current==input.length-1){
            printMaxOrMin(max);
            return;
        }
        if(input[current] > max){
            max = input[current];
        }
        current++;
        findMaxByRecursion(input,max,current);
    }

    static void printMaxOrMin(int max_or_min){
        System.out.println(max_or_min);
    }

    static MinMaxPair findMinMaxPairByRecursion(int[] input,int min,int max){
        MinMaxPair pair = new MinMaxPair();

        if(min==max){//only 1 element in array
            pair.min = min;
            pair.max = max;
            return pair;
        }

        if(max-min==1){//two elements in the array
            if(input[min]<=input[max]){
                pair.min = input[min];
                pair.max = input[max];
            }
            else{
                pair.min = input[max];
                pair.max = input[min];
            }
            return pair;
        }

        //3 or more elements in the array
        int mid = (min+max)/2;
        MinMaxPair pairLeft = findMinMaxPairByRecursion(input,min,mid-1);
        MinMaxPair pairRight = findMinMaxPairByRecursion(input,mid,max);
        if(pairLeft.min<=pairRight.min){
            pair.min = pairLeft.min;
        }
        else
        {
            pair.min = pairRight.min;
        }
        if(pairLeft.max>pairRight.max){
            pair.max = pairLeft.max;
        }
        else
        {
            pair.max = pairRight.max;
        }
        return pair;
    }
}

class MinMaxPair{
    int min;
    int max;
}
