package Interview.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeProcess {

    public static void main(String[] args) {

        List<Employees> employeesList = new ArrayList<>();
        employeesList.add(new Employees("Ravi",12345678L,1,2000,"IT"));
        employeesList.add(new Employees("Shubham",145465678L,2,2000,"GK"));
        employeesList.add(new Employees("Ravi",12345678L,3,4000,"US"));
        employeesList.add(new Employees("Bob",123453678L,4,2050,"WSIT"));
        employeesList.add(new Employees("Alice",12545678L,5,1000,"WPB"));
        employeesList.add(new Employees("MArtin",1765675678L,6,9000,"MSS"));

        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 14500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Ali Baig", 31, "Male", "Product Development", 2012, 35700.0));

//        allDepartmentList(employeeList);
//        ListOfMaleEndFemaleEmp(employeeList);
//        avrageAgeOfMaleAndFemale(employeeList);
//        highestPaidEmployee(employeeList);
//        joineddate(employeeList);
//        noOfEmployeeByDept(employeeList);
//        avrageSalaryByDept(employeeList);
//        findYoungEmpinDept(employeeList);
//        findLowestPaidEmpinDept(employeeList);
//        findEmployeeHigherAge(employeeList);
        sortEmployeeBasedOnNameAndSalaryForDuplicateName(employeeList);
    }

    public static void allDepartmentList(List<Employee> employeeList){

        List<String> departmentName = employeeList.stream().map(emp -> emp.getDepartment()).distinct().collect(Collectors.toList());

        System.out.println("Department Name: " + departmentName);

    }

    public static void ListOfMaleEndFemaleEmp(List<Employee> employeeList){

        Map<String,Long> byGender = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));

        System.out.println("No of Male & Female Employees "+byGender);

    }

    public static void avrageAgeOfMaleAndFemale(List<Employee> employeeList){

        Map<String,Double> byGender = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));

        System.out.println("Average Age of Male & Female Emp : "+byGender);
    }

    public static void highestPaidEmployee(List<Employee> employeeList){

        Optional<Employee> highestPaidEmp = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

        System.out.println("Highest Paid Eployee:"+ highestPaidEmp);
    }

    public static void joineddate(List<Employee> employeeList){

        List<String> joinedAfterDte = employeeList.stream()
                .filter(emp -> emp.yearOfJoining > 2015 && emp.yearOfJoining < 2017)
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println("Emp joined After 2015 & 2017:" + joinedAfterDte);


    }

    public static void noOfEmployeeByDept(List<Employee> employeeList){

        Map<String,Long>  noOfEmployeeByDept= employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));

        noOfEmployeeByDept.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + ": "+ entry.getValue()));

    }

    public static void avrageSalaryByDept(List<Employee> employeeList){

        Map<String,Double> byGender = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("Average Salary in Each Department : "+byGender);
    }

    public static void findYoungEmpinDept(List<Employee> employeeList){

        Optional<Employee>  youngestEmpInProdDept = employeeList.stream()
                .filter(e -> e.getGender() =="Male" && e.getDepartment()=="Product Development")
                .min(Comparator.comparing(Employee::getAge));

        System.out.println( youngestEmpInProdDept.isPresent());
        System.out.println(" Data : " + youngestEmpInProdDept);


    }

    public static void findLowestPaidEmpinDept(List<Employee> employeeList){

        Optional<Employee>  youngestEmpInProdDept = employeeList.stream()
                .filter(e -> e.getDepartment()=="Product Development")
                .min(Comparator.comparingDouble(Employee::getSalary));

        System.out.println( youngestEmpInProdDept.isPresent());
        System.out.println(" Data : " + youngestEmpInProdDept);


    }

    public static void findEmployeeHigherAge(List<Employee> employeeList){

       List<Employee>  sortEmpAge = employeeList.stream()
               .sorted((e1,e2) -> Integer.compare(e2.getAge(),e1.getAge()))
               .collect(Collectors.toList());

       System.out.println(sortEmpAge);


    }


    public static void sortEmployeeBasedOnNameAndSalaryForDuplicateName(List<Employee> empList){

         empList.stream()
                .sorted(Comparator.comparing(Employee::getName)
                        .thenComparing(Employee::getAge))
                 .collect(Collectors.toList())
                 .forEach(System.out::println);
    }

}
