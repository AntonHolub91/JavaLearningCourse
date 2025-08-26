package lesson3_operators;

import java.util.Scanner;

public class MyOperators {
    public static void main(String[] args) {
        showFibonacciSequence();
    }

    // 1 Написать программу для вывода названия поры года по номеру месяца.
    // При решении используйте оператор switch-case.

    public static void showSeasonByMonthNumberSwitchCase1(int monthNumber) {
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Wrong month number is entered");
                break;
        }
    }

    public static void showSeasonByMonthNumberSwitchCase2(int monthNumber) {
        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
            default -> System.out.println("Wrong month number is entered");
        }
    }

    // 2 Написать программу для вывода названия поры года по номеру месяца.
    // При решении используйте оператор if-else-if.

    public static void showSeasonByMonthNumberIfElse(int monthNumber) {
        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
            System.out.println("Winter");
        } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
            System.out.println("Spring");
        } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            System.out.println("Summer");
        } else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Wrong month number is entered");
        }
    }

    // 3 Напишите программу, которая будет принимать на вход число и на выход будет выводить
    // сообщение четное число или нет. Для определения четности числа используйте операцию
    // получения остатка от деления - операция выглядит так: '% 2').

    public static void showEvenOrOdd(int num) {
        System.out.println("The number is " + ((num % 2 == 0) ? "even" : "odd"));
    }

    // 4 Для введенного числа t (температура на улице) вывести Если t>–5, то вывести «Тепло».
    // Если –5>= t > –20, то вывести «Нормально». Если –20>= t, то вывести «Холодно».

    public static void showTemperature(int t) {
        if (t > -5) {
            System.out.println("Тепло");
        } else if (t > -20 && t <= -5) {
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }
    }

    //5 По введенному номеру определить цвет радуги (1 – красный, 4 – зеленый и т. д.).

    public static void showRainbowColor(int num) {
        switch (num) {
            case 1 -> System.out.println("Red");
            case 2 -> System.out.println("Orange");
            case 3 -> System.out.println("Yellow");
            case 4 -> System.out.println("Green");
            case 5 -> System.out.println("Light blue");
            case 6 -> System.out.println("Blue");
            case 7 -> System.out.println("Purple");
            default -> System.out.println("Color number is out of scope");
        }
    }

    //Loops
    // 1 При помощи цикла for вывести на экран нечетные числа от 1 до 99
    // При решении используйте операцию инкремента (++).

    public static void showOddNumbers1() {
        for (int i = 1; i < 100; i++, i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void showOddNumbers2() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // 2 Необходимо вывести на экран числа от 5 до 1
    // При решении используйте операцию декремента (--).

    public static void showNumbers() {
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 3 Напишите программу, где пользователь вводит любое целое положительное число.
    // А программа суммирует все числа от 1 до введенного пользователем числа.
    // Для ввода числа воспользуйтесь классом Scanner.

    public static void showSum() {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        System.out.println("Sum of all numbers from 1 to " + num + " is " + result);
    }

    //4 Необходимо, чтоб программа выводила на экран вот такую последовательность:
    // 7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.

    public static void displayNumbers() {
        int num = 7;
        while (num <= 98) {
            System.out.print(num + " ");
            num += 7;
        }
        System.out.println();
    }

    // 5 Вывести 10 первых чисел последовательности 0, -5,-10,-15..

    public static void displayFirstTenNumbers() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print(value + " ");
            value -= 5;
        }
        System.out.println();
    }

    // 6 Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.

    public static void showSquare() {
        for (int i = 10; i <= 20; i++) {
            System.out.println(i * i);
        }
    }

    // Additional tasks
    // 1 Выведите на экран первые 11 членов последовательности Фибоначчи. 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

    public static void showFibonacciSequence() {
        int first = 0;
        int second = 1;
        int result = 0;
        System.out.println(first);
        System.out.println(second);
        for (int i = 0; i < 9; i++) {
            System.out.println(first + second);
            result = first + second;
            first = second;
            second = result;
        }
    }

    // 2 За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите программу,
    // в которую пользователь вводит сумму вклада и количество месяцев. А банк вычисляет конечную сумму
    // вклада с учетом начисления процентов за каждый месяц. Для вычисления суммы с учетом процентов
    // используйте цикл for. Пусть сумма вклада будет представлять тип float.

    public static void calculateBankPercents() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter deposit sum in $: ");
        float deposit = scanner.nextFloat();
        System.out.print("Enter number of months: ");
        int months = scanner.nextInt();
        for (int i = 1; i <= months; i++) {
            deposit = (float) (deposit * 1.07);
        }
        float roundedResult = (float) ((Math.round(deposit * 100)) / 100.0);
        System.out.println("After " + months + " months deposit + bank percents equals " + roundedResult + "$");
    }

    // 3 Напишите программу, которая выводит на консоль таблицу умножения.

    public static void showMultiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j * i + " ");
            }
            System.out.println();
        }
    }
}