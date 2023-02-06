package Cycles.part1;

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
        task9();
        task10();
        task11();
        task12();

    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        int startYear = 1904;
        int endYear = 2096;
        for (int i = startYear; i <= endYear; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + " is leap year");
            }
        }
        System.out.println();

    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 8");
        int sum = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + sum;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
    }

    public static void task9() {
        System.out.println("Задача 9");
        double sum = 29000;
        double total = 0;
        double monthlyPercent = 0.01f;
        for (int i = 1; i <= 12; i++) {
            sum = sum + (sum * monthlyPercent);
            total = total + sum;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + Math.ceil(total) + " рублей");
        }
        System.out.println();
    }

    public static void task10() {
        System.out.println("Задача 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + i * 2);
        }
        System.out.println();
    }

    public static void task11() {
        System.out.println("Задача 11");
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
            } else if (i % 3 == 0) {
                System.out.println(i + ": ping");
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");
            } else {
                System.out.println(i + ": ");
            }
        }
        System.out.println();
    }

    public static void task12() {
        System.out.println("Задача 12");
        int previous = 0;
        int next = 1;
        System.out.print(previous + " " + next);
        for (int i = 1; i < 9; i++) {
            int temp = previous + next;
            previous = next;
            next = temp;
            System.out.print(" " + next);
        }
        System.out.println();
    }
}