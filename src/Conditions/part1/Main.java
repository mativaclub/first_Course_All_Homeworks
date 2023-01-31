package Conditions.part1;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 16;
        if (age >= 18) {
            System.out.println("Возраст человека равен " + age + ", он совершеннолетний");
        } else {
            System.out.println("Возраст человека равен " + age + ", он не достиг совершеннолетия, " +
                    "нужно немного подождать");
        }
        System.out.println();
    }


    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 3;
        int temp = 5;
        if (temperature < temp) {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        System.out.println();
    }


    public static void task3() {
        System.out.println("Задача 3");
        int speedLimit = 60;
        int currentSpeed = 55;
        if (currentSpeed > speedLimit) {
            System.out.println("Если скорость " + currentSpeed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + currentSpeed + " км/ч, то можно ездить спокойно");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 25;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 15;
        if (age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age > 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе" +
                    " в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе" +
                    " без сопровождения взрослого");
        }
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 6");
        int trainCarriage = 102;
        int sit = 60;
        int stand = trainCarriage - sit; // 42
        if (sit < 60) {
            System.out.println("There are sitting places available");
        } else if (stand < 42) {
            System.out.println("There are standing places available");
        } else {
            System.out.println("The train is full");
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Number " + one + " is bigger");
        } else if (two > one && two > three) {
            System.out.println("Number " + two + " is bigger");
        } else if (three > two && three > one) {
            System.out.println("Number " + three + " is bigger");
        } else {
            System.out.println("Numbers are equal");
        }
        System.out.println();
    }

}