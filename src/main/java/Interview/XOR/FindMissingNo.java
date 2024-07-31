package Interview.XOR;

import java.util.*;

public class FindMissingNo {

    public static void main(String[] args) {

        int[] data = {1,2,2,3,2};
        int len = data.length;
        int maj = 5;
        int repeatCountBy = 5/2;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < len; i++){
            list.add(data[i]);
        }

        Map<Integer, Integer> occurances = new HashMap<Integer,Integer>();
        for(Integer in : list){

          if(occurances.containsKey(in)){
              occurances.put(in, occurances.get(in) +1);
          }else {
              occurances.put(in,1);
          }
        }
        for(Map.Entry<Integer,Integer> entry : occurances.entrySet()){
            if(entry.getValue() > repeatCountBy){
                System.out.println("Element which found:" + entry.getKey());
            }
        }


        int[] arr = {1,2,3,4,5};
        int n = 2;

        int sum = n*(n + 1)/2;

        for(int i = 0; i< arr.length ; i++){

            sum = sum - arr[i];
        }
  //      System.out.println(sum);
    }



}
