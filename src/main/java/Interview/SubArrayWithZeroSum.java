package Interview;
import java.util.Arrays;

public class SubArrayWithZeroSum {

    public static void main(String[] args) {
       int[] input = new int[]{3,4,5,1,2,-3,4};

       for(int startindex = 0; startindex < input.length; startindex++){
           int sum = 0;
           for (int nextIndx = startindex; nextIndx < input.length; nextIndx++){

               sum += input[nextIndx];
               if(sum == 0){
                   System.out.println("True");
                   break;
               }
           }
       }
    }
}
