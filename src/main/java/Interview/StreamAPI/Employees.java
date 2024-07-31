package Interview.StreamAPI;

import java.util.Objects;

public class Employees {
    private String name;
    private Long mobileNo;
    private int id;

    private double salary;

    private String department;

    public Employees(String name, Long mobileNo, int id, double salary, String department) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return id == employees.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", mobileNo=" + mobileNo +
                ", id=" + id +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
