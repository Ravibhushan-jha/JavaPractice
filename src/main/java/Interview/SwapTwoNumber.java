package Interview;

public class SwapTwoNumber {

    public static void main(String[] args) {

        int number1 = 1;
        int number2 = 5;
        int temp;
        System.out.println(" Before swapping::  number1 :" + number1 + " number2 :"+ number2);
        temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println(" After swapping :: number1 :" + number1 + " number2 :"+ number2);
    }
}
