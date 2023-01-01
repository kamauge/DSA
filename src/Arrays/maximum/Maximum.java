package Arrays.maximum;

public class Maximum {
    public static void main(String[] args) {
        int [] nums = {};


        System.out.println(maxValue(nums));

    }

    //imagine that arr is not empty
    static int maxValue(int[] arr){
        //assume the max value is arr[0]


        //check if the array is empty
        if (arr.length == 0){
            return -1;
        }
        int max = arr[0];
        for (int i= 0; i < arr.length; i++){
//            if (arr[i] > max){
//                max = arr[i];
//            }
            while (arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }
}
