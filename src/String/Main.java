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


        String str = "aabccddefgghiijjkk";
        StringBuilder sb = new StringBuilder(str);
        String result = new String();

        for (int i = 0; i < str.length() - 1; i++) {
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                result += sb.charAt(i);
            }
        }
        System.out.println(result);


    }

    private static void task7() {
        System.out.println("Задача 7");
        String first = "135";
        String second = "246";
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < first.length(); i++) {
            sb1.append(first.charAt(i));
            sb1.append(second.charAt(i));
        }
        System.out.print("Данные строки — " + sb1);
        System.out.println();


        String str1 = "135667899";
        String str2 = "24666";
        StringBuilder strBuilder = new StringBuilder(str1);

        for (int i = 0, j = 1; i < str2.length(); i++) {
            strBuilder.insert(i + j, str2.charAt(i));
            if (strBuilder.length() > i + j) {
                j++;
            }
        }
        System.out.println("Данные строки — " + strBuilder);


        String string1 = "1357";
        String string2 = "2468";
        StringBuilder sb = new StringBuilder(string1);
        sb.append(string2);
        for (int i = 0; i < sb.length() - 1; i++) {
            for (int j = i + 1; j < sb.length(); j++) {
                if (Character.getNumericValue(sb.charAt(i)) > Character.getNumericValue(sb.charAt(j))) {
                    char tmp = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(j));
                    sb.setCharAt(j, tmp);
                }
            }
        }
        System.out.println("Данные строки — " + sb);

        String s1 = "135";
        String s2 = "246";
        char[] c = new char[s1.length() + s2.length()];
        for (int i = 0; i < s1.length(); i++) {
            var index = Character.digit(s1.charAt(i), 10);
            c[index - 1] = s1.charAt(i);
        }
        for (int i = 0; i < s2.length(); i++) {
            var index = Character.digit(s2.charAt(i), 10);
            c[index - 1] = s2.charAt(i);
        }
        System.out.println(new String(c));


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

//        String fullName = "ivanov ivan ivanovich";
//        char[] phrase;                                  // создаем пустой символьный массив
//        phrase = fullName.toCharArray();                //разбиваем фразу на символы и записываем в массив
//        phrase[0] = Character.toUpperCase(phrase[0]);   //первый символ массива делаем заглавным
//        for (int i = 0; i < phrase.length; i++) {       //перебирая все элементы массива,
//            if (phrase[i] == ' ') {                     //находим пробелы...
//                phrase[i + 1] = Character.toUpperCase(phrase[i + 1]);//и следующий за пробелом элемент делаем заглавным
//            }
//        }
//        String assembledPhrase = String.valueOf(phrase);//массив символов переписываем в строку
//        System.out.println(assembledPhrase);
//        System.out.println();
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

//        String fio = "Ivanov Ivan Ivanovich";
//        String nameFromFio;
//        String[] nameForms = new String[]{"Фамилия сотрудника — ", "Имя сотрудника — ", "Отчество сотрудника — "};
//        String[] names = new String[nameForms.length];
//        int whitespace = 0;
//
//        for (int i = 0; i < names.length; i++) {
//            whitespace = fio.indexOf(" ");                       //находим индекс первого пробела
//            if (whitespace != -1) {         //если пробелы во фразе еще есть, то выделяем слова и записываем в массив
//                nameFromFio = fio.substring(0, whitespace);       //записываем в переменную первое имя отделенное пробелом
//                names[i] = nameFromFio;                           //записываем имя в массив
//                fio = fio.substring(whitespace + 1);  //перезаписываем переменную fio с обрезанным первым словом
//                System.out.println(nameForms[i] + nameFromFio);  //выводим результат в цикле
//            } else {                //иначе фразу в которой осталось одно слово записываем в последний элемент массива
//             names[names.length - 1] = fio;
//        System.out.println(nameForms[nameForms.length -1] + names[names.length - 1]);  //выводим результат в цикле
//            }
//        }
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
