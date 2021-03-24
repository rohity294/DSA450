package dsa450;

public class sorting_Quicksort {
    public static void main(String args[]){
//      int[] input = {7,6,10,5,9,2,1,15,7};
        int input[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};

        quickSort(input,0,input.length-1);
        for(int item:input){
            System.out.println(item);
        }
    }

    static void quickSort(int[] input,int lb,int ub){
        if(lb<ub){
            int partitionIndex = getPartitionIndex(input,lb,ub);
            quickSort(input,lb,partitionIndex-1);
            quickSort(input,partitionIndex+1,ub);
        }
    }

    static int getPartitionIndex(int[] input,int lb,int ub){
        int pivot = input[lb];
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
