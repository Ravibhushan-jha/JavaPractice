package Interview.StreamAPI.ComplexOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentResult {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        List<MarkSheet> markSheet1 = new ArrayList<>();
        markSheet1.add(new MarkSheet(1,100,68));
        markSheet1.add(new MarkSheet(2,100,28));
        markSheet1.add(new MarkSheet(3,100,38));
        markSheet1.add(new MarkSheet(5,100,61));
        markSheet1.add(new MarkSheet(4,100,88));

        List<MarkSheet> markSheet2 = new ArrayList<>();
        markSheet2.add(new MarkSheet(1,100,78));
        markSheet2.add(new MarkSheet(2,100,58));
        markSheet2.add(new MarkSheet(3,100,88));
        markSheet2.add(new MarkSheet(5,100,41));
        markSheet2.add(new MarkSheet(4,100,28));

        List<MarkSheet> markSheet3 = new ArrayList<>();
        markSheet3.add(new MarkSheet(1,100,68));
        markSheet3.add(new MarkSheet(2,100,18));
        markSheet3.add(new MarkSheet(3,100,38));
        markSheet3.add(new MarkSheet(5,100,31));
        markSheet3.add(new MarkSheet(4,100,58));

        List<MarkSheet> markSheet4 = new ArrayList<>();
        markSheet4.add(new MarkSheet(1,100,61));
        markSheet4.add(new MarkSheet(2,100,22));
        markSheet4.add(new MarkSheet(3,100,36));
        markSheet4.add(new MarkSheet(5,100,61));
        markSheet4.add(new MarkSheet(4,100,89));

        List<MarkSheet> markSheet5 = new ArrayList<>();
        markSheet5.add(new MarkSheet(1,100,88));
        markSheet5.add(new MarkSheet(2,100,98));
        markSheet5.add(new MarkSheet(3,100,38));
        markSheet5.add(new MarkSheet(5,100,41));
        markSheet5.add(new MarkSheet(4,100,88));

        students.add(new Student(1,"jayesh",markSheet1));
        students.add(new Student(1,"Suresh",markSheet2));
        students.add(new Student(1,"Raju",markSheet3));
        students.add(new Student(4,"Rancho",markSheet4));
        students.add(new Student(5,"Aamir",markSheet5));


        List<Student> studentsList = students.stream()
                .filter(student -> {

                    int totalMarkObtained = student.getMarkSheetList().stream()
                            .mapToInt(MarkSheet::getMarksObtainByStudent).sum();

                    int totalMarks = student.getMarkSheetList().stream()
                            .mapToInt(MarkSheet::getMaximumMarksPerSubject).sum();

                    double percentage = (totalMarkObtained * 100.0)/totalMarks;

                    return percentage > 10;
                })

                .collect(Collectors.toList());


        //System.out.println(studentsList);
        findAverage(students);
    }


    public static void findAverage(List<Student> studentList){

        Map<Integer,Double> studentAvg =  studentList.stream().collect(Collectors.groupingBy(Student::getId,Collectors.averagingDouble(
                    student -> {

                        double avg = 0;

                        int totalMarksObtain = student.getMarkSheetList().stream()
                                .mapToInt(MarkSheet::getMarksObtainByStudent).sum();


                        int totalMarksByPerSubject = student.getMarkSheetList().stream()
                                .mapToInt(MarkSheet::getMaximumMarksPerSubject).sum();



                        return  (totalMarksObtain/totalMarksByPerSubject) * 100;
                    }

            )));

        studentAvg.entrySet().stream().forEach(stu -> System.out.println(stu.getKey()+ " : "+ stu.getValue()));

    }
}
