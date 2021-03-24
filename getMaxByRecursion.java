package dsa450;

public class getMaxByRecursion {
    public static void main(String args[]){
        int[] input = {50,-1,68,68,0,65,-13,13,68,50,-11,7};

        getMaxByRecursion(input,0,1);

        System.out.println("Max item is: "+input[input.length-1]);
    }

    static void getMaxByRecursion(int[] input,int max,int currIndex){
        if(currIndex==input.length-1){
            input[input.length-1] = max;
            return;
        }
        if(input[currIndex] > max){
            max = input[currIndex];
        }
        getMaxByRecursion(input,max,currIndex+1);
    }

}
