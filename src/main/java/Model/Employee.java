package Model;

import java.util.Objects;

public class Employee {

    private String name;
    private Long mobileNo;
    private int id;

    public Employee(String name, Long mobileNo, int id) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.id = id;
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", mobileNo=" + mobileNo +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name) && Objects.equals(mobileNo, employee.mobileNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mobileNo, id);
    }
}
