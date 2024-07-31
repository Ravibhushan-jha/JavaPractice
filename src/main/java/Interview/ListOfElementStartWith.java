package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfElementStartWith {

    public static void main(String[] args) {

        int inputArray[] = {1,25,34,45,26,26,37};

        List<String> Values = Arrays.stream(inputArray)
                .boxed().map(b -> b.toString())
                .filter(a -> a.startsWith("2"))
                .collect(Collectors.toList());

        System.out.println(Values);
    }
}
