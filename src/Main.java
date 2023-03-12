public class Main {


    public static void toSquare(int number) {
        System.out.println(number * number);
    }

    public static int square(int number) {
        return number * number;
    }

    public static double pow(int number) {
        return Math.pow(number, 2);
    }

    public static void main(String[] args) {
        toSquare(10);
        System.out.println(square(10));
        System.out.println(pow(10));
    }


//
////    Напишите метод, который возводит число в квадрат.
//        System.out.println(toSquare(10));
//        square(10);
//        System.out.println(pow(10));
//
//    }
//
//    public static int toSquare(int number) {
//        return number * number;
//    }
//    public static void square(int number) {
//        System.out.println(number * number);
//    }
//    public static double pow(double number) {
//        return Math.pow(number, 2);
//    }


}