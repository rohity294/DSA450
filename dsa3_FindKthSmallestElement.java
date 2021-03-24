package dsa450;

public class dsa3_FindKthSmallestElement {
    public static void main(String args[]){
        int input[] = {7,10,4,3,20,15};//given no element is repeated in the array
        int answer = findKthSmallest(input,3);//answer should be 7
        System.out.println(answer);
    }

    static int findKthSmallest(int input[],int k){
        //Arrays.sort(input);//input array is now sorted

        for(int i=0;i<input.length;i++){//using sorting without using custom built function
            for(int j=i+1;j<input.length;j++){
                if(input[i]>input[j]){
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }


        return input[k-1];
    }


}
