package lesson10_excep_strings.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WorkWithStrings {
    // 1 Написать программу со следующим функционалом:
    // На вход передать строку (будем считать, что это номер документа).
    // Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.
    // Все эти методы реализовать в отдельном классе в статических методах, которые на вход (входным параметром)
    // будут принимать вводимую на вход программы строку.


    // - Вывести на экран в одну строку два первых блока по 4 цифры. DONE

    public static void showFirstTwoBlocks(String docNumber) {
        String result = docNumber.substring(0, 5) + docNumber.substring(9, 13);
        System.out.println(result);
    }

    // - Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *). DONE

    public static void hideLetters(String docNumber) {
        String result = docNumber;
        String[] array = docNumber.split("-");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == 3) {
                result = result.replace(array[i], "***");
            }
        }
        System.out.println(docNumber);
        System.out.println(result);
    }

    // Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре. DONE

    public static void showOnlyLetters1(String docNumber) {
        System.out.println(
                (docNumber.substring(5, 8) + "/" + docNumber.substring(14, 17) + "/" + docNumber.charAt(19) + "/" +
                        docNumber.charAt(21)).toLowerCase()
        );
    }

    // - Вывести на экран буквы из номера документа  в формате "Letters:yyy/yyy/y/y" в верхнем регистре DONE
    // (реализовать с помощью  класса StringBuilder).

    public static void showOnlyLetters2(String docNumber) {
        StringBuilder docNum = new StringBuilder(docNumber);
        docNum.delete(0, 5).delete(4, 9).deleteCharAt(8).replace(9, 10, "-");
        for (int i = 0; i < docNum.length(); i++) {
            docNum.replace(i, i + 1, (docNum.substring(i, i + 1).toUpperCase()));
            if (docNum.charAt(i) == '-') {
                docNum.replace(i, i + 1, "/");
            }
        }
        docNum.insert(0, "Letters:");
        System.out.println(docNum);
    }

    // - Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет DONE
    // (причем, abc и ABC считается одинаковой последовательностью).

    public static void checkDocContainsSubstring(String docNumber) {
        boolean result = docNumber.toLowerCase().contains("abc");
        if (result) {
            System.out.println("Document number contains 'abc'");
        } else {
            System.out.println("Document number does not contain 'abc'");
        }
    }

    // - Проверить начинается ли номер документа с последовательности 555 DONE

    public static void checkDocStart(String docNumber) {
        boolean result = docNumber.startsWith("555");
        if (result) {
            System.out.println("Document number starts with '555'");
        } else {
            System.out.println("Document number does not start with '555'");
        }
    }

    // - Проверить заканчивается ли номер документа на последовательность 1a2b. DONE

    public static void checkDocEnd(String docNumber) {
        boolean result = docNumber.endsWith("1a2b");
        if (result) {
            System.out.println("Document number ends with '1a2b'");
        } else {
            System.out.println("Document number does not ends with '1a2b'");
        }
    }

    // 2 Дана строка произвольной длины с произвольными словами. DONE
    // Найти самое короткое слово в строке и вывести его на экран.
    // Найти самое длинное слово в строке и вывести его на экран.
    // Если таких слов несколько, то вывести последнее из них.

    public static void findShortestAndLongestWords(String words) {
        String[] wordsArray = words.split(" ");

        String minLengthWord = wordsArray[0];
        String maxLengthWord = wordsArray[0];

        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsArray[i].length() <= minLengthWord.length()) {
                minLengthWord = wordsArray[i];
            }
            if (wordsArray[i].length() >= maxLengthWord.length()) {
                maxLengthWord = wordsArray[i];
            }
        }

        System.out.println("The shortest word in the list is: " + minLengthWord);
        System.out.println("The longest word in the list is: " + maxLengthWord);
    }

    // 3 Дана строка произвольной длины с произвольными словами. DONE
    // Найти слово, в котором число различных символов минимально.
    // Слово может содержать буквы и цифры. Если таких слов несколько, найти первое из них.
    // Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".

    public static void checkWordWithMinSymbols(String words) {
        String[] wordsArray = words.split(" ");

        // Счиатю, сколько в каждом слове уникальных символов и сохраняю эти подсчеты в массив int[] counters
        int[] counters = new int[wordsArray.length];
        String uniqueLetters = "";
        for (int i = 0; i < wordsArray.length; i++) {
            for (int j = 0; j < wordsArray[i].length(); j++) {
                if (!uniqueLetters.contains(wordsArray[i].substring(j, j + 1))) {
                    uniqueLetters = uniqueLetters + wordsArray[i].substring(j, j + 1);
                }
            }
            counters[i] = uniqueLetters.length();
            uniqueLetters = "";
        }

        // ищу индекс первого найденного слова с минимальным кол-вом символов
        int indexOfMin = 0;
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < counters[indexOfMin]) {
                indexOfMin = i;
            }
        }
        System.out.println("The word with the lowest number of symbols is " + wordsArray[indexOfMin]);
    }

    // 4 Дана строка произвольной длины с произвольными словами. DONE
    // Написать программу для проверки является ли любое выбранное слово в строке палиндромом.
    // Например, есть строка, вводится число 3, необходимо проверит является ли 3-е слово в этой строке палиндромом.

    public static void checkIsPalindrome(String words) {
        String[] wordsArray = words.split(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word number (from 1 to " + wordsArray.length + "): ");
        int num = scanner.nextInt();

        try {
            String selectedWord = wordsArray[num - 1].toLowerCase();
            boolean isPalindrome = true;

            for (int i = 0; i < selectedWord.length(); i++) {
                if (selectedWord.charAt(i) != selectedWord.charAt(selectedWord.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
            System.out.println(selectedWord + ((isPalindrome) ? " is palindrome." : " is not palindrome."));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You have entered a wrong number. Restart the program and try one more time.");
        }
    }

    // 5 Дана произвольная строка. DONE
    // Вывести на консоль новую строку, которой задублирована каждая буква из начальной строки.
    // Например, "Hello" -> "HHeelllloo".

    public static void duplicateLettersString(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result = result + word.charAt(i) + word.charAt(i);
        }
        System.out.println(result);
    }

    public static void duplicateLettersStringBuilder(String word) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            result.append(word.charAt(i)).append(word.charAt(i));
        }
        System.out.println(result);
    }

    // Method to create a file and to get its value

    public static String getDocNumber() throws FileNotFoundException {
        File file = new File("src/lesson10_excep_strings/homework/doc.txt");
        Scanner scanner = new Scanner(file);
        return scanner.nextLine();
    }
}