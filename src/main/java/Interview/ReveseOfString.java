package Interview;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReveseOfString {

    public static void main(String[] args) {
        String name = "ravi bhushan jha";

        String reverseValue = IntStream.range(0, name.length())
                        .mapToObj(i -> name.charAt(name.length() - 1 -i))
                                .map(Objects::toString)
                                        .collect(Collectors.joining());


        System.out.println(" Reverse :"+ reverseValue);

        Character firstNonRepeatingChar = name.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toMap(Function.identity(), c -> 1, Integer::sum, LinkedHashMap::new))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .skip(2)
                .findFirst()
                .orElse(null);

        System.out.println(" First Non repeting Character in String  :"+ firstNonRepeatingChar);


        Map<Character, Long> characterLongMap = name.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        Character firs = characterLongMap.entrySet().stream().filter(entry -> entry.getValue() ==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        Character LastNonRepeatingChar = characterLongMap.entrySet().stream().filter(entry -> entry.getValue() ==1)
                .map(Map.Entry::getKey)
                .reduce((first,second) -> second)
                .orElse(null);

        System.out.println(" First Non repeting Character in String  :"+ firs);

        System.out.println(" Last Non repeting Character in String  :"+ LastNonRepeatingChar);


        String revrseData = IntStream.range(0,name.length())
                .mapToObj(c -> name.charAt(name.length()-1 - c))
                .map(Objects::toString)
                .collect(Collectors.joining());
    }

}
