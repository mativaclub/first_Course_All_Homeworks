package Cycles.part2;

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

    }


    public static void task1() {
        System.out.println("Задача 1");
        int sum = 0;
        int deposit = 15000;
        int month = 1;
        int wantedSum = 2_459_000;
        while (sum < wantedSum) {
            sum = sum + deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            month++;
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        int num = 1;
        while (num <= 10) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birth = 17;
        int death = 8;
        int average = birth - death;
        int currentYear = 2022;
        int tenYearsLater = currentYear + 10;
        for (int i = currentYear; i <= tenYearsLater; i++) {
            population = population + ((population / 1000) * average);
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }


    public static void task4() {
        System.out.println("Задача 4");
        float deposit = 15000;
        int month = 1;
        float percent = 0.07f;
        int wantedSum = 12_000_000;
        while (deposit < wantedSum) {
            deposit = deposit + (deposit * percent);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
            month++;
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        float deposit = 15000;
        int month = 1;
        float percent = 0.07f;
        int wantedSum = 12_000_000;
        while (deposit < wantedSum) {
            deposit = deposit + (deposit * percent);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
            }
            month++;
        }
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 6");
        float deposit = 15000;
        int monthsFor9Years = 108;
        float percent = 0.07f;
        for (int i = 1; i <= monthsFor9Years; i++) {
            deposit = deposit + (deposit * (percent));
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit / 2 + " рублей");
            }
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 5; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 8");
        int cometYear = 79;
        int currentYear = 2022;
        int past200Years = currentYear - 200;
        int next100Years = currentYear + 100;
        for (int i = past200Years; i < next100Years; i++) {
            if (i % cometYear == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
    }

    public static void task9() {
        System.out.println("Задача 9");
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

    public static void task10() {
        System.out.println("Задача 10");
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