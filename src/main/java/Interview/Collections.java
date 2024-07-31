package Interview;

import Model.Employee;

import java.util.HashMap;
import java.util.Map;

public class Collections {

    public static void main(String[] args) {

        HashMap<Employee, String> empData = new HashMap<Employee,String>();

        Employee employee1 = new Employee("Ravi",7757896288L, 1);
        Employee employee2 = new Employee("Ravi",7757896288L, 1);


        empData.put(employee1, "Fighter");
        empData.put( employee2, "Lighter");

        System.out.println(empData);

        for (Map.Entry<Employee, String> employeeStringEntry : empData.entrySet()) {
            System.out.println(employeeStringEntry.getKey().hashCode());
        }
        employee1.setName("Rahul");

        for (Map.Entry<Employee, String> employeeStringEntry : empData.entrySet()) {
            System.out.println(employeeStringEntry.getKey().hashCode());
        }

        System.out.println(empData.get(employee1));






    }
}
