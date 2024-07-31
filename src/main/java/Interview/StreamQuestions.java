package Interview;

import Model.Employee;

import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamQuestions {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee("Ravi",1234567890l,1));
        employees.add(new Employee("Auraj",1234567890l,1));
        employees.add(new Employee("Hrash",1234567890l,8));
        employees.add(new Employee("Weela",1234567890l,90));
        employees.add(new Employee("Maruti",1234567890l,10));


        List<Employee> getName = employees.stream().filter(e -> e.getName().startsWith("R")).collect(Collectors.toList());

        for(Employee emp : getName){
     //       System.out.println(emp);
        }

        List<Employee> sortByName = employees
                .stream()
                .sorted(Comparator.comparing(Employee::getId).thenComparing(Employee::getName))
                .collect(Collectors.toList());

        for(Employee emp : sortByName){
            System.out.println(emp);
        }

        int paraleelstream = Runtime.getRuntime().availableProcessors() -1;

        System.out.println("Current No thread are available :" + paraleelstream);

        Map<Long, Optional<Employee>> empList = employees.stream().collect(Collectors.groupingBy(Employee :: getMobileNo, Collectors.minBy(Comparator.comparing(Employee::getId))));

        System.out.println("Emp Data :" + empList);

       OptionalInt bymax = employees.stream().mapToInt(x -> x.getId()).max();

        System.out.println("max Salary:"+ bymax);

        String str = "Ravi of jha";
        String reversedString = str.chars()
                .mapToObj( c -> (char) c)
                .collect(Collectors.collectingAndThen(Collectors.toList(),lst -> {
                    Collections.reverse(lst);
                    return lst.stream();
                })).map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println("Reverse:"+ reversedString);
    }
}
