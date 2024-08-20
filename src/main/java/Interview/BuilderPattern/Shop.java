package Interview.BuilderPattern;

public class Shop {

    public static void main(String[] args) {


        /*
        creating object problem is remember the parameter order,
        Not using any pattern to create an object for larger program it can cause issue
        this issue is solved by builder design pattern.
         */
        Phone p = new Phone("android",8,"intel",5.5,3000);

        System.out.println(p);


        // By using builder design pattern
        Phone ph = new PhoneBuilder().setOs("IOS").setRam(4).getPhone();

        System.out.println(ph);
    }
}
