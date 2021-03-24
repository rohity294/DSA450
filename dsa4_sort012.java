package dsa450;

public class dsa4_sort012 {
    public static void main(String args[]){
        int input[]= {0,2,1,2,0};
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;

        for(int i=0;i<input.length;i++){
            if(input[i]==0){
                ++countZero;
            }
            else if(input[i]==1){
                ++countOne;
            }
            else{
                ++countTwo;
            }
        }

//        System.out.println("count0:"+countZero);
//        System.out.println("count1:"+countOne);
//        System.out.println("count2:"+countTwo);

        int pos = 0;

        for(int i=1;i<=countZero;i++){
            input[pos] = 0;
            pos++;
        }

        for(int i=1;i<=countOne;i++){
            input[pos] = 1;
            pos++;
        }

        for(int i=1;i<=countTwo;i++){
            input[pos] = 2;
            pos++;
        }

        for(int item:input){
            System.out.println(item);
        }

    }
}
