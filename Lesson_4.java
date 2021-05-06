import java.util.Random;
import java.util.Scanner;

public class Lesson_4 {
    public static char[][] map;              //двойной массив с именем "map" (матрица)
    public static final int SIZE = 3;        //неизменяемая переменная - размер массива map
    public static final int DOTS_TO_WIN = 3; //кол-во меток, чтобы выиграть
    public static final char DOT_EMPTY = '+';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkToWin(DOT_X)) {
                System.out.println("Победил Человек");
                break;
            }
            else if (isMapFull()) {
                System.out.println("Карта заполнена, нет свободных ячеек для хода");
                break;
            }
            aiTurn();
            printMap();
            if (checkToWin(DOT_O)) {
                System.out.println("Победил AI");
                break;
            }
            else if (isMapFull()) {
                System.out.println("Карта заполнена, нет свободных ячеек для хода");
                break;
            }
        }
    }

    public static void initMap() {       //заполнение массива точками
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++)  {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i < SIZE + 1; i++) {
            if (i == 0)
                System.out.print("  ");
            else
                System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++)  {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = scan.nextInt() - 1;
            y = scan.nextInt() - 1;
        } while(!isCellValid(x, y));
        map[y][x] = DOT_X;

    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE)
            return false;
        else if (map[y][x] == DOT_EMPTY)
            return true;
        else
            return false;
    }

    public static void aiTurn() {
        Random randomizer = new Random();
        int x;
        int y;
        do {
            x = randomizer.nextInt(SIZE);
            y = randomizer.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean checkToWin(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            if (map[i][0] == symbol && map[i][1] == symbol && map[i][2] == symbol)
            return true;
        }
        for (int j = 0; j < SIZE; j++) {
            if (map[0][j] == symbol && map[1][j] == symbol && map[2][j] == symbol)
            return true;
        }
        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) return true;
        else if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol) return true;
        else return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }
}
