package dsa450;

public class dsa5_groupNegativesAndPositives {//group negatives and positives together and order not important
    public static void main(String args[]){
        int input[] = {-12, 11, -13, -5,-5, 6, -7, 5, -3,-5,-6};

//        Arrays.sort(input);
//        for(int item:input){
//            System.out.println(item);
//        }// but it disturbs the original order of elements

        //without affecting original order

        myQuickSort(input,0,input.length-1);
        for(int item:input){
            System.out.println(item);
        }
    }

    static void myQuickSort(int[] input,int lb,int ub){
        if(lb<ub){
            int partitionIndex = getPartitionIndex(input,lb,ub);
//            myQuickSort(input,lb,partitionIndex-1);
//            myQuickSort(input,partitionIndex+1,ub);
        }
    }

    static int getPartitionIndex(int[] input,int lb,int ub){
        int pivot = 0;
        int start = lb;
        int end = ub;
        while(start<end){
            while(input[start]<=pivot && start<end){
                start++;
            }
            while(input[end]>pivot){
                end--;
            }
            if(start<end){
                int temp = input[start];
                input[start] = input[end];
                input[end] = temp;
            }
        }
        int temp = input[lb];
        input[lb] = input[end];
        input[end] = temp;
        return end;
    }
}
