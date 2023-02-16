package Arrays.part2;

import java.util.Arrays;

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


    }


    private static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        int month = 30;
        for (int i = 0; i < month; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
    }

    private static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int min = 0;
        int max = Integer.MIN_VALUE;
        int month = 30;
        for (int i = 0; i < month; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < max) {
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        float sum = 0;
        float month = 30;
        float average = 0;
        for (int i = 0; i < month; i++) {
            sum = sum + arr[i];
            average = sum / month;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        System.out.println();
    }

    private static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }

    private static void task5() {
        System.out.println("Задача 5");
        int[][] array2D = new int[3][3];
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    array2D[i][j] = 1;
                } else {
                    array2D[i][j] = 0;
                }
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Задача 5");
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    private static void task6() {
        System.out.println("Задача 6");
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length - i - 1];
        }
        System.out.println(Arrays.toString(temp));
        System.out.println();
    }

    private static void task7() {
        System.out.println("Задача 7");
        int[] arr = {5, 4, 3, 2, 1};
        int rightIndex = arr.length - 1;
        int leftIndex = 0;
        int temp;
        while (leftIndex < rightIndex) {
            temp = arr[leftIndex];
            arr[leftIndex] = arr[rightIndex];
            arr[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    private static void task8() {
        System.out.println("Задача 8");
        int[] num = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(num);
        int leftIndex = 0;
        int sum;
        int rightIndex = num.length - 1;
        while (leftIndex < rightIndex) {
            sum = num[leftIndex] + num[rightIndex];
            if (sum == -2) {
                System.out.println(num[leftIndex] + " + " + num[rightIndex] + " = " + sum);
                break;
            } else if (sum > -2) {
                rightIndex--;
            } else {
                leftIndex++;
            }

            System.out.println();
        }
//        int[] num = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
//        Arrays.sort(num);
//        System.out.println(Arrays.toString(num));
//        int sum = -2;
//        int leftIndex = 0;
//        int rightIndex = num.length-1;
//        while (leftIndex < rightIndex) {
//            if (num[leftIndex] + num[rightIndex] == sum) {
//                System.out.println(num[leftIndex] + " + " + num[rightIndex] + " = " + sum);
//                break;
//            } else {
//
//            }
//            System.out.println();
//        }
////            int leftIndex = num[0];
////            int rightIndex = num[i+1];

    }

    private static void task9() {
        System.out.println("Задача 9");
        int[] array = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int numberToFind = -2;
        Arrays.sort(array);
        int first = 0;
        int last = array.length - 1;
        while (first < last) {
            int sum1 = array[first] + array[last];
            if (sum1 == numberToFind) {
                System.out.println("Found " + array[first++] + " and " + array[last--]);
            } else if (sum1 > numberToFind) {
                last--;
            } else {
                first++;
            }
        }


//        int[] nums = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
//        int sum;
//        int leftIndex = 0;
//        int rightIndex = nums.length - 1;
//        for (int i = 0; i < nums.length; i++) {
//            sum = nums[leftIndex] + nums[rightIndex];
//            if (sum == -2) {
//                System.out.println(nums[leftIndex++] + " + " +nums[rightIndex--] + " = " + sum);
//            } else if (sum > -2) {
//                leftIndex++;
//            } else {
//                rightIndex--;
//            }
//            System.out.println();
//        }


        System.out.println("Задача 9, версия 2");
        int[] num = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(num);
        int sumToFind = -2;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] + num[j] == sumToFind) {
                    System.out.println(num[i] + " + " + num[j] + " = " + sumToFind);
                }
            }
        }
        System.out.println();
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


}