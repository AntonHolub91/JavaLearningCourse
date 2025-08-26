package lesson5_multidimensional_array;

import java.util.Arrays;
import java.util.Scanner;

public class MyHomework {
    public static void main(String[] args) {
        sortInternalArrays();
    }

    // 0 Создать трехмерный массив из целых чисел.
    // С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на
    // заданное число. Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.

    public static void changeArrayValues() {
        int[][][] array = {{{0, 1}, {2, 3, 4}}, {{5, 6}, {7, 8}}, {{9}}};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value to increase numbers in the array: ");
        int number = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += number;
                    System.out.println(array[i][j][k] + "\t");
                }
            }
        }
        scanner.close();
    }

    // 1 Шахматная доска
    // Создать программу для раскраски шахматной доски с помощью цикла.
    // Создать двумерный массив String'ов 8х8. С помощью циклов задать элементам
    // циклам значения B(Black) или W(White). Результат работы программы:
    //    W B W B W B W B
    //    B W B W B W B W
    //    W B W B W B W B
    //    B W B W B W B W
    //    W B W B W B W B
    //    B W B W B W B W
    //    W B W B W B W B
    //    B W B W B W B W

    public static void chessField() {
        String[][] chess = new String[8][8];
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                if (i % 2 == 0) {
                    chess[i][j] = (j % 2 == 0) ? "W" : "B";
                } else {
                    chess[i][j] = (j % 2 == 0) ? "B" : "W";
                }
                System.out.print(chess[i][j] + "  ");
            }
            System.out.println();
        }
    }

    //additional tasks
    // 2 Умножение двух матриц
    // Создайте два массива целых чисел размером 3х3 (две матрицы).
    // Напишите программу для умножения двух матриц.
    // Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
    // Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
    // Ожидаемый результат: 1 2 3 1 1 1 0 0 0

    public static void multiplyMatrix() {
        int[][] array1 = {{1, 0, 2}, {3, 1, 0}, {1, 2, 2}};
        int[][] array2 = {{0, 1, 3}, {2, 2, 1}, {1, 2, 3}};

//        int[][] array1 = {{1, 2}, {3, 4}};
//        int[][] array2 = {{5, 6}, {7, 8}};

        int[][] resultArray = new int[array1.length][array1[0].length];

        for (int i = 0; i < array1.length; i++) {
            for (int k = 0; k < array2[0].length; k++) {
                int sum = 0;
                for (int j = 0; j < array1[0].length; j++) {
                    sum += array1[i][j] * array2[j][k];
                }
                resultArray[i][k] = sum;
            }
        }

        for (int[] array : resultArray) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // 3 Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов массива.

    public static void sumOfArrayValues() {
        int[][] arrays = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        int sum = 0;
        for (int[] array : arrays) {
            for (int value : array) {
                sum += value;
            }
        }
        System.out.println(sum);
    }

    // 4 Создайте двумерный массив. Выведите на консоль диагонали массива.

    public static void diagonali() {
        int[][] array = {{1, 2, 3,4,5}, {6, 7, 8,9,10}, {11,12,13,14,15}, {16, 17, 18,19,20}, {21, 22, 23,24,25}};
        if (array.length < 2) {
            System.out.println("The array doesn't have diagonals");
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.println("  ".repeat(i) + array[i][i]);
            }
            System.out.println("-".repeat(10));

            for (int i = 0; i < array.length; i++) {
                System.out.println("  ".repeat(array.length - i - 1) + array[i][array.length-i-1]);
            }
        }
    }

    // 5 Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по возрастанию.

    public static void sortInternalArrays() {
        int[][] arrays = {{3, 2, 1}, {6, 4, 5}, {9, 7, 8}};
        for (int[] array : arrays) {
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
        }
    }
}