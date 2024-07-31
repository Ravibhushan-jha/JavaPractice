package Interview.SingletonPattern;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Singleton implements Serializable {

    private static Singleton singleton = null;

    private Singleton(){}

    protected static Singleton getInstance(){

        if (singleton == null)
        {
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    private Object readResolve(){

        return singleton;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton singleton = Singleton.getInstance();

        ObjectOutputStream obj1 = new ObjectOutputStream(new FileOutputStream("object.obj"));
        obj1.writeObject(singleton);
        obj1.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
         Singleton deseralized =(Singleton) objectInputStream.readObject();
         objectInputStream.close();

        System.out.println("Object 1 :"+ singleton.hashCode());
        System.out.println("Object 2 :"+ deseralized.hashCode());

        exampleReflection();
    }

    private static void exampleReflection() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor[] constructors = Singleton.class.getDeclaredConstructors();
        Constructor constructor = constructors[0];

        constructor.setAccessible(true);
        Singleton singleton1 = (Singleton) constructor.newInstance();
        Singleton instance = Singleton.getInstance();

        System.out.println("Object 1 from reflec :"+ singleton1.hashCode());
        System.out.println("Object 2 from reflec :"+ instance.hashCode());

    }



}
