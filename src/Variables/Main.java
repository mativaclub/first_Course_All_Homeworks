package Variables;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0 + 4;
        var cat = 3.6 + 4;
        var paper = 763789 + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0 - 3.5;
        var cat = 3.6 - 1.6;
        var paper = 763789 - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

    }

    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

    }

    public static void task6() {
        System.out.println("Задача 6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Total weight of boxers is " + totalWeight);
        var weightDifference =(firstBoxer - secondBoxer) * -1 ;
        System.out.println("Weight difference of boxers is " + weightDifference);
    }

    public static void task7() {
        System.out.println("Задача 7");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var weightDifferenceWithMinus = secondBoxer - firstBoxer;
        System.out.println("Weight difference of boxers is " + weightDifferenceWithMinus);
        var weightDifference = secondBoxer % firstBoxer;
        System.out.println("Weight difference of boxers is " + weightDifference);
    }

    public static void task8() {
        System.out.println("Задача 8");
        var totalWorkingHours = 640;
        var employeesWorkingHours = 8;
        var employeesOfCompany = totalWorkingHours / employeesWorkingHours;
        System.out.println("Всего работников в компании — " + employeesOfCompany + " человек");
        var newEmployees = 94;
        var allEmployees = employeesOfCompany + newEmployees;
        var newTotalWorkingHours = allEmployees * employeesWorkingHours;
        System.out.println("Если в компании работает " + allEmployees + " человек, то всего "
                + newTotalWorkingHours + " часов работы может быть поделено между сотрудниками");


    }

    }
