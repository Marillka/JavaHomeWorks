import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
//        zeroToOne();// 1

//        fromOneToHundred(); // 2

//        lessThenSix(); // 3

//        drawDiagonals();// 4

//        createArray(15, 9); // 5

//        minAndMax();// 6



    }



    private static void minAndMax() {
        int[] arr = {45, -23, 43, 68, -530, 5343, 34, 3455, 1345, 985};

        int max, min;
        max = min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("Минимальное " + min);
        System.out.println("Максимальное " + max);
    }

    public static void createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));

    }

    private static void drawDiagonals() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length ; i++) {
            arr[i][i] = 1;
        }

        int i = 0;
        int j = arr.length - 1;

        for (; i < arr.length && j >= 0; i++, j--) {
            arr[i][j] = 1;
        }

        System.out.println(Arrays.deepToString(arr));
    }

    private static void lessThenSix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void fromOneToHundred() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void zeroToOne() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                arr[i] = 0;
            } else if(arr[i] == 0) {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
