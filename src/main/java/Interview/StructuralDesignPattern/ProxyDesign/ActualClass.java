package Interview.StructuralDesignPattern.ProxyDesign;

public class ActualClass implements SuperClass{
    @Override
    public void display() {
        System.out.println("Calling from Actual class");
    }
}
