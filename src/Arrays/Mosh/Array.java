package Arrays.Mosh;

import java.util.Arrays;

public class Array {
    int[] items;

    //to track the items in
    private int count;
    Array(int length){
        items = new int[length];
    }

    public void insert(int item){
        //Add item at the end of the array
       count = item;

    }

    public void removeAt(int item){

    }

    public void println(){

        //items.length used to allocate memory
        for (int i = 0;i < count;i++){
            System.out.println(count);
        }

       // Arrays.toString(items);

    }
}
