package Interview.PrototypePattern;

public class PrototypeDemo {

    public static void main(String[] args) {

        EmployeeRecord e1=new EmployeeRecord(1,"rajesh","MD",11,"mumbai");

        e1.showRecord();

        EmployeeRecord e2 = (EmployeeRecord) e1.getClone();

        e2.showRecord();


    }
}
