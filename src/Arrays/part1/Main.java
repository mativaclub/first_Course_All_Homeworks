package Arrays.part1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    private static void task4() {
        System.out.println("Задача 4");
        int[] arrayInt = new int[]{1, 2, 3};
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 != 0) {
                arrayInt[i] = arrayInt[i] + 1;
            }
        }
        System.out.print(Arrays.toString(arrayInt));
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задача 3");
        int[] arrayInt = new int[]{1, 2, 3};
        double[] arrayDouble = {1.57, 7.654, 9.986};
        int[] arr = {3, 2, 1};
        for (int i = arrayInt.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arrayInt[i]);
            } else {
                System.out.print(arrayInt[i] + ", ");
            }
        }
        System.out.println();
        for (int i = arrayDouble.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arrayDouble[i]);
            } else {
                System.out.print(arrayDouble[i] + ", ");
            }
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }

    private static void task2() {
        System.out.println("Задача 2");
        int[] arrayInt = new int[]{1, 2, 3};
        double[] arrayDouble = {1.57, 7.654, 9.986};
        int[] arr = {3, 2, 1};
        for (int i = 0; i < arrayInt.length; i++) {
            if (i == arrayInt.length - 1) {
                System.out.print(arrayInt[i]);
            } else {
                System.out.print(arrayInt[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arrayDouble.length; i++) {
            if (i == arrayDouble.length - 1) {
                System.out.print(arrayDouble[i]);
            } else {
                System.out.print(arrayDouble[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }

    private static void task1() {
        System.out.println("Задача 1");
        int[] arrayInt = new int[];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;
        double[] arrayDouble = {1.57, 7.654, 9.986};
        int[] arr = {3, 2, 1};
        System.out.println();
    }
}


