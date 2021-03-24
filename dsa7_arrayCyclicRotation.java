package dsa450;

public class dsa7_arrayCyclicRotation {
    public static void main(String args[]) {
        long[] arr = {1, 2, 3, 4, 5};
        //output:     5, 1, 2 ,3, 4
        cyclicRotateRightBy1(arr);
        for (long item : arr) {
            System.out.println(item);
        }
    }

    public static void cyclicRotateRightBy1(long arr[]) {
        //method1
        long x = arr[arr.length-1];
        for (int i = arr.length - 1; i > 0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = x;


        //method2
//        long arr2[] = new long[arr.length];
//        arr2[0] = arr[arr.length - 1];
//        for (int i = 0, j = 1; i < arr.length - 1; i++) {
//            arr2[j] = arr[i];
//            j++;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr2[i];
//        }
    }
}
