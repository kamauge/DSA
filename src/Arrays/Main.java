package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0;i < arr.length;i++){
            arr[i] = scanner.nextInt();

        }

//        for (int ar: arr) {
//            System.out.println(ar);
//        }

        //Array method string
        System.out.println(Arrays.toString(arr));


        ///Array of objects

        //declaration   initialize
        String [] str = new String[5];

        for (int i = 0; i < str.length;i++){

        }
    }
}
