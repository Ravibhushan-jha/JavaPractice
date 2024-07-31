package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSecondLargestElement {

    public static void main(String[] args) {
        int[] num = {1,9,7,3,5,2,4};

        int sec = findSecondLargest(num);

        System.out.println(" 2nd Element : "+ sec);
    }

    public static int findSecondLargest(int [] num){

        int firstLargest, secondLarget;

        if(num[0] > num[1]){
            firstLargest = num[0];
            secondLarget = num[1];
        }else {
            firstLargest = num[1];
            secondLarget = num[0];
        }

        for (int x = 2 ; x< num.length ; x++){

            if (num[x] > firstLargest){

                secondLarget = firstLargest;
                firstLargest = num[x];
            }else if(num[x] > secondLarget &&  num[x] != firstLargest){
                secondLarget = num[x];
            }
        }

        return secondLarget;
    }

}
