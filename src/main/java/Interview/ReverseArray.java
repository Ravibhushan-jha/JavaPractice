package Interview;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,8,9};

        System.out.println(" Before Revere : ");
        for (int i =0; i <arr.length; i++){
            System.out.println(arr[i]);
        }

        int[] revrseArray =  reverseArray(arr);


        System.out.println("After reverse");
        for (int i =0; i <revrseArray.length; i++){
            System.out.println(revrseArray[i]);
        }


    }

    public static int[] reverseArray(int[] arr){
        int arrayLenth = arr.length;
        int start = 0;
        int end = arrayLenth - 1;

        List<Integer> reverseData = new ArrayList<Integer>();
        while(start < end){

            arr[start] = arr[start];
            arr[end] = arr[end];
            int temp;

            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;

        }
       return arr;
    }
}
