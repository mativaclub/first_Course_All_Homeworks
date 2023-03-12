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
}