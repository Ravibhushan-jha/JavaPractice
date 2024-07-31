package Interview.StructuralDesignPattern.FlyweightPattern;


public class Dog extends Animal{

    private static String name = "micky";



    public static void main(String[] args) {

      System.out.println("Dog Detail:");
        System.out.println("Dog Name:"+name);
        System.out.println("Dog has Eyes:"+ Dog.eyes);
        System.out.println("Dog has Nose:" + Dog.nose);
        System.out.println("Dog has Legs:"+ Dog.legs);
        System.out.println("Dog has Legs:"+ Dog.tail);



    }

}

