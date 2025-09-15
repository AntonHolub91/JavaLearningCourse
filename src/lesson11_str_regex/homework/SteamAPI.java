package lesson11_str_regex.homework;

import java.util.ArrayList;
import java.util.Random;

public class SteamAPI {

    public static void main(String[] args) {
        ArrayList<Integer> ar = createArrayList(25);
        deleteDuplicates(ar);
        showAllEvenInRange(ar);
        multiplyElements(ar);
        sortAndShowFirstFour(ar);
        showElementsCount(ar);
        showAverage(ar);
    }

    public static ArrayList<Integer> createArrayList(int numberOfElements) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < numberOfElements; i++) {
            arrayList.add(new Random().nextInt(0, 20));
        }
        System.out.println(arrayList);
        return arrayList;
    }

    public static void deleteDuplicates(ArrayList<Integer> arrayList) {
        System.out.println(arrayList.stream().distinct().toList());
    }

    public static void showAllEvenInRange(ArrayList<Integer> arrayList) {
        System.out.println(arrayList.stream().filter(i -> i % 2 == 0 && i >= 7 && i <= 17).toList());
    }

    public static void multiplyElements(ArrayList<Integer> arrayList) {
        System.out.println(arrayList.stream().map(i -> i * 2).toList());
    }

    public static void sortAndShowFirstFour(ArrayList<Integer> arrayList) {
        System.out.println(arrayList.stream().sorted().limit(4).toList());
    }

    public static void showElementsCount(ArrayList<Integer> arrayList) {
        System.out.println(arrayList.stream().count());
    }

    public static void showAverage(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (Integer i : arrayList) {
            sum += i;
        }
        System.out.println((double) sum / arrayList.stream().count());
    }
}