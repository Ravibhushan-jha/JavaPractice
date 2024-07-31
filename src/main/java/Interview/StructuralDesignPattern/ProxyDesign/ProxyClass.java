package Interview.StructuralDesignPattern.ProxyDesign;

public class ProxyClass extends ActualClass{

    public void display() {
        boolean flag = false;
        System.out.println("Calling from proxy class");

        if(flag == false){
            super.display();
        }
    }
}
