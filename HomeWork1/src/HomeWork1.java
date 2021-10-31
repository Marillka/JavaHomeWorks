public class HomeWork1 {

    public static void main(String[] args) {
        printThreeWords();
        printColor();
        compareNumbers();
    }

    public static void printColor() {
        int value = 10;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void compareNumbers() {
        int a = 50;
        int b = 75;

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        }
    }
}