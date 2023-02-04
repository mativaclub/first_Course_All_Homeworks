package Conditions.part2;

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
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        int clientOS = 0;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 4;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + ++deliveryDay);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (++deliveryDay + 1));
        } else {
            System.out.println("доставки нет");
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNum = 1;
        switch (monthNum) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Error");
        }

        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 6");
        int age = 19;
        int salary = 88_000;
        double creditLimit = 1;
        if (age >= 23) {
            creditLimit = salary * 3;
        } else if (age < 23) {
            creditLimit = salary * 2;
        }
        if (salary >= 50_000) {
            creditLimit = creditLimit * 1.2;
        } else if (salary >= 80_000) {
            creditLimit = creditLimit * 1.5;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + creditLimit + " рублей");
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");
        int age = 23;
        int salary = 60_000;
        int wantedSum = 330_000;
        int duration = 12;
        double basePercent = 0.1;
        int maxMonthlyPayment = salary / 2;
        if (age <= 23) {
            basePercent = basePercent + 0.01;
        } else if (age <= 30) {
            basePercent = basePercent + 0.05;
        } else if (salary > 80_000) {
            basePercent = basePercent - 0.07;
        }
        double monthlyPayment = (wantedSum * basePercent) / duration;
        if (monthlyPayment < maxMonthlyPayment) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment
                    + " рублей. Платеж по кредиту " + monthlyPayment + " рублей. Одобрено");
        } else if (monthlyPayment > maxMonthlyPayment) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment
                    + " рублей. Платеж по кредиту " + monthlyPayment + " рублей. Отказано");
        }
        System.out.println();
    }


}