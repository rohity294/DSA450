package dsa450;

public class dsa1_ReverseArray {
    public static void main(String[] args) {
        int[] input = {1,2,11,7,5};

        //brute force method
//          int[] output = new int[input.length];
//        int size = input.length-1;
//
//        for(int i=0;i<input.length;i++){
//            output[size] = input[i];
//            size--;
//        }
//
//        for (int item:output
//             ) {
//            System.out.println(item);
//        }

        //methodSwap(input);
        methodRecursion(input,0,input.length-1);
    }

    static void methodSwap(int[] input){
        int start = 0;
        int end = input.length-1;
        while(start < end) {
            int temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start = start+1;
            end = end-1;
        }
        printArray(input);
    }

    static void methodRecursion(int[] input,int start,int end){
        if(start < end){
            int temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            methodRecursion(input,start+1,end-1);
        }
        else{
            printArray(input);
        }

    }

    static void printArray(int[] result){
        for(int item:result){
            System.out.println(item);
        }
    }


}
