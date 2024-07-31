package Interview.StreamAPI;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;


public class StreamPractice {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,12,13,14,15,1,5,8};
        List<Integer> arrList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,13,14,15);

        String name ="Helloworld";
        //find all even/odd on list.

        List<Integer> evenNo = arrList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        List<Integer> oddNo = arrList.stream().filter(i-> i % 2 != 0).collect(Collectors.toList());


        //Remove Duplicate for list
        Set<Integer> uniqueElement = arrList.stream().collect(Collectors.toSet());

//        seprationOfEvenOddElementInMap();
//        seprationOfEvenOddElement();
//        removeDuplicate();
//        duplicateElement();
//        removeElement();
//        frequencyOfElement();
 //       addPrefixSuffixinString();
 //       multipleOfFive();
//        mergeTwoUnsortedArray();
//        mergeTwoUnsortedDistinctArray();
//        mergeTwoUnsortedStringArray();
//        reverseString();
        reverseWord();
//        commonElement();
//        reverseIntegerArray();
//        stringEndsWithNumber();
//        stringsStartsWithNumber();
//        extractDuplicateElements();
//        firstRepeatedCharacter();
//        duplicateCharactersInString();
//        secondRepeatedCharacter();
        reverseString();

    }

    private static void seprationOfEvenOddElement(){
        List<Integer> arrList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Collection<List<Integer>> sepratedData = arrList.stream()
                .collect(collectingAndThen(partitioningBy(i -> i % 2 == 0),
                Map::values));
        System.out.println("EvenOddList: "+ sepratedData);

    }

    private static void seprationOfEvenOddElementInMap(){
        List<Integer> arrList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean,List<Integer>> evenOdd = arrList.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(evenOdd);
        System.out.println("EvenList: "+ evenOdd.get(true));
        System.out.println("OddList: "+ evenOdd.get(false));
    }

    private static void removeDuplicate(){
        List<Integer> arrList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,9,5,7,8,2,4,1,0,12,13,14,15);

        Set<Integer> uniqueDataBySet = arrList.stream()
                .collect(Collectors.toSet());

        System.out.println(uniqueDataBySet);

        List<Integer> uniqueDataByList = arrList.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueDataByList);

        List<Integer> removeDuplicate = arrList.stream()
                .filter(n -> arrList.indexOf(n) != arrList.lastIndexOf(n))
                .collect(Collectors.toList());

        System.out.println(removeDuplicate);
    }

    //remove element which is duplicate
    private static void removeElement(){
        List<Integer> arrList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,9,5,7,8,2,4,1,0,12,13,14,15);

        List<Integer> removeDuplicate = arrList.stream()
                .filter(n -> arrList.indexOf(n) == arrList.lastIndexOf(n))
                .collect(Collectors.toList());

        System.out.println(removeDuplicate);
    }

    //print duplicate element only
    private static void duplicateElement(){
        List<Integer> arrList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,9,5,7,8,2,4,1,0,12,13,14,15);

        List<Integer> duplicateElements = arrList.stream()
                .filter(n -> arrList.indexOf(n) != arrList.lastIndexOf(n))
                .collect(Collectors.toList());
        System.out.println(duplicateElements);
    }

    private static void frequencyOfElement(){
        String name = "helloworld";

        Map<String,Long> count = Arrays.stream(name.split(""))
                .collect(groupingBy(Function.identity(),counting()));
        count.forEach((item,counts) -> System.out.println(item + ": "+ counts));

        Map<Character,Long> characterFrequen = name.chars()
                .mapToObj(c -> (char) c)
                .collect(groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(characterFrequen);

        Map<String, Integer> countOfString = Arrays.stream(name.split(""))
                .collect(groupingBy(Function.identity(),collectingAndThen(counting(), Long::intValue)));

        System.out.println(countOfString);
    }

    private static void addPrefixSuffixinString(){
        List<String> data = Arrays.asList("hello","rakesh","bob","alice");

        String  stringwithPreSuf= data.stream()
                .collect(joining(",","[","]"));

        System.out.println(stringwithPreSuf);

    }

    private static void multipleOfFive(){
        List<Integer> arrList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,9,5,7,8,2,4,1,0,12,13,14,15);

        arrList.stream().filter(n -> n % 5 == 0).distinct().forEach(System.out::println);
    }

    private static void mergeTwoUnsortedArray(){
        int[] arr1 = {0,8,1,6,9,3};
        int[] arr2 = {5,8,14,2,9,10};

        int[] sortedArray = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().toArray();

        System.out.println("Sorted merged Array : "+ Arrays.toString(sortedArray));
    }

    private static void mergeTwoUnsortedDistinctArray(){
        int[] arr1 = {0,8,1,6,9,3};
        int[] arr2 = {5,8,14,2,9,10};

        int[] sortedArray = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).distinct().sorted().toArray();

        System.out.println("Merged Sorted Distinct Array : "+ Arrays.toString(sortedArray));
    }

    private static void mergeTwoUnsortedStringArray(){
        String[] arr1 = {"0","8","1","6","9","3"};
        String[] arr2 = {"5","2","4","6","8","3"};

        String[] sortedArray = Stream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).distinct().sorted().toArray(String[]::new);

        System.out.println("Merged Sorted Distinct String Array : "+ Arrays.toString(sortedArray));
    }

    private static void reverseString(){
        String str = "Hello Im java developer";

        String revesredData = IntStream.range(0,str.length())
                .mapToObj(i -> str.charAt(str.length()-1-i))
                .map(Object::toString)
                .collect(joining());



        String data = Arrays.stream(str.split(" "))
                .map(word -> {
                    char[] chars = word.toCharArray();
                    String reverse = "";
                    for(int i =chars.length-1; i >=0; i--){
                        reverse += chars[i];
                    }
                    return reverse;
                })
                .collect(joining(" "));

         System.out.println("Reveres Data:"+ data);
    }

    private static void reverseWord(){
        String str = "Hello Im java developer";

        String reverseWord = Arrays.stream(str.split(" "))
                .collect(Collectors.collectingAndThen(Collectors.toList(),list -> {
                    Collections.reverse(list);
                    return list.stream();
                }))
                .collect(joining(" "));

        System.out.println(reverseWord);

        String reverse = Arrays.stream(str.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(joining(" "));
        System.out.println(reverse);

        String revesredData = IntStream.range(0,str.length())
                .mapToObj(i -> str.charAt(str.length()-1-i))
                .map(Object::toString)
                .collect(joining());

       // System.out.println("Reveres Data:"+ revesredData);


    }



    private static void commonElement(){
        List<Integer> oneToTen = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> twoToTen = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> commonData = oneToTen.stream()
                .filter(twoToTen::contains)
                .collect(toList());

        System.out.println("Common Data in both list: "+ commonData);

    }

    private static void reverseIntegerArray(){
        int[] arr = {1,3,5,6,7};

        int[] reverseInt = IntStream.rangeClosed(1,arr.length)
                .map(no -> arr[arr.length - no])
                .toArray();
        System.out.println("Reverse Integer :" + Arrays.toString(reverseInt));
    }

    private static void stringsStartsWithNumber() {
        String [] words= {"rohit","foo","nemo","target1","12Target","2robot"};

        System.out.println("original Strings " + Arrays.toString(words));

        List<String> wordsWithInt = Arrays.stream(words)
                .filter(word -> Character.isDigit(word.charAt(0)))
                .collect(toList());

        System.out.println("Starting with No in Strings " + wordsWithInt);
    }

    private static void stringEndsWithNumber() {
        String [] words= {"rohit","foo","nemo1","target1","12Target","2robot"};

        System.out.println("original Strings " + Arrays.toString(words));

        List<String> wordsWithInt = Arrays.stream(words)
                .filter(word -> Character.isDigit( word.charAt(word.length()-1)))
                .collect(toList());

        System.out.println("Endinig with Number Strings " + wordsWithInt);
    }

    private static void firstRepeatedCharacter() {
        String word = "rohttoh";
        System.out.println ("First Repeating Chaacter : "+Arrays.stream (word.split (""))
                .filter (str -> word.indexOf (str) != word.lastIndexOf (str))
                .findFirst ().orElse (""));
    }

    private static void secondRepeatedCharacter() {
        String word = "rohttoh";
        System.out.println ("Second Repeating Chaacter : "+Arrays.stream (word.split (""))
                .filter (str -> word.indexOf (str) != word.lastIndexOf (str))
                .skip(1).findFirst ().orElse (""));
    }

    private static void duplicateCharactersInString() {
        String word = "rohttoh";
        System.out.println ("original String " + word);


        System.out.println (Arrays.stream (word.split (""))
                .filter (str -> word.indexOf (str) != word.lastIndexOf (str))
                .map (str -> str.charAt (0))
                .collect (toList ()));
    }

    private static void extractDuplicateElements() {
        List<Integer> duplicateElements = Arrays.asList(1, 2,2,2,3, 3, 4, 5,1,1,56, 7, 8, 9, 10);

        System.out.println("maxed Elements " + duplicateElements);

        List<Integer> extractDuplicateElements = duplicateElements.stream()
                .filter(element -> duplicateElements.indexOf(element)
                        != duplicateElements.lastIndexOf(element))
                .distinct()
                .collect(toList());


        System.out.println("extract duplicates elements from " + extractDuplicateElements);
    }


}
