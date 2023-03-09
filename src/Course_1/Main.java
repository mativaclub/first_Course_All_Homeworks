package Course_1;

import java.util.Arrays;

public class Main {

    public static void addEmployee(Employee[] employee, Employee newEmployee) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                employee[i] = newEmployee;
                break;
            }
        }
    }

    public static void listOfEmployees(Employee[] employees) {
        System.out.println("List of all employees");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println("Full Name is: " + employees[i].getFullName() + ", department is: " +
                        employees[i].getDepartment() + ", salary is: " +
                        employees[i].getSalary() + ", id is: " + employees[i].getCounter());
            }
        }
        System.out.println();
    }

    public static void monthlySalaryExpenses(Employee[] employee) {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum = sum + employee[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц составляет " + sum);
        System.out.println();
    }

    public static void minSalary(Employee[] employee) {
        System.out.println("Найти сотрудника с минимальной зарплатой");
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() < min) {
                min = employee[i].getSalary();
            }
            System.out.println("Сумма минимальной зарплаты в месяц составляет " + min +
                    " и это сотрудник " + employee[i].getCounter());
            System.out.println();
            break;
        }
    }

    public static void maxSalary(Employee[] employee) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() > max) {
                max = employee[i].getSalary();
            }
            System.out.println("Сумма минимальной зарплаты в месяц составляет " + max +
                    " и это сотрудник " + employee[i].getCounter());
            System.out.println();
            break;
        }
    }

    public static void averageSalary(Employee[] employee) {
        float sum = 0;
        float average = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum = sum + employee[i].getSalary();
            }
            average = sum / employee.length;
            System.out.println("Средняя сумма затрат на зарплаты в месяц составляет " + average);
            System.out.println();
            break;
        }
    }

    public static void printAllEmployees(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println("Ф. И. О. сотрудникa " + employee[i].getFullName() + " ");
            }
            System.out.println(employee[i] + " ");
        }

    }


    public static void main(String[] args) {

        Employee[] employee = new Employee[10];
        addEmployee(employee, new Employee("Галилео Галилей", 1, 50000));
        addEmployee(employee, new Employee("Леонардо да Винчи", 2, 60000));
        addEmployee(employee, new Employee("Альберт Эйнштейн", 3, 70000));
        addEmployee(employee, new Employee("Мария Склодовская-Кюри", 4, 80000));
        addEmployee(employee, new Employee("Никола Тесла", 5, 90000));


//        System.out.println("List of all employees");
        listOfEmployees(employee);


//        System.out.println("Посчитать сумму затрат на зарплаты в месяц");
        monthlySalaryExpenses(employee);


//        System.out.println("Найти сотрудника с минимальной зарплатой");
        minSalary(employee);


//        System.out.println("Найти сотрудника с максимальной зарплатой");
        maxSalary(employee);


//        System.out.println("Подсчитать среднее значение зарплат");
        averageSalary(employee);


//        System.out.println("Получить Ф. И. О. всех сотрудников");
        printAllEmployees(employee);





    }
}