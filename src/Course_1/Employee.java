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

    //
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return Float.compare(employee.salary, salary) == 0 && department == employee.department && id == employee.id && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(middleName, employee.middleName);
//    }
    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, counter);
    }

    //
//    @Override
//    public int hashCode() {
//        return Objects.hash(firstName, lastName, middleName, salary, department, id);
//    }
//}
    @Override
    public String toString() {
        return "Employee " +
                "full name is " + fullName +
                ", department is " + department +
                ", salary is " + salary +
                ", id is " + counter;
    }
}

//
//    @Override
//    public String toString() {
//        return "FirstName: " + firstName + ",  LastName: " + lastName + ",  MiddleName: "
//                + middleName + ",  Salary: " + salary + ", Department: " + department + ", ID: " + id;
//    }


//
//    //7.Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников
//    // на величину аргумента в %).
//
//    //8.Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):
//    //8.1. Сотрудника с минимальной зарплатой.
//    //8.2. Сотрудника с максимальной зарплатой.
//    //8.3. Сумму затрат на зарплату по отделу.
//    //8.4. Среднюю зарплату по отделу (учесть, что количество людей в
//    // отделе отличается от employees.length).
//    //8.5. Проиндексировать зарплату всех сотрудников отдела на процент,
//    // который приходит в качестве параметра.
//    //9. Напечатать всех сотрудников отдела (все данные, кроме отдела).
//    //Получить в качестве параметра число и найти:
//    //9.1. Всех сотрудников с зарплатой меньше числа
//    // (вывести id, Ф. И. О. и зарплатой в консоль).
//    //9.2. Всех сотрудников с зарплатой больше (или равно)
//    // числа (вывести id, Ф. И. О. и зарплатой в консоль).
//
//    //С помощью **шести** методов можно вывести данные:
//    //
//    //- сотрудник с минимальной зарплатой,
//    //- сотрудник с максимальной зарплатой,
//    //- сумма затрат на зарплату по отделу,
//    //- средняя зарплата по отделу,
//    //- индексация зарплаты на %,
//    //- печать всех данных всех сотрудников одного отдела, кроме номера отдела.
//
//
//
//    public static void printEmployees(Employee[] employees) {
//        System.out.println("List of All employees");
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i] != null) {
//            System.out.println(employees[i].toString());
//        }else if (employees[i] == null) {
//                System.out.println("EMPTY");
//            }
//    }
//    }
//
//    public static void main(String[] args) {
//
//        Employee[] employees = new Employee[10];
//        addEmployee(employees, new Employee("Ivan", "Ivanov", "Ivanovich", 100000, 1));
//        addEmployee(employees, new Employee("Pavel", "Pavlov", "Pavlovich", 20000, 2));
//        addEmployee(employees, new Employee("Oleg", "Ivanov", "Olegovich", 30000, 3));
//        addEmployee(employees, new Employee("Ruslan", "Ruslanov", "Ruslanovich", 40000, 4));
//        addEmployee(employees, new Employee("Denis", "Denisov", "Denisovich", 50000, 5));
//        addEmployee(employees, new Employee("Karina", "Markovna", "Olegovna", 60000, 1));
//        addEmployee(employees, new Employee("Kristina", "Mikhalkova", "Ivanovna", 70000, 2));
//        addEmployee(employees, new Employee("Anna", "Petrova", "Pavlovna", 80000, 3));
//        addEmployee(employees, new Employee("Marina", "Ivanova", "Ruslanovna", 90000, 4));
//        addEmployee(employees, new Employee("Diana", "Pavlova", "Denisovna", 250000, 5));
