package Arrays.Pracs;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums = {3,5,6,7};
        System.out.println(Arrays.toString(nums));
        changeNum(nums);
        System.out.println(Arrays.toString(nums));

    }


    static void changeNum(int[] num){
        num[0] = 99;
    }
}
