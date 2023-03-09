package Course_1;

import java.util.Arrays;

public class Main {

    public static void addEmployee(Employee[] employee, Employee newEmployee) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                employee[i] = newEmployee;
            } else {
                System.out.println("the list is full");
            }
        }
    }

    public static void listOfEmployees(Employee[] employees) {
        System.out.println("List of all employees");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName() + " " + employees[i].getDepartment() + " " +
                        employees[i].getSalary() + " " + employees[i].getCounter());
            }
        }
    }

    //    public static void printAllEmployees(Employee[] employees) {
//        System.out.println("List of All employees");
//        for (Employee employee : employees) {
//            if (employee != null) {
//                System.out.println(employee);
    public static int monthlySalaryExpenses(Employee[] employee) {
        System.out.println("Посчитать сумму затрат на зарплаты в месяц");
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum = sum + employee[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц составляет " + sum);
        return sum;
    }

    public static int minSalary(Employee[] employee) {
        System.out.println("Найти сотрудника с минимальной зарплатой");
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() < min) {
                min = employee[i].getSalary();
            }
            System.out.println("Сумма минимальной зарплаты в месяц составляет " + min +
                    " и это сотрудник " + employee[i].getCounter());
        }

        return min;
    }

    public static int maxSalary(Employee[] employee) {
        System.out.println("Найти сотрудника с максимальной зарплатой");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() > max) {
                max = employee[i].getSalary();
            }
            System.out.println("Сумма минимальной зарплаты в месяц составляет " + max +
                    " и это сотрудник " + employee[i].getCounter());
        }
        return max;
    }

    public static float averageSalary(Employee[] employee) {
        System.out.println("Подсчитать среднее значение зарплат");
        float sum = 0;
        float average = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum = sum + employee[i].getSalary();
            }
            average = sum / employee.length;
            System.out.println("Средняя сумма затрат на зарплаты в месяц составляет " + average);
        }
        return average;

    }

    public static void printAllEmployees(Employee[] employee) {
        System.out.println("Получить Ф. И. О. всех сотрудников");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println("Ф. И. О. сотрудникa " + employee[i].getFullName() + " ");
            }
            System.out.println(employee[i] + " ");
        }

    }


    public static void main(String[] args) {

//7. Создать поле типа Employee[10], выполнять роль «хранилища» для записей о сотрудниках.
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


//- **Повышенная сложность**
//    Создать дополнительные статические методы для решения следующих задач.
//    1. Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
//    2. Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):
//        1. Сотрудника с минимальной зарплатой.
//        2. Сотрудника с максимальной зарплатой.
//        3. Сумму затрат на зарплату по отделу.
//        4. Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length).
//        5. Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
//        6. Напечатать всех сотрудников отдела (все данные, кроме отдела).
//    3. Получить в качестве параметра число и найти:
//        1. Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
//        2. Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).
//
//    - Критерии оценки
//        – С помощью **шести** методов можно вывести данные:
//        - сотрудник с минимальной зарплатой,
//        - сотрудник с максимальной зарплатой,
//        - сумма затрат на зарплату по отделу,
//        - средняя зарплата по отделу,
//        - индексация зарплаты на %,
//        - печать всех данных всех сотрудников одного отдела, кроме номера отдела.
//        – Реализован параметр поиска всех сотрудников с зарплатой больше определенного числа, которое можно указать.
//        – Реализован параметр поиска всех сотрудников с зарплатой меньше определенного числа, которое можно указать.
//        – Программа работает корректно при изменении любых данных о сотрудниках и выводит верный результат.


//- **Очень сложно**
//    Привести структуру проекта к ООП.
//    1. Создать класс EmployeeBook.
//    2. Перенести хранилище сотрудников в него (массив), закрыть к нему доступ извне (сделать приватным).
//    3. Все статические методы по работе с массивом перенести в этот класс и сделать нестатическими.
//    4. Добавить несколько новых методов:
//        1. Добавить нового сотрудника (создаем объект, заполняем поля, кладем в массив).
//        Нужно найти свободную ячейку в массиве и добавить нового сотрудника в нее. Искать нужно всегда с начала, так как возможно добавление в ячейку удаленных ранее сотрудников.
//        2. Удалить сотрудника (находим сотрудника по Ф. И. О. и/или id, обнуляем его ячейку в массиве).
//    5. Изменить сотрудника (получить сотрудника по Ф. И. О., модернизировать его запись):
//        1. Изменить зарплату.
//        2. Изменить отдел.
//        Придумать архитектуру. Сделать или два метода, или один, но продумать его.
//    6. Получить Ф. И. О. всех сотрудников по отделам (напечатать список отделов и их сотрудников).

//    - Критерии оценки
//        – Создан класс EmployeeBook.
//        – Данные о сотрудниках перенесены в класс EmployeeBook.
//        – Реализованы метод добавления нового сотрудника.
//        – Реализован метод удаления сотрудника.
//        – Реализован метод изменения зарплаты сотрудника.
//        – Реализован метод изменения отдела.


//    | 1 | Дайте определение переменной. Перечислите типы переменных и хранимые в них данные |
//    | 2 | Какие условные операторы вы знаете? Дайте краткое определение каждому из них. |
//    | 3 | Какие циклы вы знаете, в чем их отличия? |
//    | 4 | Какие есть способы создания объекта String? Где он создается? |
//    | 5 | Как сравнить две строки в Java и/или отсортировать их? |
//    | 6 | Расскажите про String в Java |
//    | 7 | Когда применяется цикл while? |
//    | 8 | Методы каких типов бывают? Приведите примеры использования каждого типа. |
//    | 9 | Что такое массив? |
//    | 10 | Почему доступ по элементу в массиве происходит за O(1)? |
//    | 11 | Дайте определение классу в Java.  |
//    | 12 | Когда применяется ключевое слово this? |
//    | 13 | В чем разница между == и equals()? |
//    | 14 | Для чего применяется метод toString? |
//    | 15 | Какие методы называются геттерами? Что они делают? |
//    | 16 | Дайте определение сеттерам. Расскажите, для чего они нужны? |
//    | 17 | Что такое конструкторы? |
//    | 18 | Что такое сигнатура метода? |
//    | 19 | Какая функция у оператора return? |
//    | 20 | Что такое область видимости? |

//- Представьтесь, скажите, как вас зовут, назовите номер билета
//- Отдельным видео запишите ответы на теоретические вопросы из билета
//- Отдельным видео запишите ход решения задачи из билета
//- Пришлите ссылку на PR решенного задания в GitHub.

//Во время проверки наставник будет оценивать ваш ответ и глубину знаний.
// В данном задании наставники будут обращать внимание на ваш внешний вид и качество звука,

//Выделите себе не больше 2х минут для ответа на каждый вопрос, чтобы уложиться в общий тайминг.

//    1. Рекомендуем привести себя в порядок перед интервью. Вы должны выглядеть аккуратно.
//    2. Записывайте видео, когда в комнате никого нет.
//    Дети, семья, друзья, родители и домашние питомцы не должны отвлекать вас от ответов
//    и тем более появляться перед камерой.
//При ответах на технические вопросы сначала проговорите сам вопрос, на который собираетесь отвечать,
// а после этого озвучьте ответ.

//Будет плюсом, но необязательно, если в качестве демонстрации знаний вы напишите короткий код,
// иллюстрирующий ваш пример или дополняющий объяснение.

// Прежде чем приступать к решению задачи, озвучьте её условие и как вы поняли, что необходимо сделать.
//В условиях задач отсутствуют примеры данных, с которыми нужно работать.
// Придумайте их самостоятельно, если необходимо.
//
//В части задач есть условие, что задание необходимо выполнить в блокноте или просто редакторе Google-док.
// Это обязательное условие выполнения задачи. Если вы не можете этого сделать,
// то сообщите об этом в самом начале видео и выполняйте задание так, как можете.
// За невыполнение данного условия снижается балл.
//В видео вам нужно записать, как вы пишете код для решения задачи, то есть записать шеринг экрана.
//Будет плюсом, но необязательно, если вы добавите комментарии, чем выбранный вами ход решения лучше, чем другие.


    }
}