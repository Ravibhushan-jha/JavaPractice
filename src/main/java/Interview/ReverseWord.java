package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseWord {

    // Reverse word without using any Library;

    public static void main(String[] args) {
            String name = "Hi may name Ravibhushan";

        // Expected output  =  "iH yaw eman nahsuhbivaR";

            List<Character> data = name.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.toList());

            List<Character> reverseLsit = new ArrayList<>();

            for (int i = data.size() -1 ; i >= 0; i--){
                reverseLsit.add(data.get(i));
            }

            String revsersData = reverseLsit.stream().map(String::valueOf).collect(Collectors.joining());

    //        System.out.println(" Revesred Data :" + revsersData);

        List<String> strListform = new ArrayList<>();
        strListform.add(Arrays.toString(name.split(" ")));

        String reversed = strListform.stream()
                .map(ReverseWord::reverse)
                .collect(Collectors.joining(" "));



   //strListform.stream().map(ReverseWord::reverseData).collect(Collectors.toList()).forEach(System.out::print);
    List<String> revserse = new ArrayList<>();

        for(int i =0; i< strListform.size() ; i++)
            revserse.add(revsersData(strListform.get(i)));
        {

        }



    }

    private static String revsersData(String str) {
        String reverse = IntStream.range(0,str.length()).mapToObj(i -> str.charAt(str.length()-1 -i))
                .map(Object::toString)
                .collect(Collectors.joining());
        return reverse;



    }


    public static String reverseData(String str){

        String reverse = IntStream.range(0,str.length()).mapToObj(i -> str.charAt(str.length()-1 -i))
                .map(Object::toString)
                .collect(Collectors.joining());
        return reverse;
    }

    public static String reverse(String input) {
        char[] chars = input.toCharArray();
        int n = chars.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[n - 1 - i];
            chars[n - 1 - i] = temp;
        }
        return new String(chars);
    }
}
