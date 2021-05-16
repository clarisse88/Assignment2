package za.ac.cput;

import java.util.Objects;

public class Employee {
    private int empId;
    private String empName;
    private String empSurname;
    private int age;
    private String gender;

    public Employee(int empId, String empName, String empSurname,int age, String gender) {
        this.empId = empId;
        this.empName = empName;
        this.empSurname = empSurname;
        this.age = age;
        this.gender = gender;
    }

    public Employee(int empId, String empName) {
    }

    public int getEmpId() {

        return empId;
    }

    public void setEmpId(int empId) {

        this.empId = empId;
    }

    public String getEmpName() {

        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSurname() {
        return empSurname;
    }

    public void setEmpSurname(String empSurname) {
        this.empSurname = empSurname;
    }

    public int getAge() {

        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {

        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getEmpId() == employee.getEmpId();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getEmpId());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSurname='" + empSurname + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}