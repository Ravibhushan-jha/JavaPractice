package Interview.StructuralDesignPattern.FlyweightPattern;

public class Cat extends Animal{


    private static String name = "billoRani";


    public static void main(String[] args) {

        System.out.println("Cat Detail:");
        System.out.println("Cat Name is :" + name);
        System.out.println("Cat has Eyes:"+ Cat.eyes);
        System.out.println("Cat has Nose:" + Cat.nose);
        System.out.println("Cat has Legs:"+ Cat.legs);
        System.out.println("Cat has Legs:"+ Cat.tail);



    }
}
