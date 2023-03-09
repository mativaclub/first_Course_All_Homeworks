package Course_1;

import java.util.Objects;

public class Employee {
    private final String fullName;
    private int department;
    private int salary;
    private static int id; // Добавить статическую переменную-счетчик, которая будет отвечать за id.
    private int counter = 0; //поле id проставляется из счетчика, а затем счетчик увеличивает свое значение.

    //    6.все поля должны передавать через конструктор (кроме id) и заполняться в нем
    //    (включая id, который нужно получить из счетчика).
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

    public static int getId() {
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

    //    public static int getId() {
//        return 0;
//    }
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


