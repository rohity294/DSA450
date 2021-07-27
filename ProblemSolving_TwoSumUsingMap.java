package dsa450;

import java.util.HashMap;
import java.util.Map;

//given an array and a target
//find 2 numbers which add upto the target
//there is only 1 unique solution and each element of array can be used only once
public class ProblemSolving_TwoSumUsingMap {
    public static void main(String args[]){
        int result[] = myMethod(new int[]{2,3,7,4,8},11);
        System.out.println(result[0]+","+result[1]);
    }

    static int[] myMethod(int arr[], int target){
        Map<Integer,Integer> visitedMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int delta = target - arr[i];
            if(visitedMap.containsKey(delta)){
                return new int[]{visitedMap.get(delta),i};
            }
            visitedMap.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}
