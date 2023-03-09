package Course_1.medium;

import java.util.Objects;

public class Employee {
    private final String fullName;
    private int department;
    private int salary;
    private int id;
    private static int counter = 1;


    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public int getCounter() {
        return counter;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && counter == employee.counter && Objects.equals(fullName, employee.fullName);
    }


    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, counter);
    }


    @Override
    public String toString() {
        return "Employee " +
                "full name is " + fullName +
                ", department is " + department +
                ", salary is " + salary +
                ", id is " + counter;
    }
}


