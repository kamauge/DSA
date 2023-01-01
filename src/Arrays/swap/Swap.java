package Arrays.swap;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,3,6,8,9,0};

        swap(arr,1,2);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int [] arry,int index1,int index2){

        int temp = arry[index1];
        arry[index1] = arry[index2];
        arry[index2] = temp;

    }
}
