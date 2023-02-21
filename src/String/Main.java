package String;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


//        task1();
//        task2();
//        task3();
//        task5();
//        task6();
//        task7();
//        task8();

    }

    private static void task8() {
        System.out.println("Задача 8");
        String findDuplicates = "aabccddefgghiijjkk";
        for (int i = 0; i < findDuplicates.length() - 1; i++) {
            char[] ch = findDuplicates.toCharArray();
            if (ch[i] == ch[i + 1]) {
                System.out.print(ch[i]);
            }
        }
        System.out.println();
    }

    private static void task7() {
        System.out.println("Задача 7");
        String first = "135";
        String second = "246";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < first.length(); i++) {
            sb.append(first.charAt(i));
            sb.append(second.charAt(i));
        }
        System.out.print("Данные строки — " + sb);
        System.out.println();
    }

    private static void task6() {
        System.out.println("Задача 6");
        String fullName = "ivanov ivan ivanovich";
        String[] splitName = fullName.split(" ");
        System.out.print("Верное написание Ф. И. О. сотрудника с заглавных букв —  ");
        for (int i = 0; i < splitName.length; i++) {
            char[] nameToChar = splitName[i].toCharArray();
            nameToChar[0] = Character.toUpperCase(nameToChar[0]);
            System.out.print(String.valueOf(nameToChar) + " ");
        }
        System.out.println();
    }

    private static void task5() {
        System.out.println("Задача 5");
        String fullName = "Ivanov Ivan Ivanovich";
        int firstSpaceIndex = fullName.indexOf(" ");
        int lastSpaceIndex = fullName.lastIndexOf(" ");
        String firstName = fullName.substring(0, firstSpaceIndex);
        String lastName = fullName.substring(firstSpaceIndex + 1, lastSpaceIndex);
        String middleName = fullName.substring(lastSpaceIndex + 1);

        System.out.println("ФИО сотрудника — " + String.join(" ", firstName, lastName, middleName));
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName);
        System.out.println();

//        System.out.println("Задача 3.1");
//        String fullName1 = "Иванов Семён Семёнович";
//        int firstIndex = fullName1.indexOf('ё');
//        int lastIndex = fullName1.lastIndexOf('ё');
//        char letterToReplace = 'е';
//        fullName1 = fullName1.replace((char) firstIndex, 'е');
//        fullName1 = fullName1.replace((char) lastIndex, letterToReplace);
//        System.out.println("Данные ФИО сотрудника — " + fullName1);
//        System.out.println();


        System.out.println("Задача 3.2");
        String fullName2 = "Иванов Семён Семёнович";
        String[] nameArray2 = fullName2.split(" ");
        for (int i = 0; i < nameArray2.length; i++) {
            if (nameArray2[i].contains("ё")) {
                nameArray2[i] = nameArray2[i].replace('ё', 'е');
            }
        }
        System.out.println("Данные ФИО сотрудника — " + String.join(" ", nameArray2));
        System.out.println();


    }

    private static void task2() {
        System.out.println("Задача 2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println();
    }

    private static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();
    }


}
