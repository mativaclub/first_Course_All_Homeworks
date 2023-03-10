package Course_1.hard;

public class Main {

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook(10);
        employeeBook.addEmployee(new Employee("Галилео Галилей", 1, 50000));
        employeeBook.addEmployee(new Employee("Леонардо да Винчи", 2, 60000));
        employeeBook.addEmployee(new Employee("Альберт Эйнштейн", 3, 10000));
        employeeBook.addEmployee(new Employee("Мария Склодовская-Кюри", 4, 80000));
        employeeBook.addEmployee(new Employee("Никола Тесла", 5, 90000));
        employeeBook.addEmployee(new Employee("Илон Маск", 1, 20000));
        employeeBook.addEmployee(new Employee("Джеф Безос", 2, 30000));
        employeeBook.addEmployee(new Employee("Джек Ма", 3, 40000));
        employeeBook.addEmployee(new Employee("Юрий Гагарин", 4, 70000));
        employeeBook.addEmployee(new Employee("Нил Армстронг", 5, 100000));


        employeeBook.listOfEmployees(1);

        employeeBook.monthlySalaryExpenses(2);

        employeeBook.minSalary(3);

        employeeBook.maxSalary(4);

        employeeBook.averageSalary(5);

        employeeBook.salaryIndexing(2, 100);

        employeeBook.employeesWithSalaryLessThenNumber(50000);

        employeeBook.employeesWithSalaryMoreThenNumber(50000);

        employeeBook.deleteEmployee(1);

        employeeBook.listOfEmployees(1);

        employeeBook.addEmployee(new Employee("Richard Branson", 1, 75000));

        employeeBook.listOfEmployees(1);

        employeeBook.getAllEmployeesByDepartment();

        employeeBook.changeEmployeeDepartment("Richard Branson", 50000, 2);
    }
}