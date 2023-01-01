package Arrays.duplicates;

public class Duplicates {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,5};

        System.out.println(checkDuplicateValue(arr));

    }

    static int checkDuplicateValue(int[] arr){
        //check if array is not empty

        if (arr.length == 0){
            return -1;
        }

        //assume that value is the reference value
        int ref = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == ref){

                ref = arr[i];
            }
        }

        return ref;
    }
}
