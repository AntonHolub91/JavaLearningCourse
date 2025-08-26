package lesson4_methods_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MyArrays {
    public static void main(String[] args) {
        showNumberIsInArray();
    }

    // 0 Создайте массив целых чисел. Напишете программу, которая выводит
    // сообщение о том, входит ли заданное число в массив или нет.
    // Пусть число для поиска задается с консоли (класс Scanner).

    public static void showNumberIsInArray() {
        int[] array = {0, 10, 22, -5, 12, 2, 3, 4, 44};
        Scanner scanner = new Scanner(System.in);
        OUTER:
        while (true) {
            System.out.print("Enter any number: ");
            int number = scanner.nextInt();
            INNER:
            for (int num : array) {
                if (num == number) {
                    System.out.println("Number " + number + " is presented in the array " + Arrays.toString(array));
                    break OUTER;
                }
            }
            System.out.println("Number " + number + " missing in the array");
        }
    }

    // 1 Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
    // Пусть число задается с консоли (класс Scanner). Если такого числа нет -
    // выведите сообщения об этом.
    // В результате должен быть новый массив без указанного числа.

    public static void deleteNumberFromArray() {
        int[] array = {1, 2, 3, 4, 5, 1, 1};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to delete from the array: ");
        int number = scanner.nextInt();
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Number " + number + " is missing in the array");
            System.out.println("Original array is " + Arrays.toString(array));
        } else {
            int[] newArray = new int[array.length - counter];
            int index = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != number) {
                    newArray[index] = array[i];
                    index++;
                }
            }
            System.out.println("Original array is " + Arrays.toString(array));
            System.out.println("New array is " + Arrays.toString(newArray));
        }
    }

    public static void deleteNumberFromArraySimplified() {
        int[] array = {1, 2, 3, 4, 5, 1, 1};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to delete from the array: ");
        int number = scanner.nextInt();
        if (Arrays.stream(array).filter(i -> i == number).count() == 0) {
            System.out.println("Number " + number + " is missing in the array");
            System.out.println("Original array is " + Arrays.toString(array));
        } else {
            int[] newArray = Arrays.stream(array).filter(i -> i != number).toArray();
            System.out.println("Original array is " + Arrays.toString(array));
            System.out.println("New array is " + Arrays.toString(newArray));
        }
    }

    // 2 Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
    // Для генерации случайного числа используйте метод Math.random().
    // Пусть будет возможность создавать массив произвольного размера.
    // Пусть размер массива вводится с консоли.

    public static void createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array) + " array was created");

        int maxNum = array[0];
        for (int num : array) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        System.out.println("Max value is " + maxNum);

        int minNum = array[0];
        for (int num : array) {
            if (num < minNum) {
                minNum = num;
            }
        }
        System.out.println("Min value is " + minNum);

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Average value is " + ((double) sum / array.length));
    }

    // 3 Создайте 2 массива из 5 чисел.
    // Выведите массивы на консоль в двух отдельных строках.
    // Посчитайте среднее арифметическое элементов каждого массива и сообщите,
    // для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).

    public static void compareTwoArrays() {
        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 100);
        }

        int[] array2 = new int[5];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 100);
        }
        System.out.println("1st array is " + Arrays.toString(array1));
        System.out.println("2nd array is " + Arrays.toString(array2));

        int sum1 = 0;
        for (int num : array1) {
            sum1 += num;
        }
        double average1 = (double) sum1 / array1.length;

        int sum2 = 0;
        for (int num : array2) {
            sum2 += num;
        }
        double average2 = (double) sum2 / array2.length;
        String output = (average1 > average2) ? "Average value of the 1st array is bigger" :
                (average2 > average1) ? "Average value of the 2nd array is bigger" :
                        "Average values of 1st and 2nd arrays are equal";
        System.out.println(output);
    }

    //Additional tasks
    // 4 Создайте массив из n случайных целых чисел и выведите его на экран.
    // Размер массива пусть задается с консоли и размер массива может быть больше 5 и меньше или равно 10
    // Если n не удовлетворяет условию - выведите сообщение об этом.
    // Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
    // Создайте второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.

    public static void createArrayWithLengthConditions() {
        Scanner scanner = new Scanner(System.in);
        int arrayLength;
        while (true) {
            System.out.print("Enter array length (possible values from 6 to 10): ");
            arrayLength = scanner.nextInt();
            if (arrayLength > 5 && arrayLength <= 10) {
                break;
            } else {
                System.out.println("You have entered invalid value. Try again.");
            }
        }
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array) + " array was created");

        int evenNumbersCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumbersCounter++;
            }
        }

        int[] arrayEven = new int[evenNumbersCounter];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayEven[index] = array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(arrayEven) + " array with only even numbers");
    }

    // 5 Создайте массив и заполните массив.
    // Выведите массив на экран в строку.
    // Замените каждый элемент с нечётным индексом на ноль.
    // Снова выведете массив на экран на отдельной строке.

    public static void createArrayAndReplaceOddToZero() {
        int[] array = new int[(int) (Math.random() * 20)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array) + " array was created");
        for (int i = 1; i < array.length; i = i + 2) {
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array) + " array was updated");
    }

    //    6 Создайте массив строк. Заполните его произвольными именами людей.
    //    Отсортируйте массив. Результат выведите на консоль.

    public static void sortArrayOfNames() {
        String[] names = {
                "Alex", "Maria", "John", "Sophie", "Michael",
                "Emma", "David", "Olivia", "Daniel", "Isabella"
        };
        Arrays.sort(names);
        System.out.println("Sorted array is " + Arrays.toString(names));
    }

    // 7.Реализуйте алгоритм сортировки пузырьком.
    // Сортировка пузырьком (bubble sort) - это простой алгоритм сортировки, который многократно проходит по списку,
    // сравнивая соседние элементы и меняя их местами, если они находятся в неправильном порядке.
    // Этот процесс повторяется до тех пор, пока весь список не будет отсортирован.

    public static void sortBubble() {
        int[] array = {6, 5, 3, 1, 8, 7, 2, 4};
        System.out.println("Original array is " + Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    int num = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = num;
                    System.out.println(array[j] + " swapped with " + array[j - 1] + ", updated array is " + Arrays.toString(array));
                }
            }
        }
    }
}