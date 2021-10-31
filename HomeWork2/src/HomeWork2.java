import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        example_1(5, 5);
        example_2();
        example_3(45);
        System.out.println();
        example_4("Hello World", 4);
        System.out.println();
        leapYear(400);
    }

    static boolean example_1(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void  example_2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число");
        int c = input.nextInt();

        if (c >= 0) {
            System.out.println(c + " - положительное число.");
        } else {
            System.out.println(c + " - отрицательное число.");
        }
    }

    static boolean example_3(int d) {
        if (d >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void example_4(String e, int f) {
        for (int i = 0; i < f; i++) {
            System.out.println(e);
        }
    }

    public static void leapYear(int g) {
        if (g % 4 == 0 && g % 100 != 0) {
            System.out.println(g + " - високосный год.");
        } else if (g % 400 == 0) {
            System.out.println(g + " - високосный год.");
        } else {
            System.out.println(g + " - не високосный год");
        }
    }
}