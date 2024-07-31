package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindUniqueElement {
    public static void main(String[] args) {
        String inputName = "raviraj";

        System.out.println("Test Result :"+ findUniqueElement(inputName));


    }

    public static List<String> findUniqueElement(String input) {

        return Arrays.stream(input.split("")).collect(Collectors.groupingBy(inp -> inp,Collectors.counting()))
                .entrySet().stream()
                .filter(fil -> fil.getValue() == 2)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
