package dsa450;

public class sorting_Bubblesort {
    public static void main(String args[]){
        int a[] = {5,4,15,0,-1,1};
        System.out.println("before sorting:");
        for(int item:a){
            System.out.print(item+" ");
        }

        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("\n after sorting:");
        for(int item:a){
            System.out.print(item+" ");
        }
    }
}
