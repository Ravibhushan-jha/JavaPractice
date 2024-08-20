package Interview.StreamAPI.ComplexOperation;

import java.util.List;

public class Student {

    private int id;
    private String name;

    private List<MarkSheet> markSheetList;

    public Student(int id, String name, List<MarkSheet> markSheetList) {
        this.id = id;
        this.name = name;
        this.markSheetList = markSheetList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MarkSheet> getMarkSheetList() {
        return markSheetList;
    }

    public void setMarkSheetList(List<MarkSheet> markSheetList) {
        this.markSheetList = markSheetList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", markSheetList=" + markSheetList +
                '}';
    }
}
