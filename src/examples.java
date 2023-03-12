public class examples {

    public class Main {
        public static void main(String[] args) {

//Когда применяется цикл while
//1. Цикл с предусловием, выполняет свой блок кода, пока условие истинно.Условием может быть любое логическое выражение
//2. Ипользуется, когда надо сделать действия, но число повторений заранее неизвестно или же нам не нужен счетчик.
//3. Есть возможность, что цикл не выполнится ни разу, если условие будет ложным.
//4. Когда условие становится ложным, управление передаётся строке кода, которая идёт после цикла
//5.Не сильно отличается от цикла for — не имеет начального действия и действия после итерации,а содержит лишь условие
//6.В отличие от for, в цикле while нельзя не указывать <условие выполнения цикла>,

// Для чего применяется метод toString
//Используется когда надо преобразует число в строку, для приведения нашего объекта к строковому виду.
//должны вернуть строку в том формате, в котором хотим видеть наш объект в печати.
//toString() определен в классе java.lang.Object и его реализация по умолчанию не предоставляет много информации,
// всегда лучшей практикой является переопределение данного метода в классе-потомке для получения желаемого
// строкового представления.

            //Что такое область видимости?
// Применяются к локальным переменным и к переменным класса
//Область видимости локальным переменной — это такая область кода, в которой обьявлена эта переменная.
//Если переменная объявляется в теле метода, или аргумент метода, она исчезает после завершения работы этого метода
// и не могут быть доступны из других блоков кода
//Наприммер в цикле обьявляем переменную и область видимости ограничивается фигурными скобками данного цикла.
            // Переменные обьявленные внутри блока кода не видны снаружи, но переменные которые находяться снаруи блока
            // кода видны внутри этого блока кода
//4. Переменные класса/объекта существуют все время жизни содержащего их объекта. Их видимость
// дополнительно регулируется специальными модификаторами доступа: public, private klass,
// protected naslednik, default v pakete.


//    | 1 | Дайте определение переменной. Перечислите типы переменных и хранимые в них данные |
//    | 2 | Какие условные операторы вы знаете? Дайте краткое определение каждому из них. |
//    | 3 | Какие циклы вы знаете, в чем их отличия? |
//    | 4 | Какие есть способы создания объекта String? Где он создается? |
//    | 5 | Как сравнить две строки в Java и/или отсортировать их? |
//    | 6 | Расскажите про String в Java |
//    | 7 | Когда применяется цикл while? |
//    | 8 | Методы каких типов бывают? Приведите примеры использования каждого типа. |
//    | 9 | Что такое массив? |
//    | 10 | Почему доступ по элементу в массиве происходит за O(1)? |
//    | 11 | Дайте определение классу в Java.  |
//    | 12 | Когда применяется ключевое слово this? |
//    | 13 | В чем разница между == и equals()? |
//    | 14 | Для чего применяется метод toString? |
//    | 15 | Какие методы называются геттерами? Что они делают? |
//    | 16 | Дайте определение сеттерам. Расскажите, для чего они нужны? |
//    | 17 | Что такое конструкторы? |
//    | 18 | Что такое сигнатура метода? |
//    | 19 | Какая функция у оператора return? |
//    | 20 | Что такое область видимости? |
//


//        - 1 билет
//
//    Дайте определение переменной. Перечислите типы переменных и хранимые в них данные.
//
//    Методы каких типов бывают? Приведите примеры использования каждого типа.
//
//    Какие методы называются геттерами? Что они делают?
//
//    - Задача
//
//        Напишите программу, которая переворачивает массив.
//
//- 2 билет
//
//    Какие условные операторы вы знаете? Дайте краткое определение каждому из них.
//
//    Что такое массив?
//
//    Дайте определение сеттерам. Расскажите, для чего они нужны?
//
//    - Задача
//
//        Напишите программу, которая проверяет, является ли строка палиндромом.
//
//- 3 билет
//
//    Какие циклы вы знаете, в чем их отличия?
//
//    Что такое конструкторы?
//
//    - Задача
//
//        Напишите программу, которая разделяет любую строку на две части ровно пополам по количеству символов.
//
//- 4 билет
//
//    Какие есть способы создания объекта String? Где он создается?
//
//    Дайте определение классу в Java.
//
//    - Задача
//
//        Дан массив строк, необходимо удалить из него все дубли, оставшиеся строки
//        объединить в одну в порядке следования в массиве.
//
//- 5 билет
//
//    Как сравнить две строки в Java и/или отсортировать их?
//
//    Когда применяется ключевое слово this?
//
//    Что такое сигнатура метода?
//
//    - Задача
//
//        Дан массив пар названий книг и авторов, необходимо привести каждую пару в
//        строку вида: «Название книги» И. О. Автора.
//
//- 6 билет
//
//    Расскажите про String в Java.
//
//    В чем разница между == и equals()?
//
//    Какая функция у оператора **return?**
//
//    - Задача
//
//        Необходимо реализовать следующий метод:
//
//        1. Получаем на входе массив чисел.
//
//        2. Все четные числа увеличиваем на единицу.
//
//        3. Возвращаем кусок списка с 3-го по 7-й элемент.
//
//- 7 билет
//
//    Когда применяется цикл while?
//
//    Для чего применяется метод toString**?**
//
//    Что такое область видимости?
//
//    - Задача
//
//        Напишите метод, который возводит число в квадрат.


        }
    }
}