package Arrays.additional_javarush;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        matrixNumPlaceChange();
//        pyramid();
//        erasingMiddleOfNumberBox();
//        chess();
//        rectangle();
//        fromArray1DTo2D();

    }

    private static void fromArray1DTo2D() {
        int[] arr1 = new int[9];   //создание одномерного массива
        for (int i = 0; i < arr1.length; i++) {
            if (i % 2 == 0) {
                arr1[i] = 1;        //заполнение массива 1 и 0
            }
        }
        System.out.println(Arrays.toString(arr1));
        int[][] arr2 = new int[3][3];  //создание двумерного массива на 9 элементов
        int k = 0;                      //счетчик элементов первого массива
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = arr1[k];   //пробегаем по массиву и присваиваем соответствующие значения.
                k++;                    // увеличиваем счетчик на 1
                System.out.print(arr2[i][j] + " "); //вывод элементов строк матрицы
            }
            System.out.println();                   //переход между строками матрицы
        }
        System.out.println();
    }

    private static void rectangle() {
        char[][] array = new char[5][6];
        Arrays.fill(array[0], 'X');
        Arrays.fill(array[1], 'X');
        Arrays.fill(array[1], 1, 5, ' ');
        Arrays.fill(array[2], 'X');
        Arrays.fill(array[2], 1, 5, ' ');
        Arrays.fill(array[3], 'X');
        Arrays.fill(array[3], 1, 5, ' ');
        Arrays.fill(array[4], 'X');
    }

    private static void chess() {
        Scanner scanner = new Scanner(System.in);
        char[][] array;
        int number = scanner.nextInt();
        array = new char[number][number];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    private static void erasingMiddleOfNumberBox() {
        char[][] chars = {
                {'a', 'b', 'c', 'd', 'e', 'f'},
                {'j', 'h', 'i', 'j', 'k', 'l'},
                {'m', 'n', 'o', 'p', 'q', 'r'},
                {'s', 't', 'u', 'v', 'w', 'x'}};

        for (int i = 1; i < chars.length - 1; i++) {
            for (int j = 1; j < chars[i].length - 1; j++) {
                chars[i][j] = '-';
            }
        }
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                System.out.print(chars[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void pyramid() {
        Scanner scanner = new Scanner(System.in);
        char[][] array;
        int number = scanner.nextInt();
        array = new char[number][number + (number - 1)];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j < array.length - i - 1 || j > array[i].length - array.length + i) {
                    array[i][j] = ' ';
                } else {
                    array[i][j] = '$';
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    private static void matrixNumPlaceChange() {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


}
