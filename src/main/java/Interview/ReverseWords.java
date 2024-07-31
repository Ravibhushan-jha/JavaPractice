package Interview;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWords {
    public static void main(String[] args) {
        String name = "Hi my name Ravibhushan";

        // Split the string into words
        List<String> words = Arrays.asList(name.split(" "));

        // Reverse the list of words manually
        List<String> reversedWords = ListUtil.reverseList(words);

        // Join the reversed words back into a single string
        String reversed = reversedWords.stream()
                .collect(Collectors.joining(" "));

        // Print the result
        System.out.println(reversed);
    }
}

class ListUtil {
    public static List<String> reverseList(List<String> list) {
        List<String> reversedList = new ArrayList<>(list.size());
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}
