package Methods;

import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {

//        System.out.println("Задача 1");
        isLeapYear(2021);

//        System.out.println("Задача 2");
        operatingSystem(1, 2015);

//        System.out.println("Задача 3");
        cardDelivery(95);

//        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        reverseName(reverseFullName);

//        System.out.println("Задача 5");
        String findDuplicates = "aabccddefgghiijjkk";
        findDuplicates(findDuplicates);

//        System.out.println("Задача 6");
        int[] arr = generateRandomArray();
        averageSum(arr);
    }

    public static double averageSum(int[] arr) {
        System.out.println("Задача 6");
        double sum = 0;
        double month = 30;
        double average = 0;
        for (int i = 0; i < month; i++) {
            sum = sum + arr[i];
            average = sum / month;
        }
        System.out.printf("Средняя сумма трат за месяц составила %.0f рублей", average);
        System.out.println();
        return average;
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void findDuplicates(String findDuplicates) {
        System.out.println("Задача 5");
        for (int i = 0; i < findDuplicates.length() - 1; i++) {
            char[] ch = findDuplicates.toCharArray();
            if (ch[i] != ch[i + 1]) {
                System.out.println("There are no duplicates in the string");
            } else {
                System.out.print(ch[i]);
                break;
            }
        }
        System.out.println();
    }

    public static void reverseName(char[] reverseFullName) {
        System.out.println("Задача 4");
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }

    public static int cardDelivery(int deliveryDistance) {
        System.out.println("Задача 3");
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
        return deliveryDay;
    }

    public static void operatingSystem(int clientOS, int clientDeviceYear) {
        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
    }

    public static void isLeapYear(int year) {
        System.out.println("Задача 1");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();
    }
}