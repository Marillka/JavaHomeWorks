import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
public class HomeWork4 {// Крестики нолики 5x5 4 подряд

    private static final char DOT_X = 'X';// символ крестик
    private static final char DOT_0 = '0';// символ нолик
    private static final char DOT_EMPTY = '.';// символ пустой ячейки
    private static char[][] field;// игровое поле
    private static char dotHuman;// символ игрока
    private static char dotAi;// символ компа
    private static int fieldSizeX;// размер поля
    private static int fieldSizeY;// размер поля
    private static final Scanner scanner = new Scanner(System.in);// сканер
    private static final Random random = new Random();// рандом
    private static int scoreHuman;// очки кожанного
    private static int scoreAI;// очки компа
    private static int roundCounter;// счетчик раундов
    private static int symbolsForVictory = 4;// подряд символов для победы


    public static void main(String[] args) {
        play();
    }

    private static void play() {
        while (true) {
            chooseTheDot();
            playRound();
            System.out.printf("SCORE:   HUMAN     AI\n" +
                    "           %d        %d\n", scoreHuman, scoreAI);
            System.out.print("Wanna play again? Y or any key to exit >>> ");
            if (!scanner.next().toLowerCase().equals("y")) {
                System.out.println("Good bye");
                break;
            }
        }
    }

    private static void chooseTheDot() {
        System.out.print("If you want to play with 'X' then enter 'X' otherwise enter anything >>> ");
        if (scanner.next().toLowerCase().equals("x")) {
            dotHuman = DOT_X;
            dotAi = DOT_0;
        } else {
            dotHuman = DOT_0;
            dotAi = DOT_X;
        }
    }


    private static void playRound() {
        System.out.printf("ROUND %d START\n", ++roundCounter);
        initField(5, 5);
        printField();

        if (dotHuman == DOT_X) {
            humanFirstTurn();
        } else {
            aiFirstTurn();
        }
    }

    private static void aiFirstTurn() {
        while (true) {
            aiTurn();
            printField();
            if (checkGame(dotAi)) break;

            humanTurn();
            printField();
            if (checkGame(dotHuman)) break;
        }
    }

    private static void humanFirstTurn() {
        while (true) {
            humanTurn();
            printField();
            if (checkGame(dotHuman)) break;

            aiTurn();
            printField();
            if (checkGame(dotAi)) break;
        }
    }


    private static boolean checkGame(char dot) {
        if (checkWin(dot)) {
            if (dot == dotHuman) {
                System.out.println("Human win!!!");
                scoreHuman++;
            } else {
                System.out.println("AI win!!!");
                scoreAI++;
            }
            return true;
        }
        if (checkDraw()) return true;
        return false;
    }

    private static void aiTurn() {
        int x;
        int y;

        do {
            x = random.nextInt(fieldSizeX);
            y = random.nextInt(fieldSizeY);
        } while (!isCellEmpty(y, x));
        field[y][x] = dotAi;
    }

    private static void humanTurn() {
        int x;
        int y;

        do {
            System.out.print("Please enter coordinates of your turn X and Y split by whitespace >>> ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y, x) || !isCellEmpty(y, x));
        field[y][x] = dotHuman;
    }

    private static boolean checkWin(char dot) {
        /* для поля 5x5 с 4 символами подряд будет:
        5 горизонтальных и 5 вертикальных линий,
        2 основные диагонали длинной по 5,
        4 диагонали длинной по 4
        */



        for (int i = 0,a = 0, b = 0; i < fieldSizeY; i++) {// горизонтали
            for (int j = 0; j < fieldSizeX; j++) {
                if (field[i][j] == DOT_X) a++;
                if (field[i][j] == DOT_0) b++;
                if (a == symbolsForVictory || b == symbolsForVictory) return true;
            }
        }

        for (int i = 0,a = 0, b = 0; i < fieldSizeY; i++) {// вертикали
            for (int j = 0; j < fieldSizeX; j++) {
                if (field[j][i] == DOT_X) a++;
                if (field[j][i] == DOT_0) b++;
                if (a == symbolsForVictory || b == symbolsForVictory) return true;
            }
        }


        for (int i = 0,a = 0, b = 0; i < fieldSizeY; i++) {// первая основная диагональ
            if (field[i][i] == DOT_X) a++;
            if (field[i][i] == DOT_0) b++;
            if (a == symbolsForVictory || b == symbolsForVictory) return true;

        }

        for (int i = 0, j = 4, a = 0, b = 0; i < fieldSizeY && j >= 0; i++, j--) {// вторая основная диагональ
            if (field[i][j] == DOT_X) a++;
            if (field[i][j] == DOT_0) b++;
            if (a == symbolsForVictory || b == symbolsForVictory) return true;

        }

        for (int i = 0, j = 1, a = 0, b = 0; i < 4 && j < 5 ; i++, j++) {// второстепенная диагональ
            if (field[i][j] == DOT_X) a++;
            if (field[i][j] == DOT_0) b++;
            if (a == symbolsForVictory || b == symbolsForVictory) return true;

        }

        for (int i = 1, j = 0, a = 0, b = 0; i < 5 && j < 4 ; i++, j++) {// второстепенная диагональ
            if (field[i][j] == DOT_X) a++;
            if (field[i][j] == DOT_0) b++;
            if (a == symbolsForVictory || b == symbolsForVictory) return true;

        }

        for (int i = 0, j = 3,a = 0, b = 0; i < 4 && j >= 0  ; i++, j--) {// второстепенная диагональ
            if (field[i][j] == DOT_X) a++;
            if (field[i][j] == DOT_0) b++;
            if (a == symbolsForVictory || b == symbolsForVictory) return true;

        }

        for (int i = 1, j = 4, a = 0, b = 0; i < 5 && j > 0  ; i++, j--) {// второстепенная диагональ
            if (field[i][j] == DOT_X) a++;
            if (field[i][j] == DOT_0) b++;
            if (a == symbolsForVictory || b == symbolsForVictory) return true;

        }
        return false;


    }

        private static boolean checkDraw () {
            for (int y = 0; y < fieldSizeY; y++) {
                for (int x = 0; x < fieldSizeX; x++) {
                    if (isCellEmpty(y, x)) return false;
                }
            }
            System.out.println("It's DRAW!!!");
            return true;
        }

        private static boolean isCellEmpty ( int y, int x){
            return field[y][x] == DOT_EMPTY;
        }

        private static boolean isCellValid ( int y, int x){
            return (x >= 0) && (y >= 0) && (x < fieldSizeX) && (y < fieldSizeY);
        }

        private static void initField ( int sizeX, int sizeY){
            fieldSizeX = sizeX;
            fieldSizeY = sizeY;

            field = new char[fieldSizeY][fieldSizeX];
            for (int y = 0; y < fieldSizeY; y++) {
                for (int x = 0; x < fieldSizeX; x++) {
                    field[y][x] = DOT_EMPTY;
                }
            }
        }

        private static void printField () {
            System.out.print("*");
            for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
                System.out.print(i % 2 == 0 ? "-" : i / 2 + 1);
            }
            System.out.println();

            for (int i = 0; i < fieldSizeY; i++) {
                System.out.print(i + 1 + "|");
                for (int j = 0; j < fieldSizeX; j++) {
                    System.out.print(field[i][j] + "|");
                }
                System.out.println();
            }

            System.out.println("----------------");
        }

    }
